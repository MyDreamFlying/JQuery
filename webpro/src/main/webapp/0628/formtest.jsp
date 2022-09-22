<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  h1{
     color : red;
  }
  
  table{
  
      border : 2px solid blue;
      
  }
  
  td{
     width : 300px;
     height : 50px;
     text-align: center;
  }
</style>
</head>
<body>
  <h1>JSP : JAVA  Server pages</h1>
  <pre>
    자바 언어를 이용하여 클라이언트의 요청시 전송데이타를 받아서 처리한다
    자바 언어를 처리 하기 위해서  &lt;%  %>  기호 사이에 자바를 기술한다
    처리된 자바변수를 출력 할때는 &lt;%=   %> 기호를 이용한다 
  </pre>
  
  <%
    //클라이언트가 전송하면 전송데이타를 받아서 처리하는 부분
    //request라는 내장객체를 이용하여 받는다 
    String userId  =    request.getParameter("id");
    String userPass =   request.getParameter("pass");
 
  %>
  
  
   <table border="1">
     <tr>
        <td>아이디</td>
        <td>비밀번호</td>
     </tr>
     
     <tr>
        <td><%=  userId %></td>
        <td><%=  userPass %></td>
     </tr>
     
   </table>
</body>
</html>









