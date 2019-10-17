package com.rjxy.service;

import java.util.List;

import com.rjxy.dao.EquationDao;

//关于计算公式的一些方法
public class EquationService {
	
	//添加计算公式
	public void addEquation(String type, String equation) {
		EquationDao equationDao = new EquationDao();
		equationDao.addEquation(type, equation);
	}
	
	//检查要插入的公式是否重复
	public boolean checkRepeat(String type) {
		EquationDao equationDao = new EquationDao();
		List<Object[]> alObjects = equationDao.checkRepeat(type);
		if(alObjects.size() == 0) {
			return false;
		} else {
			return true;
		}
	}
}
