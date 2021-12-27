<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%-- 
	JSP는 html을 유지하면서 자바 소스(<%%>)만 넣어주면 적용이 수월함~!
	Servlet에서 html을 끼워가며 적용시켰던 것을 JSP에서는 자동으로 바꿔주는 것임! 
	
	<%......%> : 스크립틀릿 scriptlet - 일반 자바 코드 삽입
	<%@.....%> : 지시어 directive
	<%=.....%> : 표현식 expression
	<%!.....%> : 선언문 declaration
--%>
	<%-- JSP의 주석 comment  --%> 
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>User ID : <%=request.getParameter("id") %></h3>
<h3>User PS : <%=request.getParameter("ps") %></h3>
</body>
</html>