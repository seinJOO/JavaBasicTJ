<%@page import="dao.UserDAO"%>
<%@page import="util.ConnectionPool"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%
	request.setCharacterEncoding("utf-8"); // post용으로 언어처리 해주기

	String uid = request.getParameter("id");
	String ups = request.getParameter("ps");
	String una = request.getParameter("name");
/*	
//	String sql = "INSERT INTO user(id, password, name) VALUES";
//	sql += "('" + uid + "','" + ups + "','" +  una + "')";
	
//	Class.forName("com.mysql.jdbc.Driver"); // 드라이버 구동
//	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "0000"); //DB접속 객체 생성
	Connection conn = ConnectionPool.get(); //커넥션풀 사용 - 드라이버 구동/ DB객체 생성 필요없음
	
//	Statement stmt = conn.createStatement(); //sql명령문 전달 객체 생성
	
//	int count = stmt.executeUpdate(sql); //결과 받기 - 정보입력이 성공하면 count=1
*/	
	UserDAO dao = new UserDAO(); //UserDAO의 객체를 생성하여 그 객체로 정보를 받을 거임!
	int count = dao.insert(uid, ups, una); // 새로운 객체 dao에 입력받은 값들을 넣기
	
	if (count == 1) out.print("회원가입 완료");
	else out.print("오류 발생");



%>