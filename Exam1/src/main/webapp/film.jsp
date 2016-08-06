<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
	<center>
	<h3>电影管理</h3><br>
	<a href="<%=request.getContextPath()%>/newfilm.jsp">新增电影</a>
		<form action="<%=request.getContextPath()%>/FilmServlet"
			method="post">
			<table border="1">
				<tr>
					<th width="15%">Title</th>
					<th width="50%">Description</th>
					<th width="10%">Price</th>
					<th width="10">Length</th>
					<th width="15">Buy</th>
				</tr>
				<tr name="film">
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td><a href="<%=request.getContextPath()%>/DeleteFilm?id=<%= %>">删除</a></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>