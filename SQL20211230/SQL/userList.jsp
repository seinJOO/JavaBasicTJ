<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- *. 자바와 데이터베이스 연결 (mysql-connector-java-8.0.27를 WEB-INF\lib에 넣어줘야 함!)
		1) JDBC 드라이버 로딩 
		2) DB 접속을 위한 Connection 객체 생성
		3) SQL 명령문을 전달하기 위한 Statement 객체 생성
		4) Statement객체를 이용하여 쿼리 실행
		5) DB로부터 전송된 쿼리 실행 결과 처리
		6) 사용된 객체 닫기 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Class.forName("com.mysql.jdbc.Driver"); //1)
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","0000");//2)
	Statement stmt = conn.createStatement();//3)
	ResultSet rs = stmt.executeQuery("SELECT * FROM user"); // 4)user테이블로부터 모든걸 다 선택해와서 rs에 넣는다	
	
	String str = "";
	while (rs.next()) {
		str += rs.getString("no") + "," + rs.getString("id") + ","+ rs.getString("password") 
				+ "," + rs.getString("name") + "," + rs.getString("ts") + "<br><hr>";	//5) <br>줄바꿈 <hr> 줄바꿈 선 삽입
	}
	out.print(str);	
	
%>

</body>
</html>