package com.rjxy.model;

//表示存放相应的计算公式
public class Equation {
	
	private int id;
	//课程的类型
	private int type;
	//课程的计算公式
	private String equation;
	
	public Equation() {
		this.id = Integer.MAX_VALUE;
		this.type = Integer.MAX_VALUE;
		this.equation = "";
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
	public String getEquation() {
		return equation;
	}
	public void setEquation(String equation) {
		this.equation = equation;
	}
	
	
}
