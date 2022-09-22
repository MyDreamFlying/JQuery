<%@page import="kr.or.ddit.prod.vo.ProdVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table{
  border : 2px solid green;
  border-collapse:  collapse;
}
td{
width : 250px;
height : 50px;
text-align: center;
}
</style>
</head>
<body>
<%
  //서블릿에서 저장된 공유 데이타 꺼내니
  ProdVO  vo  = (ProdVO)request.getAttribute("sdfsldf");
 
%>

<table border="1">
  <tr>
     <td>PROD_ID</td>
     <td><%= vo.getProd_id() %></td>
  </tr>
  
  <tr>
     <td>PROD_NAME</td>
     <td><%= vo.getProd_name() %></td>
  </tr>
  
  <tr>
     <td>PROD_BUYER</td>
     <td><%= vo.getProd_buyer() %></td>
  </tr>
  
  <tr>
     <td>PROD_PRICE</td>
     <td><%= vo.getProd_price() %></td>
  </tr>
  
  
  <tr>
     <td>PROD_COST</td>
     <td><%= vo.getProd_cost() %></td>
  </tr>
  
  <tr>
     <td>PROD_SALE</td>
     <td><%= vo.getProd_sale() %></td>
  </tr>
  
</table>

</body>
</html>


















