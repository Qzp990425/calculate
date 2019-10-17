<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加课程公式</title>
</head>
<body>
	<form action="/calculateSalary/MiShuServlet" method="post">
		添加课程的类型:<input type="text" name="type"><br />
		此类型的公式:<input type="text" name="equation"> <br />
		<input type="hidden" name="operator" value="add">
		<input type="submit" value="添加">
	</form>
	
	<input type="hidden" id="msg" value=<%=request.getAttribute("msg") %>>
</body>
	<% String path = request.getContextPath(); %>
	<script type="text/javascript" src="<%=path %>/js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="<%=path %>/js/msg.js"></script>
</html>