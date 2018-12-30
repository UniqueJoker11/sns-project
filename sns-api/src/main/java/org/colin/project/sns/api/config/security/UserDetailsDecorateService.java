package org.colin.project.sns.api.config.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * @author hzlinqiang
 * @Title UserDetailsDecorateService.java
 * @Package org.colin.project.api.config.security
 * @Description 类描述
 * @date 2018-12-30 19:38
 * @since [产品/模块版本] （可选）
 */
@Component
public class UserDetailsDecorateService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
