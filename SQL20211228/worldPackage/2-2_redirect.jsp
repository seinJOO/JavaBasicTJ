<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 로그인 실패 시 페이지 / 성공 시 페이지를 부를 때 등등 많이 씀! -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Redirect 전 페이지입니다.
<%
	response.sendRedirect("redirect1.jsp");
%>
</body>
</html>