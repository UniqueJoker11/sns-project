package org.colin.project.sns.dao.member.po;

import java.io.Serializable;
import java.math.BigDecimal;

import org.beetl.sql.core.annotatoin.Table;

/*
* 
* gen by beetlsql 2018-12-23
*/
@Table(name="sns.tbl_member_honer_info")
public class MemberHonerInfoPO implements Serializable {
	
	private Integer id ;
	/*
	是否删除
	*/
	private Integer isDeleted ;
	/*
	0普通会员，1VIP
	*/
	private Integer isVip ;
	/*
	用户ID
	*/
	private Integer memberId ;
	/*
	会员等级ID
	*/
	private Integer memberLevelId ;
	/*
	积分
	*/
	private Integer score ;
	/*
	金额
	*/
	private BigDecimal money ;
	
	public MemberHonerInfoPO() {
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
	* 0普通会员，1VIP
	*@return 
	*/
	public Integer getIsVip(){
		return  isVip;
	}
	/**
	* 0普通会员，1VIP
	*@param  isVip
	*/
	public void setIsVip(Integer isVip ){
		this.isVip = isVip;
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
	* 会员等级ID
	*@return 
	*/
	public Integer getMemberLevelId(){
		return  memberLevelId;
	}
	/**
	* 会员等级ID
	*@param  memberLevelId
	*/
	public void setMemberLevelId(Integer memberLevelId ){
		this.memberLevelId = memberLevelId;
	}
	
	/**
	* 积分
	*@return 
	*/
	public Integer getScore(){
		return  score;
	}
	/**
	* 积分
	*@param  score
	*/
	public void setScore(Integer score ){
		this.score = score;
	}
	
	/**
	* 金额
	*@return 
	*/
	public BigDecimal getMoney(){
		return  money;
	}
	/**
	* 金额
	*@param  money
	*/
	public void setMoney(BigDecimal money ){
		this.money = money;
	}
	

}
