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
@Table(name="sns.tbl_member_level")
public class MemberLevelPO implements Serializable {
	
	private Integer id ;
	private String name ;
	private Date createTime ;
	
	public MemberLevelPO() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public String getName(){
		return  name;
	}
	public void setName(String name ){
		this.name = name;
	}
	
	public Date getCreateTime(){
		return  createTime;
	}
	public void setCreateTime(Date createTime ){
		this.createTime = createTime;
	}
	

}
