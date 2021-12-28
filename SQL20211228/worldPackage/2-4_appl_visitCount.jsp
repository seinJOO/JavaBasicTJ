<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>application 예제 - 방문자 수 카운트하기</title>
</head>
<body>
<%
	String strcnt = (String) application.getAttribute("counter");
	int count = (strcnt == null) ? 0 : Integer.valueOf(strcnt);
	out.print("방문자 수 : "+ count);
	application.setAttribute("counter", String.valueOf(++count));
%>
</body>
</html>