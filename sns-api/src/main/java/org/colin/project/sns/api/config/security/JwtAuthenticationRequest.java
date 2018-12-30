package org.colin.project.sns.api.config.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author hzlinqiang
 * @Title JwtAuthenticationRequest.java
 * @Package org.colin.project.api.config.security
 * @Description 用户认证信息
 * @date 2018-12-27 15:10
 * @since [产品/模块版本] （可选）
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtAuthenticationRequest implements Serializable {

    /**
     * 用户名，代指邮箱或者手机号
     */
    private String username;
    private String password;


}
