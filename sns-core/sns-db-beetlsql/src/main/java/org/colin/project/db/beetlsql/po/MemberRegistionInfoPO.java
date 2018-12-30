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
@Table(name="sns.tbl_member_registion_info")
public class MemberRegistionInfoPO implements Serializable {
	
	private Integer id ;
	/*
	是否删除
	*/
	private Integer isDeleted ;
	/*
	用户ID
	*/
	private Integer memeberId ;
	/*
	注册IP
	*/
	private String regip ;
	/*
	注册时间
	*/
	private Date createTime ;
	
	public MemberRegistionInfoPO() {
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
	public Integer getMemeberId(){
		return  memeberId;
	}
	/**
	* 用户ID
	*@param  memeberId
	*/
	public void setMemeberId(Integer memeberId ){
		this.memeberId = memeberId;
	}
	
	/**
	* 注册IP
	*@return 
	*/
	public String getRegip(){
		return  regip;
	}
	/**
	* 注册IP
	*@param  regip
	*/
	public void setRegip(String regip ){
		this.regip = regip;
	}
	
	/**
	* 注册时间
	*@return 
	*/
	public Date getCreateTime(){
		return  createTime;
	}
	/**
	* 注册时间
	*@param  createTime
	*/
	public void setCreateTime(Date createTime ){
		this.createTime = createTime;
	}
	

}
