<%@page import="kr.or.ddit.prod.vo.LprodVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
table{
  border: 1px solid pink;
}
td{
width : 250px;
height : 50px;
text-align: center;
}
</style>

<script>
 function proc(lgu){
	 //alert(lgu);
	 
	 location.href="/jqpro/ProdList.do?gu=" + lgu;
 }
</script>
</head>
<body>

<%
//서블릿에서 공유 데이타 꺼내기 
List<LprodVO>  list  = (List<LprodVO>) request.getAttribute("sdkfjsd");
%>

<table border="1">
 <tr>
    <td>LPROD_ID</td>
    <td>LPROD_GU</td>
    <td>LPROD_NM</td>
 </tr>
  
  <%
     for(int i=0; i<list.size(); i++){
    	 LprodVO  vo = list.get(i);
 %>
 
  <tr>
	    <td><%= vo.getLprod_id() %></td>
	    <td>
	         <a href="#" onclick="javascript:proc('<%= vo.getLprod_gu() %>')">
	       	    <%= vo.getLprod_gu() %>
	       	 </a>
	    </td>
	    <td><%= vo.getLprod_nm() %></td>
  </tr>
    	 
  <%  	 
     }
   %>

</table>
</body>
</html>













