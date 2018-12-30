package org.colin.project.sns.dao.member.dao;

import org.colin.project.sns.dao.basic.db.BasicMySqlDao;
import org.colin.project.sns.dao.member.po.MemberPO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author hzlinqiang
 * @Title MemberDao.java
 * @Package org.colin.project.sns.dao.member.dao
 * @Description 类描述
 * @date 2018-12-30 18:52
 * @since [产品/模块版本] （可选）
 */
@Repository
public class MemberDao extends BasicMySqlDao {

    /**
     * 通过用户手机号获取用户信息
     * @param userPhone
     * @return
     */
	public MemberPO loadMemberByPhone(String userPhone)
	{
		List<MemberPO> members = super.getSqlManager().query(MemberPO.class).andEq("phone", userPhone).select();
		if (null != members && members.size() > 0)
		{
			return members.get(0);
		}
		return null;
	}
}
