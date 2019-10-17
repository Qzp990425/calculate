package com.rjxy.model;

//代表所有的老师
public class Teacher {
	
	private int id;
	//教师姓名
	private String name;
	//教师密码
	private String password;
	//所属方向(0-javaee;1-移动互联;2-嵌入式;3-大数据;4-人工智能;5-未确定方向)
	private int fangxiang;
	//教师身份级别(0-一般教师;1-系主任;2-教学秘书;3-院长)
	private int rank;
	//教师职称(职称不同  薪资不同)
	private int level;
	//老师的课时	
	private int time;

	
	public Teacher() {
		this.id = Integer.MAX_VALUE ;
		this.name = "";
		this.level = Integer.MAX_VALUE;
		this.fangxiang = Integer.MAX_VALUE;
		this.time = Integer.MAX_VALUE;
		this.rank = Integer.MAX_VALUE;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getFangxiang() {
		return fangxiang;
	}
	public void setFangxiang(int fangxiang) {
		this.fangxiang = fangxiang;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
