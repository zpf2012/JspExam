<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function return_check(form) {
		if(document.forms.loginform.customer.value==""){
			alert("请输入用户名");
			document.forms.loginform.customer.focus();
		}
	}
</script>
<%
	session.setAttribute("customer", "customer");
%>
<body>
<center>
	<form name="loginform" action="<%= request.getContextPath()%>/LoginServlet" method="post">
		user:<input type="text" name="customer"/>
		<input type="submit" value="Login" onclick="return_check(this);">
	</form>
</center>
</body>
</html>