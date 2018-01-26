package com.caipiao.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_data")
public class OrderDataEntity {
	@Id
	private long id;
	@Column(name = "uid")
	private String uid;
	@Column(name = "lid")
	private String lid;
	@Column(name = "zjhm")
	private String zjhm;
	@Column(name = "djje")
	private int djje;
	@Column(name = "zs")
	private int zs;
	@Column(name = "yhje")
	private int yhje;
	@Column(name = "hjje")
	private int hjje;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getLid() {
		return lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}
	public String getZjhm() {
		return zjhm;
	}
	public void setZjhm(String zjhm) {
		this.zjhm = zjhm;
	}
	public int getDjje() {
		return djje;
	}
	public void setDjje(int djje) {
		this.djje = djje;
	}
	public int getZs() {
		return zs;
	}
	public void setZs(int zs) {
		this.zs = zs;
	}
	public int getYhje() {
		return yhje;
	}
	public void setYhje(int yhje) {
		this.yhje = yhje;
	}
	public int getHjje() {
		return hjje;
	}
	public void setHjje(int hjje) {
		this.hjje = hjje;
	}
 

}
