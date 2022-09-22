<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
 table{
    border : 1px solid green;
 }
 td{
   width : 200px;
   height : 50px;
   text-align: center;
 }
</style>
</head>
<body>

<%

  request.setCharacterEncoding("UTF-8");

    String userId = request.getParameter("id");
	String userName = request.getParameter("name");
	String gender = request.getParameter("gender");

    String hero[]  = request.getParameterValues("hero");
    
    String file = request.getParameter("file");
    
    String str ="";
    
    for(String imhero : hero){
    	str +=  imhero + "<br>" ;
    }
    
	String lim = request.getParameter("lyw");

%>

<table border="1">
	<tr>
		<td>아이디</td>
		<td><%= userId %></td>
	</tr>

   <tr>
		<td>이름</td>
		<td><%= userName %></td>
	</tr>
	
	<tr>
		<td>성별</td>
		<td><%= gender %></td>
	</tr>
	
	<tr>
		<td>hero뮤직</td>
		<td><%= str %></td>
	</tr>
	
	
	<tr>
		<td>아티스트</td>
		<td><%= lim %></td>
	</tr>
	
	<tr>
		<td>첨부파일</td>
		<td><%= file %></td>
	</tr>
	
</table>

</body>
</html>





