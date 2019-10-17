package com.rjxy.service;

import java.util.List;

import com.rjxy.dao.TeacherDao;
import com.rjxy.model.Teacher;

public class TeacherService {
	
	//检验教师登录是否正确
	public boolean isLogin(String name,String password) {
		TeacherDao teacherDao = new TeacherDao();
		//得到原用户名的正确密码
		List<Object[]> getPassword = teacherDao.isLogin(name);
		if(getPassword.size() == 0) {
			return false;
		} else if(!password.equals((getPassword.get(0))[0].toString())) {
			return false;
		} else if(password.equals((getPassword.get(0))[0].toString())) {
			return true;
		}
		return false;
	}
	
	//得到指定的老师
	public Teacher getTeacher(String name) {
		TeacherDao teacherDao = new TeacherDao();
		Teacher  teacher = teacherDao.getTeacher(name);
		return teacher;
	}
}
