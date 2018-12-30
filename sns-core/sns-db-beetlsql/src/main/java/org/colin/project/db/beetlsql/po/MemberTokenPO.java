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
@Table(name="sns.tbl_member_token")
public class MemberTokenPO implements Serializable {
	
	private Integer id ;
	/*
	会员ID
	*/
	private Integer memberId ;
	/*
	状态，0是正常，1是失效
	*/
	private Integer status ;
	private String token ;
	private Date createTime ;
	private Date expireTime ;
	
	public MemberTokenPO() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	/**
	* 会员ID
	*@return 
	*/
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 会员ID
	*@param  memberId
	*/
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	/**
	* 状态，0是正常，1是失效
	*@return 
	*/
	public Integer getStatus(){
		return  status;
	}
	/**
	* 状态，0是正常，1是失效
	*@param  status
	*/
	public void setStatus(Integer status ){
		this.status = status;
	}
	
	public String getToken(){
		return  token;
	}
	public void setToken(String token ){
		this.token = token;
	}
	
	public Date getCreateTime(){
		return  createTime;
	}
	public void setCreateTime(Date createTime ){
		this.createTime = createTime;
	}
	
	public Date getExpireTime(){
		return  expireTime;
	}
	public void setExpireTime(Date expireTime ){
		this.expireTime = expireTime;
	}
	

}
