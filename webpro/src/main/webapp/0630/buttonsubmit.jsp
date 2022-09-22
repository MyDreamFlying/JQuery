<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
   table{
     border : 1px solid blue;
     /* //선합치기  */
     
   }
   
   td{
      width : 350px;
      height : 50px;
      text-align: center;
   }
</style>
</head>
<body>
<%
 
   request.setCharacterEncoding("utf-8");

   String userId = request.getParameter("id");
   String userMail = request.getParameter("email");
   String userTel = request.getParameter("tel");
%>

<table border="1">
   <tr>
   	<td>아이디</td>
   	<td>이메일</td>
   	<td>전화번호</td>
   </tr>


	<tr>
	   	<td><%= userId %></td>
	   	<td><%= userMail %></td>
	   	<td><%= userTel %></td>
	 </tr>
</table>
 
</body>
</html>
