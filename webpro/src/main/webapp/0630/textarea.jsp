<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
div{
   border : 5px double hotpink;
   width : 60%;
   margin : 30px auto;
   height : 200px;
   padding : 20px;
}
</style>
</head>
<body>
<%
   request.setCharacterEncoding("UTF-8");

  String text = request.getParameter("area");
  
  //text에는 enter기호- \r\n -   가 포함 
  String retext =     text.replaceAll("\r", "").replaceAll("\n", "<br>");
  
  
%>

입력시 enter로 줄바꿈<br>
출력시 &lt;br>태그로 변환 
<div>
 <%= retext %>
</div>
</body>
</html>


















