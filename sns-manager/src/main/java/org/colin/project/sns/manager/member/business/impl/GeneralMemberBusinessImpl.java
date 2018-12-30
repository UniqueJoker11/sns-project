package org.colin.project.sns.manager.member.business.impl;

import org.colin.project.sns.common.bo.ManagerGeneralResponse;
import org.colin.project.sns.dao.member.dao.MemberDao;
import org.colin.project.sns.manager.member.business.MemberBusiness;
import org.springframework.stereotype.Service;

/**
 * @author hzlinqiang
 * @Title GeneralMemberBusinessImpl.java
 * @Package org.colin.project.sns.manager.member.business.impl
 * @Description 类描述
 * @date 2018-12-30 21:05
 * @since [产品/模块版本] （可选）
 */
@Service(value = "generalMemberBusinessImpl")
public class GeneralMemberBusinessImpl implements MemberBusiness {
    private MemberDao memberDao;
    @Override
    public ManagerGeneralResponse checkUserLogin(String username) {
        return null;
    }
}
