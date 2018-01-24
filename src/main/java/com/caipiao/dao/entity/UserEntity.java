package com.caipiao.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserEntity {

	@Id
	private int id;
	@Column(name="user_id")
	private String userId;
	@Column(name="user_name")
	private String userName;
	@Column(name="pass_word")
	private String passWord;
	@Column(name="status")
	private int status;
	@Column(name="jifen")
	private int	jifen;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", userId=" + userId + ", userName=" + userName + ", passWord=" + passWord
				+ ", status=" + status + ", jifen=" + jifen + "]";
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getJifen() {
		return jifen;
	}
	public void setJifen(int jifen) {
		this.jifen = jifen;
	}
	public UserEntity(int id, String userId, String userName, String passWord, int status, int jifen) {
		super();
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.passWord = passWord;
		this.status = status;
		this.jifen = jifen;
	}
	public UserEntity() {
		super();
	}
 
 

}
