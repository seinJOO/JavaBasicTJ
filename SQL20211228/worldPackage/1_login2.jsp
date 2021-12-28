<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<% request.setCharacterEncoding("utf-8");  //지시어 + 스크립틀릿 설명%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP에서 많이 쓰는 요소들-2</title>
</head>
<body>
<%-- 지시어 directive	 
	 
	0) @ annotaion : 페이지 처리를 위해 부가적인 정보를 정의하는 데이터용
	 
	1) page : jsp 처리 방법을 정의 - import, 한글 설정(get)	 
		 <한글 설정>
		 get 방식 : charset=UTF-8" pageEncoding="UTF-8" (맨 위에 자동으로 들어감)
		 post 방식 : <% request.setCharacterEncoding("utf-8"); %> (필수적으로 삽입해야 적용됨)
		 <import> - 자바처럼 기본 기능을 가져옴
--%>
<%@ page import = "java.util.Date" %>

<%--
	2) include : 다른 문서를 그대로 가져옴 (header footer 와 사용)
		- 주의 ! 두 파일간에 이름이 같은 변수가 있으면 충돌이 일어남
 --%> 
 <%@ include file="_header.jsp" %>  
 
 <%--
	3) taglib : 태그 라이브러리 설정 JSTL - JSP Standard Tag Library
 --%>   
 
 <%! //선언문 %>
     
    
<%
	//스크립트릿 (서블릿보다 훨씬 간단) -> 실제 소스에는 자바가 전혀 보이지 않음
	/*
		스크립트릿 내에 정의된 코드는 서블릿 변환 시 그대로 삽입된다 -> java 코드 형태로 실행된다.	
	*/
	String uid = request.getParameter("id"); //값 받아오기
	String ups = request.getParameter("ps");
	
	String res = "<h3>User ID : " + uid + "</h3>";
	res += "<h4>User PS : " + ups + "</h4>";	
	
	out.print(res); // = System.out.println(res);
	out.print("<br>"); //빈줄은 줄바꿈 태그를 출력하기!
	out.print((new Date()).toString());
%>

<!-- HTML주석 -->
<%-- JSP주석 --%> 

</body>
</html>





