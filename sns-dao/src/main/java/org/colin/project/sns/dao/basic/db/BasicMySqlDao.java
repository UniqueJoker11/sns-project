package org.colin.project.sns.dao.basic.db;

import org.beetl.sql.core.SQLManager;
import org.beetl.sql.ext.spring4.BeetlSqlDaoSupport;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author hzlinqiang
 * @Title BasicMySqlDao.java
 * @Package org.colin.project.sns.dao.basic.db
 * @Description 类描述
 * @date 2018-12-30 18:52
 * @since [产品/模块版本] （可选）
 */

public abstract class BasicMySqlDao extends BeetlSqlDaoSupport
{
	@Resource
	private SQLManager sqlManager;

	@PostConstruct
	public void init()
	{
	    //注入sqlManager
		super.setSqlManager(sqlManager);
	}
}
