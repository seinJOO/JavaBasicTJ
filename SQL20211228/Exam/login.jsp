<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file = "_header.jsp" %>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String uid = request.getParameter("id");
	String ups = request.getParameter("ps");
	String dbps = "1234"; //db에 있는 패스워드 끌어오기
	
	if (ups.equals(dbps)) {	//로그인 성공 -> 메인으로 전환
		session.setAttribute("id", uid); //"id"값을 session에 저장 후 uid 호출
		out.print("로그인 성공");
		response.sendRedirect("main.jsp");
	}else { //로그인 화면 다시 호출
		out.print("암호가 일치하지 않습니다.");
		response.sendRedirect("login.html");
	}

%>
</body>
</html>