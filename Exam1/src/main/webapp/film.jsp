<%@page import="com.fm.CreateHtml"%>
<%@page import="com.service.FilmInfo"%>
<%@page import="java.util.Iterator"%>
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
	<a href="/newfilm.jsp">新增电影</a>
		<form method="post">
			<table border="1">
				<tr>
					<th width="5%">Film_id</th>
					<th width="15%">Title</th>
					<th width="55%">DESC</th>
					<th width="10">Language</th>
					<th width="15">Delete</th>
					<th width="15">Update</th>
				</tr>
				<%while(rs.next()){ %>
				<tr>
					<td><%=rs.getLong("film_id")%></td>
					<td><%=rs.getString("title")%></td>
					<td><%=rs.getString("description")%></td>
					<td><%=rs.getString("name")%></td>
					<td><a href="/DeleteFilmServlet?id=<%=rs.getLong("film_id")%>">删除</a></td>
					<td><a href="/UpdateServlet?id=<%=rs.getLong("film_id")%>">编辑</a></td>
				</tr>
				<%} %>
			</table>
		</form>
	</center>
</body>
</html>