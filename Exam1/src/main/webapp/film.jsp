<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% %>
<form action = "<%=request.getContextPath()%>/FilmServlet" method="post">
		电影名称：<input type="text" name="title"/><br><br>
		电影描述：<input type="text" name="desc"/><br><br>
		选择语种：<select >
			<option value="<%= %>"></option>
			<option name=""></option>
		</select>
 </form>
</body>
</html>