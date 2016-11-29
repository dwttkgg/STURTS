package model;

import java.util.Date;

public class User {
	private int id;
	private String username;
	private String pwd;
	private Date birthday;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "User [birthday=" + birthday + ", id=" + id + ", pwd=" + pwd
				+ ", username=" + username + "]";
	}
	public User(String username, String pwd, Date birthday) {
		super();
		this.username = username;
		this.pwd = pwd;
		this.birthday = birthday;
	}
	public User() {
		super();
	}
	
}
