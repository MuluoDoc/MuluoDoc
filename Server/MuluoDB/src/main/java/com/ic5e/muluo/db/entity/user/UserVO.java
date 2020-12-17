package com.ic5e.muluo.db.entity.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.ic5e.muluo.db.entity.SuperVO;

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name="muluo_user")
public class UserVO extends SuperVO {
	/**
	 * 编码，登录账号
	 */
	private String code;
	/**
	 * 昵称
	 */
	private String name;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 用户级别
	 */
	private String level;
	/**
	 * 用户邮箱
	 */
	private String email;
	/**
	 * 第三方系统主键
	 */
	private String sysid;
	/**
	 * 第三方系统用户标志
	 */
	private String third_user_id;
	/**
	 * 是否锁定
	 */
	private boolean locked;
	
	@Column(name="code",unique=true, nullable=false)
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSysid() {
		return sysid;
	}
	public void setSysid(String sysid) {
		this.sysid = sysid;
	}
	public String getThird_user_id() {
		return third_user_id;
	}
	public void setThird_user_id(String third_user_id) {
		this.third_user_id = third_user_id;
	}
	public boolean isLocked() {
		return locked;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	
	
	
}
