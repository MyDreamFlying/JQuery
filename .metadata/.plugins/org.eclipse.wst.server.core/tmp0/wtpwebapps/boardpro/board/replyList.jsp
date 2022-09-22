<%@page import="com.google.gson.Gson"%>
<%@page import="kr.or.ddit.board.vo.ReplyVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <%
 //서블릿에서 공유 데이타 꺼내기 
 List<ReplyVO>  list = (List<ReplyVO>)request.getAttribute("shfdfsdfw3ed");
 
  Gson   gson = new Gson();
 
  String slist = gson.toJson(list);
 
  out.print(slist);
  out.flush();
 
 %>
    