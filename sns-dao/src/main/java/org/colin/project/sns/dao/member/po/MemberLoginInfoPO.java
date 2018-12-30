package org.colin.project.sns.dao.member.po;

import java.io.Serializable;
import java.util.Date;

import org.beetl.sql.core.annotatoin.Table;

/*
* 
* gen by beetlsql 2018-12-23
*/
@Table(name="sns.tbl_member_login_info")
public class MemberLoginInfoPO implements Serializable {
	
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
	本次登录IP
	*/
	private String currLoginIp ;
	/*
	本次登录时间
	*/
	private Date currLoginTime ;
	
	public MemberLoginInfoPO() {
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
	* 本次登录IP
	*@return 
	*/
	public String getCurrLoginIp(){
		return  currLoginIp;
	}
	/**
	* 本次登录IP
	*@param  currLoginIp
	*/
	public void setCurrLoginIp(String currLoginIp ){
		this.currLoginIp = currLoginIp;
	}
	
	/**
	* 本次登录时间
	*@return 
	*/
	public Date getCurrLoginTime(){
		return  currLoginTime;
	}
	/**
	* 本次登录时间
	*@param  currLoginTime
	*/
	public void setCurrLoginTime(Date currLoginTime ){
		this.currLoginTime = currLoginTime;
	}
	

}
