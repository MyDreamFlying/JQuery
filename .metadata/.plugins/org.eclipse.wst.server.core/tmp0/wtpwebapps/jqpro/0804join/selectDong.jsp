<%@page import="kr.or.ddit.member.vo.ZipVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//서블릿에서 저장된 데이타 꺼내기 
List<ZipVO> list = (List<ZipVO>)request.getAttribute("sdjfs");
%>
[
  <%
    for(int i=0; i<list.size(); i++){
    	ZipVO  vo = list.get(i);
    	
    	String bunji = vo.getBunji();
    	if(bunji == null)  bunji="";
       	if(i > 0) out.print(",");
   %>
      {
        "code"   : "<%= vo.getZipcode() %>",
        "addr"   : "<%= vo.getSido() %> <%= vo.getGugun() %> <%= vo.getDong() %>",
        "bunji"  : "<%= bunji %>"
      }
 <%  	
    }
  %>
]




