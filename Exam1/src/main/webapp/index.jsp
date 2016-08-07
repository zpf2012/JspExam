<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
</body>
<center>
	<h2>欢迎进入电影租赁管理系统</h2>
	<a href="<%=request.getContextPath()%>/login.jsp">用户登录</a><br/><br/>
	<a href="<%=request.getContextPath()%>/FilmServlet">电影查看</a><br/><br/>
	<a href="<%=request.getContextPath()%>/NewFilmServlet">新增电影</a><br/><br/>
</center>
</html>
