<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%
	request.setCharacterEncoding("utf-8"); // post용으로 언어처리 해주기

	String uid = request.getParameter("id");
	String ups = request.getParameter("ps");
	String una = request.getParameter("name");
	
	String sql = "INSERT INTO user(id, password, name) VALUES";
	sql += "('" + uid + "','" + ups + "','" +  una + "')";
	
	Class.forName("com.mysql.jdbc.Driver"); // 드라이버 구동
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "0000"); //DB접속 객체 생성
	Statement stmt = conn.createStatement(); //sql명령문 전달 객체 생성
	
	int count = stmt.executeUpdate(sql); //정보입력이 성공하면 count=1
	
	if (count == 1) out.print("회원가입 완료");
	else out.print("오류 발생");



%>