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
    int  price = Integer.parseInt(request.getParameter("price"));
    int  qty = Integer.parseInt(request.getParameter("qty"));
   
    int res = price * qty;

%>

<table border="1">
   <tr>
   	<td>가격</td>
   	<td>수량</td>
   	<td>금액</td>
   </tr>


	<tr>
	   	<td><%= price %></td>
	   	<td><%= qty %></td>
	   	<td><%= res %></td>
	 </tr>
</table>

</body>

</html>










