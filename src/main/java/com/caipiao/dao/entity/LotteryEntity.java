package com.caipiao.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lottery_data")
public class LotteryEntity {
	@Id
	private int id;
	
	@Column(name="lid")
	private String lid;
	
	@Column(name="result")
	private String result;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLid() {
		return lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public LotteryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
