package com.rjxy.model;

//表示教师所带的课程
public class Course {
	
	private int id;
	//表示课程类型
	private int type;
	//代课老师id
	private int teacherId;
	//这门课的课时
	private int time;
	//课程人数/团队数
	private int number;
	
	public Course() {
		this.id = Integer.MAX_VALUE;
		this.type = Integer.MAX_VALUE;
		this.teacherId = Integer.MAX_VALUE;
		this.time = Integer.MAX_VALUE;
		this.number = Integer.MAX_VALUE;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}	
	
}
