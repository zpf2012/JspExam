<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改电影</title>
</head>
<body>
	<div align="center">
		<form action="" method="post">
		<table border="1">
			<tr>
				<td>Title:</td>
				<td><input type="text" name="title" value="${title}"/></td>
			</tr>
			<tr>
				<td>Desc:</td>
				<td><input type="text" name="desc" value="${desc}"/></td>
			</tr>
			<tr>
				<td>Language:</td>
				<td><input type="text" name="language" value="${language}"/></td>
			</tr>
		
		</table>
			<br><br>

			<input type="submit" name="submit" value="提交"/>
			<input type="reset" name="reset" value="重置"/>	
		</form>
	</div>
</body>
</html>