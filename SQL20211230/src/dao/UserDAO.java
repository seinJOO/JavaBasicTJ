package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;

import util.ConnectionPool;

public class UserDAO {
	public int insert (String uid, String ups, String una) throws NamingException, SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		 try {
			 conn = ConnectionPool.get();
			 String sql = "INSERT INTO user(id, password, name) VALUES (?,?,?)";
			 stmt = conn.prepareStatement(sql);
			 stmt.setString(1, uid);
			 stmt.setString(2, ups);
			 stmt.setString(3, una);
			 
			 int count = stmt.executeUpdate();
			 return count;
		 } finally {
			 if (stmt != null) stmt.close(); //객체 사용 후 닫아주기(회수하기) -> 생략가능
			 if (conn != null) conn.close();
		 }
	}
	
	public int delete (String uid) throws NamingException, SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = ConnectionPool.get();
			String sql = "DELETE FROM user WHERE id = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, uid);
			
			int count = stmt.executeUpdate();
			return count;
		}finally {
			if (stmt != null) stmt.close();
			if (conn != null) conn.close();
		}
	}
	
	public int login(String uid, String upass) throws NamingException, SQLException {
		
		Connection conn = null;
		PreparedStatement stmt = null;		
		ResultSet rs = null;
		
		conn = ConnectionPool.get();
		String sql = "SELECT * FROM user WHERE id = ?";
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, uid);
		
		rs = stmt.executeQuery();
		
		if (!rs.next()) return 1;		//password 값(rs값)이 있는지~? = 해당 id가 있는지?
		if (!upass.contentEquals(rs.getNString("password"))) return 2;
		else return 0;		
		
	}
}
