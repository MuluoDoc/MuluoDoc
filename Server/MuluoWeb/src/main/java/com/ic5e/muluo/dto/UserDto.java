package com.ic5e.muluo.dto;

import java.sql.Timestamp;
import java.util.Date;

public class UserDto {
	/**
	 * 主键
	 */
	protected String id;
	/**
	 * ts 更新版本
	 */
	protected Timestamp ts;
	/**
	 * 创建时间
	 */
	protected Date create_time;
	/**
	 * 修改时间
	 */
	protected Date modify_time;
	/**
	 * 逻辑删除
	 */
	protected int dr=0;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Timestamp getTs() {
		return ts;
	}
	public void setTs(Timestamp ts) {
		this.ts = ts;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getModify_time() {
		return modify_time;
	}
	public void setModify_time(Date modify_time) {
		this.modify_time = modify_time;
	}
	public int getDr() {
		return dr;
	}
	public void setDr(int dr) {
		this.dr = dr;
	}
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
