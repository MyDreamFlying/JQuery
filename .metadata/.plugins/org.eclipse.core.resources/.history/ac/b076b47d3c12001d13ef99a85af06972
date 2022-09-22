<%@page import="kr.or.ddit.prod.vo.ProdVO"%>
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
  border-collapse: collapse;
}
td{
width : 200px;
height : 50px;
text-align: center;
}
.tr1{
  background : lightblue;
}
</style>

<script>
function proc(pid){
	//alert(pid);
	
	 location.href="/jqpro/ProdInfo.do?id=" + pid;
}
</script>
</head>
<body>

<%
//서블릿에서 저장한 공유데이타 꺼내기 
List<ProdVO>  list =
    (List<ProdVO>)request.getAttribute("sfsd");
%>

<table border="1">
  <tr class="tr1">
    <td>PROD_ID</td>
    <td>PROD_NAME</td>
  </tr>
  
 <%
   for(int i=0; i<list.size(); i++){
	  ProdVO  vo = list.get(i);
%>
  
 <tr>
    <td>
         <a href="#" onclick="javascript:proc('<%= vo.getProd_id() %>')">
           <%= vo.getProd_id() %>
         </a>
    </td>
    <td><%= vo.getProd_name() %></td>
  </tr>
  
 <%
  }
 %>
</table> 
 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
</table>
</body>
</html>