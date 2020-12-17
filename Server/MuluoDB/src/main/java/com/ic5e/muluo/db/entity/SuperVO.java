package com.ic5e.muluo.db.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class SuperVO {
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
	
	@GenericGenerator(name = "generator", strategy = "org.hibernate.id.UUIDGenerator")
	@Id
	@GeneratedValue(generator = "generator")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 随时更新
	 * @return
	 */
	@Generated(GenerationTime.ALWAYS)
	public Timestamp getTs() {
		return ts;
	}
	public void setTs(Timestamp ts) {
		this.ts = ts;
	}
	/**
	 * 创建时更新
	 * @return
	 */
	@CreatedDate
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	/**
	 * 需要时更新
	 * @return
	 */
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
	
	
}
