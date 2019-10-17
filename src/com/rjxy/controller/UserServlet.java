package com.rjxy.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rjxy.model.Teacher;
import com.rjxy.service.TeacherService;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String operator = request.getParameter("operator");
		if("login".equals(operator)) {
			login(request,response);
			return;
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		TeacherService teacherService = new TeacherService();
		if(teacherService.isLogin(name, password)) {
			Teacher teacher = teacherService.getTeacher(name);
			request.getSession().setAttribute("teacher", teacher);
			request.setAttribute("msg", "成功登录"+teacher.getName());
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		} else {
			request.setAttribute("msg", "您输入的账号或者密码有错误");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		}		
	}
}
