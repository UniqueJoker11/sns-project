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
@Table(name="sns.tbl_member_address_info")
public class MemberAddressInfoPO implements Serializable {
	
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
	居住地区
	*/
	private String addarea ;
	/*
	居住城市
	*/
	private String addcity ;
	/*
	居住省份
	*/
	private String addprovince ;
	/*
	居住地址
	*/
	private String address ;
	
	public MemberAddressInfoPO() {
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
	* 居住地区
	*@return 
	*/
	public String getAddarea(){
		return  addarea;
	}
	/**
	* 居住地区
	*@param  addarea
	*/
	public void setAddarea(String addarea ){
		this.addarea = addarea;
	}
	
	/**
	* 居住城市
	*@return 
	*/
	public String getAddcity(){
		return  addcity;
	}
	/**
	* 居住城市
	*@param  addcity
	*/
	public void setAddcity(String addcity ){
		this.addcity = addcity;
	}
	
	/**
	* 居住省份
	*@return 
	*/
	public String getAddprovince(){
		return  addprovince;
	}
	/**
	* 居住省份
	*@param  addprovince
	*/
	public void setAddprovince(String addprovince ){
		this.addprovince = addprovince;
	}
	
	/**
	* 居住地址
	*@return 
	*/
	public String getAddress(){
		return  address;
	}
	/**
	* 居住地址
	*@param  address
	*/
	public void setAddress(String address ){
		this.address = address;
	}
	

}
