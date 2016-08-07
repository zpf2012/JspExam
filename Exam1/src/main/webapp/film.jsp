<%@page import="com.service.FilmInfo"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.service.GetLanguage"%>
<%@page import="com.dao.impl.LanguageImpl"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<% 
	ResultSet rs = new FilmInfo().getInfo();
%>
<body>
	<center>
	<h3>电影管理</h3><br>
	<a href="<%=request.getContextPath()%>/NewFilmServlet">新增电影</a>
		<form method="post">
			<table border="1">
				<tr>
					<th width="5%">Film_id</th>
					<th width="15%">Title</th>
					<th width="55%">DESC</th>
					<th width="10">Language</th>
					<th width="15">Buy</th>
				</tr>
				<%while(rs.next()){ %>
				<tr>
					<td><%=rs.getLong("film_id")%></td>
					<td><%=rs.getString("title")%></td>
					<td><%=rs.getString("description")%></td>
					<td><%=rs.getString("name")%></td>
					<td><a href="<%=request.getContextPath()%>/DeleteFilm?id=<%=rs.getLong("film_id")%>">删除</a></td>
				</tr>
				<%} %>
			</table>
		</form>
	</center>
</body>
</html>