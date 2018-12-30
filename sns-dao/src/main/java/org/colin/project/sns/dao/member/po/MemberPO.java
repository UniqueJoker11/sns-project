package org.colin.project.sns.dao.member.po;

import java.util.Date;

import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2018-12-23
*/
@Table(name="sns.tbl_member")
public class MemberPO {
	
	private Integer id ;
	/*
	分组ID
	*/
	private Integer groupId ;
	/*
	是否已激活，0未激活，1已激活
	*/
	private Integer isActive ;
	/*
	0普通会员，1VIP
	*/
	private Integer isDeleted ;
	/*
	-1禁用，0启用
	*/
	private Integer status ;
	/*
	头像
	*/
	private String avatar ;
	/*
	生日
	*/
	private String birthday ;
	/*
	邮箱
	*/
	private String email ;
	/*
	会员名称
	*/
	private String name ;
	/*
	密码
	*/
	private String password ;
	/*
	手机号码
	*/
	private String phone ;
	/*
	性别
	*/
	private String sex ;
	/*
	更新资料时间
	*/
	private Date updateTime ;
	
	public MemberPO() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	/**
	* 分组ID
	*@return 
	*/
	public Integer getGroupId(){
		return  groupId;
	}
	/**
	* 分组ID
	*@param  groupId
	*/
	public void setGroupId(Integer groupId ){
		this.groupId = groupId;
	}
	
	/**
	* 是否已激活，0未激活，1已激活
	*@return 
	*/
	public Integer getIsActive(){
		return  isActive;
	}
	/**
	* 是否已激活，0未激活，1已激活
	*@param  isActive
	*/
	public void setIsActive(Integer isActive ){
		this.isActive = isActive;
	}
	
	/**
	* 0普通会员，1VIP
	*@return 
	*/
	public Integer getIsDeleted(){
		return  isDeleted;
	}
	/**
	* 0普通会员，1VIP
	*@param  isDeleted
	*/
	public void setIsDeleted(Integer isDeleted ){
		this.isDeleted = isDeleted;
	}
	
	/**
	* -1禁用，0启用
	*@return 
	*/
	public Integer getStatus(){
		return  status;
	}
	/**
	* -1禁用，0启用
	*@param  status
	*/
	public void setStatus(Integer status ){
		this.status = status;
	}
	
	/**
	* 头像
	*@return 
	*/
	public String getAvatar(){
		return  avatar;
	}
	/**
	* 头像
	*@param  avatar
	*/
	public void setAvatar(String avatar ){
		this.avatar = avatar;
	}
	
	/**
	* 生日
	*@return 
	*/
	public String getBirthday(){
		return  birthday;
	}
	/**
	* 生日
	*@param  birthday
	*/
	public void setBirthday(String birthday ){
		this.birthday = birthday;
	}
	
	/**
	* 邮箱
	*@return 
	*/
	public String getEmail(){
		return  email;
	}
	/**
	* 邮箱
	*@param  email
	*/
	public void setEmail(String email ){
		this.email = email;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getName(){
		return  name;
	}
	/**
	* 会员名称
	*@param  name
	*/
	public void setName(String name ){
		this.name = name;
	}
	
	/**
	* 密码
	*@return 
	*/
	public String getPassword(){
		return  password;
	}
	/**
	* 密码
	*@param  password
	*/
	public void setPassword(String password ){
		this.password = password;
	}
	
	/**
	* 手机号码
	*@return 
	*/
	public String getPhone(){
		return  phone;
	}
	/**
	* 手机号码
	*@param  phone
	*/
	public void setPhone(String phone ){
		this.phone = phone;
	}
	
	/**
	* 性别
	*@return 
	*/
	public String getSex(){
		return  sex;
	}
	/**
	* 性别
	*@param  sex
	*/
	public void setSex(String sex ){
		this.sex = sex;
	}
	
	/**
	* 更新资料时间
	*@return 
	*/
	public Date getUpdateTime(){
		return  updateTime;
	}
	/**
	* 更新资料时间
	*@param  updateTime
	*/
	public void setUpdateTime(Date updateTime ){
		this.updateTime = updateTime;
	}
	

}
