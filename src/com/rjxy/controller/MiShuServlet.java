package com.rjxy.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rjxy.service.EquationService;


@WebServlet("/MiShuServlet")
public class MiShuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		String operator = request.getParameter("operator");
		if("add".equals(operator)) {
			if(request.getParameter("type") != null) {
				addEquation(request,response);
			}
			request.getRequestDispatcher("/teacherMiShu/addEquation.jsp").forward(request, response);
			return;
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}	

	private void addEquation(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String type = request.getParameter("type");
		String equation = request.getParameter("equation");
		EquationService equationService = new EquationService();
		//检查是否重复添加
		if(!equationService.checkRepeat(type)){
			equationService.addEquation(type, equation);
			request.setAttribute("msg", "添加成功");
		} else if(equationService.checkRepeat(type)){
			request.setAttribute("msg", "此门课已经存在,不能重复添加");
		}		
	}
}
