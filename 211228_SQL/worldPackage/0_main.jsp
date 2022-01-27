<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file = "_header.jsp" %>
<%
	String uid = (String) session.getAttribute("id"); //세션 값을 읽어옴
	if (uid == null) { //세션에 uid가 없을 경우에만 문구 출력
		out.print("로그인 정보가 없습니다. ");
		response.sendRedirect("1_login.html");
	} 
%>
<h1>Hello World!!!</h1>
</body>
</html>