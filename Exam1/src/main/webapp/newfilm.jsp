<%@page import="com.service.GetLanguage"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增电影</title>
<%
	ResultSet rs = new GetLanguage().getlanguage();
%>
</head>
<body>

	<div align="center">
		<form action="/NewFilmServlet" method="post">
			电影名称：<input type="text" name="title" /><br> <br> 电影描述：<input
				type="text" name="desc" /><br> <br> 选择语种：<select
				name="language">
				<%
					while (rs.next()) {
				%>
				<option value="<%=rs.getString("name")%>"><%=rs.getString("name")%></option>
				<%
					}
				%>
			</select> <input type="submit" value="提交" />
		</form>
	</div>
</body>
</html>