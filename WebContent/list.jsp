<%@page import="org.javachina.person.dto.StudentDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<font color="red" face="黑体" size ="8">人员列表</font>
	<hr color="blue">
	<table>
	<tr><td>ID</td><td>姓名</td><td>年龄</td><td>出生日期</td></tr>
	<%
		ArrayList<StudentDto> all = (ArrayList)request.getAttribute("all");
	    for(StudentDto dto :all){
	 %>
		  <tr>
		  	<td><%=dto.getId() %></td>
		  	<td><%=dto.getName() %></td>
		  	<td><%=dto.getAge() %></td>
		  	<td><%=dto.getBirth() %></td>
		  </tr>	    	
   	<%
	    }
	%>
	</table>
	<a href="<%=request.getContextPath()%>/add.do">增加人员</a>
</body>
</html>