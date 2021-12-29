<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% //왜안됨????????
	request.setCharacterEncoding("utf-8");

	String uauth = request.getParameter("author");
	String udesc = request.getParameter("desc");
	
	String sql = "INSERT INTO feed(author, desc) VALUES";
	sql += "('" + uauth + "','" +  udesc + "')";
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "0000"); 
	Statement stmt = conn.createStatement();

	int count = stmt.executeUpdate(sql);
	
	if (count == 1) out.print("글 작성 완료!");
	else out.print("오류 발생");

%>