<%@page import="com.service.GetLanguage"%>
<%@page import="com.dao.impl.LanguageImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String language [] = new GetLanguage().getlanguage();

%>
<center>
	<form action="<%=request.getContextPath()%>/NewFilmServlet" method="post">
		电影名称：<input type="text" name="title" /><br>
		<br> 电影描述：<input type="text" name="desc" /><br>
		<br> 选择语种：<select>
		<%for(int i = 0; i < language.length; i++){ %>
			<option value="<%=language[i]%>"></option>
			<%} %>
		</select>
		<input type="submit" value="提交"/>
	</form>
</center>
</body>
</html>