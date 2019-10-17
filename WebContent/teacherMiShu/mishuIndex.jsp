<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>教学秘书主界面</title>
</head>
<body>
	<a href="/calculateSalary/MiShuServlet?operator=add"><button>添加计算公式</button></a>
	<a href="/calculateSalary/MiShuServlet?operator=look"><button>查看老师的课时统计</button></a>
	<input type="hidden" id="msg" value=<%=request.getAttribute("msg") %>>
</body>
	<% String path = request.getContextPath(); %>
	<script type="text/javascript" src="<%=path %>/js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="<%=path %>/js/msg.js"></script>
</html>