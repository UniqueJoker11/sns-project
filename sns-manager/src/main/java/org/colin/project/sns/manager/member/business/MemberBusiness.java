package org.colin.project.sns.manager.member.business;

import org.colin.project.sns.common.bo.ManagerGeneralResponse;

/**
 * @author hzlinqiang
 * @Title MemberBusiness.java
 * @Package org.colin.project.sns.manager.member.business
 * @Description 类描述
 * @date 2018-12-30 19:45
 * @since [产品/模块版本] （可选）
 */
public interface MemberBusiness {

    /**
     * 根据用户名校验用户登录
     * @param username
     * @return
     */
    public ManagerGeneralResponse checkUserLogin(String username);
}
