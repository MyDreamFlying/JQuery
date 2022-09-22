<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 서블릿에서 저장된 데이터 꺼내기
	String srt = (String)request.getAttribute("cid");

	if(srt == null){
%>
	{
		"flag" : "사용가능한 id입니다."
		
	}

<% }else{ %>
	
	{
		"flag": "사용불가능한 id입니다."
	}
	
<%}
%>