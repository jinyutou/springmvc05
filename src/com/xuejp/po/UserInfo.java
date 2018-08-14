package com.xuejp.po;

import java.util.Arrays;
import java.util.Date;

public class UserInfo {
	private Integer userId;
	private String userName;
	private String userSex;
	private String[] xingXq;
	private Date userTime;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String[] getXingXq() {
		return xingXq;
	}
	public void setXingXq(String[] xingXq) {
		this.xingXq = xingXq;
	}
	public Date getUserTime() {
		return userTime;
	}
	public void setUserTime(Date userTime) {
		this.userTime = userTime;
	}
	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName
				+ ", userSex=" + userSex + ", xingXq="
				+ Arrays.toString(xingXq) + ", userTime=" + userTime + "]";
	}
	
}
