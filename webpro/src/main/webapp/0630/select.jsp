<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
   border : 1px solid blue;
   border-spacing:  10px;
   /* //border-collapse:  collapse */
   margin : 100px auto;
  
}
td{
   width : 200px;
   height : 50px;
   text-align: center;
}
.tit{
   background-color : skyblue;
}
</style>
</head>
<body>
<%
   request.setCharacterEncoding("UTF-8");

    String userId = request.getParameter("id");
	String userName = request.getParameter("name");
    String userArea= request.getParameter("area");
   /*  String food = request.getParameter("food"); */
   
   String foods[] = request.getParameterValues("food");
   String str = "";
   for(String fd : foods){
   	   str += fd + "<br>";
   }
   
    //userArea 엔터기호가 포함 - <br>태그로 변환 , 출력 
    userArea =    userArea.replaceAll("\r", "").replaceAll("\n", "<br>");
  
  
%>

<table border="1">
   <tr>
      <td class="tit">아이디</td>
      <td><%= userId %></td>
      <td class="tit">이름</td>
      <td><%= userName %></td>
   </tr>

   


	<tr>
      <td class="tit">좋아하는 음식</td>
      <td colspan="3"><%= str %></td>
      
   </tr>
   
   <tr>
      <td class="tit">자기소개</td>
      <td colspan="3"><%= userArea %></td>
      
   </tr>
   
   
</table>


</body>
</html>

















