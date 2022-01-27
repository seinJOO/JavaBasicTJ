package util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

// JSP DB연결의 끝판왕 !!!!
public class ConnectionPool {
	private static DataSource _ds = null;
	
	public static Connection get() throws NamingException, SQLException {
		if (_ds == null) {
			_ds = (DataSource)(new InitialContext()).lookup("java:comp/env/jdbc/testdb");
		}
		return _ds.getConnection();
	}
}
