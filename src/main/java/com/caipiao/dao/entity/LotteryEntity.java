package com.caipiao.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 开奖表 实体
 * @author Administrator
 *
 */
@Entity
@Table(name="lottery_data")
public class LotteryEntity {
	@Id
	private long id;
	
	@Column(name="lid")
	private String lid;
	
	@Column(name="result")
	private String result;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	 

	
	
}
