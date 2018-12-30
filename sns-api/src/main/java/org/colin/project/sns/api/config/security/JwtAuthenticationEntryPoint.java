package org.colin.project.sns.api.config.security;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

/**
 * @author hzlinqiang
 * @Title JwtAuthenticationEntryPoint.java
 * @Package org.colin.project.api.config.security
 * @Description JWT认证入口
 * @date 2018-12-27 15:02
 * @since [产品/模块版本] （可选）
 */
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {
    /**
     * 这个方法调用是在用户没有携带认证信息去访问一个需要验证的REST接口时触发，此处应该返回响应的HTTP错误码和信息
     * @param request
     * @param response
     * @param authException
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        //这块可以根据需求再来判断
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
    }
}
