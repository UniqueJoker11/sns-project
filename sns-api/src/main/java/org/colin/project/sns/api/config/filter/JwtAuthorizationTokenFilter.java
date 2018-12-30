package org.colin.project.sns.api.config.filter;

import io.jsonwebtoken.ExpiredJwtException;
import org.colin.project.sns.api.config.security.JwtTokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtAuthorizationTokenFilter extends OncePerRequestFilter
{

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	private final UserDetailsService userDetailsService;
	private final JwtTokenUtil jwtTokenUtil;
	private final String tokenHeader;

	/**
	 * 采用构造器注入
	 *
	 * @param userDetailsService
	 * @param jwtTokenUtil
	 * @param tokenHeader
	 */
	public JwtAuthorizationTokenFilter(UserDetailsService userDetailsService, JwtTokenUtil jwtTokenUtil,
			@Value("${jwt.header}") String tokenHeader)
	{
		this.userDetailsService = userDetailsService;
		this.jwtTokenUtil = jwtTokenUtil;
		this.tokenHeader = tokenHeader;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException
	{
		//处理身份验证
		logger.debug("processing authentication for '{}'", request.getRequestURL());

		final String requestHeader = request.getHeader(this.tokenHeader);
		//用户名
		String username = null;
		//用户Token
		String authToken = null;
        //自定义
		if (requestHeader != null && requestHeader.startsWith("Bearer "))
		{
			authToken = requestHeader.substring(7);
			try
			{
				username = jwtTokenUtil.getUsernameFromToken(authToken);
			}
			catch (IllegalArgumentException e)
			{
				logger.error("an error occured during getting username from token", e);
			}
			catch (ExpiredJwtException e)
			{
				logger.warn("the token is expired and not valid anymore", e);
			}
		}
		else
		{
			logger.warn("couldn't find bearer string, will ignore the header");
		}

		logger.debug("checking authentication for user '{}'", username);

		if (username != null && SecurityContextHolder.getContext().getAuthentication() == null)
		{
			logger.debug("security context was null, so authorizating user");

			// It is not compelling necessary to load the use details from the database. You could also store the information in the token and read it from it. It's up to you ;)
			//从数据库加载使用细节并不十分迫切。 您还可以将信息存储在令牌中并从中读取。 由你决定 ;
			UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);

			// For simple validation it is completely sufficient to just check the token integrity. You don't have to call the database compellingly. Again it's up to you ;)
			//对于简单的验证，仅检查令牌完整性就足够了。 您无需令人信服地调用数据库。 再次取决于你
			if (jwtTokenUtil.validateToken(authToken, userDetails))
			{
				UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken( userDetails, null, userDetails.getAuthorities());
				authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				logger.info("authorizated user '{}', setting security context", username);
				SecurityContextHolder.getContext().setAuthentication(authentication);
			}
		}

		chain.doFilter(request, response);
	}
}
