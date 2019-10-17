package com.rjxy.dao;

import java.util.List;

import com.rjxy.util.SqlHelper;

public class EquationDao {
	
	//添加公式
	public void addEquation(String type,String equation) {
		String sql = "insert equation(type,equation) into values(?,?)";
		Object[] parameters = {type,equation};
		SqlHelper.executeUpdate(sql, parameters);
	}
	
	//检查公式是否重复添加
	public List<Object[]> checkRepeat(String type) {
		String sql = "select id from equation where type = ?";
		Object[] parameters = {type};
		List<Object[]> alObjects = SqlHelper.executeQuery(sql, parameters);
		return alObjects;
	}
}
