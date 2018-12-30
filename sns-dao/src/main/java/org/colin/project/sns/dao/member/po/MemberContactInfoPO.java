package org.colin.project.sns.dao.member.po;

import java.io.Serializable;

import org.beetl.sql.core.annotatoin.Table;

/*
* 
* gen by beetlsql 2018-12-23
*/
@Table(name="sns.tbl_member_contact_info")
public class MemberContactInfoPO implements Serializable {
	
	private Integer id ;
	/*
	是否删除
	*/
	private Integer isDeleted ;
	/*
	用户ID
	*/
	private Integer memberId ;
	/*
	联系邮箱
	*/
	private String contactEmail ;
	/*
	联系手机号
	*/
	private String contactPhone ;
	/*
	QQ
	*/
	private String qq ;
	/*
	微信
	*/
	private String wechat ;
	
	public MemberContactInfoPO() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
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
	* 联系邮箱
	*@return 
	*/
	public String getContactEmail(){
		return  contactEmail;
	}
	/**
	* 联系邮箱
	*@param  contactEmail
	*/
	public void setContactEmail(String contactEmail ){
		this.contactEmail = contactEmail;
	}
	
	/**
	* 联系手机号
	*@return 
	*/
	public String getContactPhone(){
		return  contactPhone;
	}
	/**
	* 联系手机号
	*@param  contactPhone
	*/
	public void setContactPhone(String contactPhone ){
		this.contactPhone = contactPhone;
	}
	
	/**
	* QQ
	*@return 
	*/
	public String getQq(){
		return  qq;
	}
	/**
	* QQ
	*@param  qq
	*/
	public void setQq(String qq ){
		this.qq = qq;
	}
	
	/**
	* 微信
	*@return 
	*/
	public String getWechat(){
		return  wechat;
	}
	/**
	* 微信
	*@param  wechat
	*/
	public void setWechat(String wechat ){
		this.wechat = wechat;
	}
	

}
