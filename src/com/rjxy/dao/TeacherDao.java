package com.rjxy.dao;

import java.util.List;

import com.rjxy.model.Teacher;
import com.rjxy.util.SqlHelper;

public class TeacherDao {
	
	//检验教师输入的账号密码是否正确
	public List<Object[]> isLogin(String name) {
		String sql = "select password from teacher where name = ?";
		Object[] parameters = {name};
		List<Object[]> alObject = SqlHelper.executeQuery(sql, parameters);
		return alObject;
	}
	
	//得到指定的一个老师对象
	public Teacher getTeacher(String name) {
		String sql = "select * from teacher where name = ?";
		Object[] parameters = {name};
		List<Object[]> alObject = SqlHelper.executeQuery(sql, parameters);
		Object[] object = alObject.get(0);
		Teacher teacher = new Teacher();
		teacher.setId(Integer.valueOf(object[0].toString()));
		teacher.setName(object[1].toString());
		teacher.setPassword(object[2].toString());
		teacher.setLevel(Integer.valueOf(object[3].toString()));
		teacher.setFangxiang(Integer.valueOf(object[4].toString()));
		try {
			//如果当前还没有计算课时量
			teacher.setTime(Integer.valueOf(object[5].toString()));
		} catch (Exception e) {
			teacher.setTime(0);
		}		
		teacher.setRank(Integer.valueOf(object[6].toString()));
		return teacher;
	}
}