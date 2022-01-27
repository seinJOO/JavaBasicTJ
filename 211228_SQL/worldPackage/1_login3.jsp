<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP에서 많이 쓰는 요소들-3</title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8"); //post방식 한글처리
String uid = request.getParameter("id"); //값 받아오기
String ups = request.getParameter("ps");
%>

<h3>User ID : <%=uid %></h3> <!-- html 사이에 자바 끼워넣기 -->
<h3>User PS : <%=ups %></h3>
<h6>현재 시간은 <%= (new Date()).toString() %>입니다.</h6>
</body>
</html>