package org.colin.project.sns.api.config;

import org.colin.project.sns.api.config.security.JwtAuthenticationEntryPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * @author hzlinqiang
 * @Title WebSecurityConfig.java
 * @Package org.colin.project.api.config
 * @Description 类描述
 * @date 2018-12-27 14:43
 * @since [产品/模块版本] （可选）
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private JwtAuthenticationEntryPoint unauthorizedHandler;

    @Autowired
    private JwtUserDetailsService jwtUserDetailsService;

    // Custom JWT based security filter
    @Autowired
    JwtAuthorizationTokenFilter authenticationTokenFilter;

    @Value("${jwt.header}")
    private String tokenHeader;

    /**
     * 认证需要忽略的路径
     */
    @Value("${jwt.route.authentication.path}")
    private String authenticationPath;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(jwtUserDetailsService)
                .passwordEncoder(passwordEncoderBean());
    }

    @Bean
    public PasswordEncoder passwordEncoderBean() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                // 我们不需要CSRF，因为我们的令牌是无懈可击的
                .csrf().disable()

                //异常处理
                .exceptionHandling()

                //验证入口点
                .authenticationEntryPoint(unauthorizedHandler).and()

                // 不能创建session
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()

                //授权请求
                .authorizeRequests()

                // Un-secure H2 Database
                //.antMatchers("/h2-console/**/**").permitAll()

                .antMatchers("/auth/**").permitAll()

                //请求认证
                .anyRequest().authenticated();

        httpSecurity
                .addFilterBefore(authenticationTokenFilter, UsernamePasswordAuthenticationFilter.class);

        // 不允许页面缓存
        httpSecurity
                .headers()
                .frameOptions().sameOrigin()  // required to set for H2 else H2 Console will be blank.
                .cacheControl();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        // AuthenticationTokenFilter 将要忽略以下的路径
        web.ignoring()
                .antMatchers(HttpMethod.POST, authenticationPath)
                // allow anonymous resource requests
                .and()
                .ignoring()
                .antMatchers(HttpMethod.GET, "/","/*.html","/favicon.ico","/**/*.html","/**/*.css","/**/*.js");
                // Un-secure H2 Database (for testing purposes, H2 console shouldn't be unprotected in production)
                /*.and()
                .ignoring()
                .antMatchers("/h2-console/");*/
    }
}
