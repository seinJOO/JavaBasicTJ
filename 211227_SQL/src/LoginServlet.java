package com.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() { //default생성자
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get방식으로 호출하면 여기 떨어짐
		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.getWriter().print(request.getParameter("id")); //(name=)id정보를 넘겨받아 출력함
//		response.getWriter().print(request.getParameter("ps")); //(name=)ps정보를 넘겨받아 출력함
		
		String uid = request.getParameter("id"); // 정보를 변수로 받아서 출력하기
		String ups = request.getParameter("ps");
//		response.getWriter().print(uid);
//		response.getWriter().print(ups);
		
		String res = "<html>"; //html을 끼워넣어서 출력하기
		res += "<h3>User ID : " + uid + "</h3><br>";
		res += "<h3>User PS : " + ups + "</h3><br>";
		res += "</html>";
		
		response.getWriter().print(res);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// post방식으로 호출하면 여기 떨어짐 -> doGet매서드로 다시 보냄↓
		doGet(request, response);
	}

}
