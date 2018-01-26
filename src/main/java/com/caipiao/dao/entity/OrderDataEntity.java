package com.caipiao.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_data")
public class OrderDataEntity {
	@Id
	private int id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public OrderDataEntity(int id, String uid, String lid, String zjhm, int djje, int zs, int yhje, int hjje) {
		super();
		this.id = id;
		this.uid = uid;
		this.lid = lid;
		this.zjhm = zjhm;
		this.djje = djje;
		this.zs = zs;
		this.yhje = yhje;
		this.hjje = hjje;
	}

	public OrderDataEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
