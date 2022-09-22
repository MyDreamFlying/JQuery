<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>
  JSP : Java Server Pages
</h1>

<p>웹어플리케이션 서버에 의해서 실행되어지는 웹어플리케이션이다 </p>
<p>jsp는 서블릿클래스로 변환되고 컴파일된다</p>

<%
    String  userId = request.getParameter("id");
	String  userName = request.getParameter("name");

%>

<%=  userId %> 님 환영합니다<br>
<%=  userName %>님 행복하세요 

</body>
</html>