<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장 객체 Implicit Object</title>
</head>
<body>
<!-- 
	내장객체는 JSP에 의해 미리 정의된 객체 - JSP 페이지 내에서 선언 없이 이용할 수 있는 객체
	request, response, out, application,session
	- 별도로 선언 없이 사용 가능
	- 지정된 값으로만 사용해야 함 (변수 이름 수정 금지)
	
	1) request : HTTP 요청 메시지의 내용을 참조하기 위한 함수들을 제공함
		*** getParameter() - HTTP 요청 값을 반환함
		getParameterValues() - 배열 형태로 반환함
		getParameterNames() - 특정 이름에 해당하는 것만 반환함
		getParameterMap() - 전체 리스트를 키와 밸류 형태의 Map 객체로 반환
		getHeader() - 헤더에서 특정 이름의 속성 값을 반환함
		getHeaderNames() - 헤더에 포함된 모든 속성의 이름을 반환함
		getCookies() - 모든 쿠키값을 가져옴
		
	2) response : 주로 메세지의 헤더 정보를 얻어오거나 설정하기 위한 함수를 포함한다.
				    단, 메세지의 바디 정보에 들어갈 내용을 추가하기 위한 함수는 제공하지 않는다.
				    
		sendRedirect() - 지정된 url 페이지로 강제 이동		<-이 용도로만 씀
	
	3) out : 화면 상에 출력할 때 사용
		out.print();
		
	4) application : 서비스의 실행 기간 동안 유지될 필요가 있는 속성값을 설정하거나 가져옴 (방문자수 카운트 등)
	
	5) session : 정보를 서버에 보관함 (cookie : 정보를 클라이언트에 보관함)

		
	
 -->

</body>
</html>