<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request예제</title>
</head>
<body>
<%  //Enumeration - 컬렉션에 저장된 요소들을 순서에 상관없이 열거 형태로 받음
	Enumeration<String> en = request.getHeaderNames();//순서개념이 없는 key, value값을 순서가 있는 형태로 만들어줌
	while (en.hasMoreElements()) { //elements가 있는 동안 실행하기-> 만든 순서대로 쭉 뽑아줌
		String name = (String)en.nextElement();
		String value = request.getHeader(name);
		out.print(name + ":" + value + "<br>"); //key값:value값 으로 출력됨!!!
	}
%>
</body>
</html>