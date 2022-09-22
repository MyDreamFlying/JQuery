<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<style>
table{
	border : 1px solid blue;
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
  //서블릿에서 저장한  공유 데이타 꺼내기
  MemberVO  vo =(MemberVO)request.getAttribute("sliwd");

  if(vo != null){
 %>
 
 	 <table>
 	    <tr>
 	      <td>아이디</td>
 	      <td><%= vo.getMem_id() %></td>
 	    </tr>
 	    
 	     <tr>
 	      <td>이름</td>
 	      <td><%= vo.getMem_name() %></td>
 	    </tr>
 	    
 	     <tr>
 	      <td>전화번호</td>
 	      <td><%= vo.getMem_hp() %></td>
 	    </tr>
 	    
 	    
 	     <tr>
 	      <td>메일</td>
 	      <td><%= vo.getMem_mail() %></td>
 	    </tr>
 	    
 	     <tr>
 	      <td>주소</td>
 	      <td><%= vo.getMem_add1() %></td>
 	    </tr>
    </table>  
    
<%	  
  }
%>
</body>
</html>











