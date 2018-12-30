package org.colin.project.db.beetlsql.po;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;

import java.io.Serializable;
/* 
* 
* gen by beetlsql 2018-12-23
*/
@Table(name="sns.tbl_member_attach_info")
public class MemberAttachInfoPO implements Serializable {
	
	private Integer id ;
	/*
	粉丝数量
	*/
	private Integer fans ;
	/*
	关注会员数量
	*/
	private Integer follows ;
	/*
	是否管理员，0不是，1是普通管理员，2是超级管理员
	*/
	private Integer isAdmin ;
	/*
	是否删除
	*/
	private Integer isDeleted ;
	/*
	用户ID
	*/
	private Integer memberId ;
	/*
	个人介绍
	*/
	private String introduce ;
	/*
	个人网站
	*/
	private String website ;
	
	public MemberAttachInfoPO() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	/**
	* 粉丝数量
	*@return 
	*/
	public Integer getFans(){
		return  fans;
	}
	/**
	* 粉丝数量
	*@param  fans
	*/
	public void setFans(Integer fans ){
		this.fans = fans;
	}
	
	/**
	* 关注会员数量
	*@return 
	*/
	public Integer getFollows(){
		return  follows;
	}
	/**
	* 关注会员数量
	*@param  follows
	*/
	public void setFollows(Integer follows ){
		this.follows = follows;
	}
	
	/**
	* 是否管理员，0不是，1是普通管理员，2是超级管理员
	*@return 
	*/
	public Integer getIsAdmin(){
		return  isAdmin;
	}
	/**
	* 是否管理员，0不是，1是普通管理员，2是超级管理员
	*@param  isAdmin
	*/
	public void setIsAdmin(Integer isAdmin ){
		this.isAdmin = isAdmin;
	}
	
	/**
	* 是否删除
	*@return 
	*/
	public Integer getIsDeleted(){
		return  isDeleted;
	}
	/**
	* 是否删除
	*@param  isDeleted
	*/
	public void setIsDeleted(Integer isDeleted ){
		this.isDeleted = isDeleted;
	}
	
	/**
	* 用户ID
	*@return 
	*/
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 用户ID
	*@param  memberId
	*/
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	/**
	* 个人介绍
	*@return 
	*/
	public String getIntroduce(){
		return  introduce;
	}
	/**
	* 个人介绍
	*@param  introduce
	*/
	public void setIntroduce(String introduce ){
		this.introduce = introduce;
	}
	
	/**
	* 个人网站
	*@return 
	*/
	public String getWebsite(){
		return  website;
	}
	/**
	* 个人网站
	*@param  website
	*/
	public void setWebsite(String website ){
		this.website = website;
	}
	

}
