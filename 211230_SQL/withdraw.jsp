<%@page import="dao.UserDAO"%>
<%@page import="util.ConnectionPool"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 탈퇴</title>
</head>
<body>
<%
/*
	실제로는 삭제 게시판 테이블 / 탈퇴 회원 테이블을 따로 만들어서 그곳으로 정보를 옮겨놓는 게 안전함
	완전히 삭제하는 건 항상 신중해야 함!
*/
	request.setCharacterEncoding("utf-8");

	String uid = request.getParameter("id");
	
	//1. 드라이버 로딩
//		Class.forName("com.mysql.jdbc.Driver");
	//2. DB 연결
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","0000");
/*
		//*. ConnectionPool을 이용한 DB연결
		Connection conn = ConnectionPool.get();
		
	//3. SQL 구문
		String sql = "DELETE FROM user WHERE id = ?"; // user테이블의 id데이터와 일치하는 것을 찾아서 삭제해라 !
		PreparedStatement stmt = conn.prepareStatement(sql); //실제로 쓰는 식 !!!
			//매번 새로운 객체 생성 없이, Connection 객체 conn을 자유롭게 사용하여 자원 소모를 줄임!(Connection pull)
			stmt.setString(1, uid); //첫번째 값을 uid로!(sql은 시작이 1)*/
	//4. 결과 받기
	
				//**. DAO를 통한 회원 탈퇴
				
					UserDAO dao = new UserDAO();
					int count = dao.delete(uid);
	
		//int count = stmt.executeUpdate();
			if (count == 1) {
				out.print("회원 탈퇴가 완료되었습니다");
			}else out.print("오류가 발생되었습니다.");
		
		
		



%>
</body>
</html>