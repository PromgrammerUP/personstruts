<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>人员增加</title>
</head>
<body>
<font color="red" face="黑体" size ="8">人员增加</font>
	<hr color="blue">
	<form action="<%=request.getContextPath()%>/adddo.do">
	<table>
		<tr>
			<td>姓名</td><td><input type="text" name="userId"></td>
		</tr>
		<tr>
			<td>年龄</td><td><input type="text" name="age"></td>
		</tr>
		<tr>
			<td>生日</td><td><input type="text" name="birth"></td>
		</tr>
		<tr align="right"><td colspan="2"><input type="submit" value="增加人员"></td></tr>
	</table>
	</form>
</body>
</html>