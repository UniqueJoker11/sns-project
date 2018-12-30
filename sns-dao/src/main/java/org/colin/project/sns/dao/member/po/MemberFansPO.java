package org.colin.project.sns.dao.member.po;

import java.io.Serializable;
import java.util.Date;

import org.beetl.sql.core.annotatoin.Table;

/*
* 
* gen by beetlsql 2018-12-23
*/
@Table(name="sns.tbl_member_fans")
public class MemberFansPO implements Serializable {
	
	private Integer id ;
	private Integer followWho ;
	private Integer whoFollow ;
	private Date createTime ;
	
	public MemberFansPO() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public Integer getFollowWho(){
		return  followWho;
	}
	public void setFollowWho(Integer followWho ){
		this.followWho = followWho;
	}
	
	public Integer getWhoFollow(){
		return  whoFollow;
	}
	public void setWhoFollow(Integer whoFollow ){
		this.whoFollow = whoFollow;
	}
	
	public Date getCreateTime(){
		return  createTime;
	}
	public void setCreateTime(Date createTime ){
		this.createTime = createTime;
	}
	

}
