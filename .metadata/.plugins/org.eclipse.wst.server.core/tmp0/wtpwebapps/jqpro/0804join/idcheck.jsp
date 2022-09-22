<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//서블릿에서 자장된 데이타 꺼내기
 String  sdfsdfsdfsdf =  (String)request.getAttribute("sdfsdkfs8732");

if(sdfsdfsdfsdf == null) {  //사용가능 
%>
  {
     "flag"  : "사용가능 아이디 입니다"
  }
	
	
<% }else {  //사용불가능  %>

   {
      "flag" : "사용 불가능 아이디입니다"
   }

<%	
}
%>