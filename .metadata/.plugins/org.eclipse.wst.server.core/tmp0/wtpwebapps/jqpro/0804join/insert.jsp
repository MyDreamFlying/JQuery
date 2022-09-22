<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//서블릿에서 저장된 데이타 꺼내기 
  String id = (String)request.getAttribute("sdfjskdf");
 if(id != null) {
%>	
	 
	 {
	    "flag"   : "가입 성공 <%=id %>님 환영합니다"
	 }
	 
<%  }else{ %>
	 
	 {
	    "flag"  : "가입 실패 "
	 }

<% 
 }
%>