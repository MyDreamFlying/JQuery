<%@page import="com.google.gson.JsonElement"%>
<%@page import="com.google.gson.JsonObject"%>
<%@page import="kr.or.ddit.board.vo.PageVO"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="kr.or.ddit.board.vo.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <%
  //서블릿에서 저장 더ㅣㄴ 데이타 꺼내기 
  List<BoardVO>  list =(List<BoardVO>) request.getAttribute("list");
  PageVO   vo = (PageVO)request.getAttribute("pvo");
 
  JsonObject obj = new JsonObject();
  obj.addProperty("tpage", vo.getTotalPage());
  obj.addProperty("spage", vo.getStartPage());
  obj.addProperty("epage", vo.getEndPage());
  
  
  Gson  gson = new Gson();
  // String slist = gson.toJson(list);
  //out.print(slist);
  //out.flush();
  
  JsonElement  slist = gson.toJsonTree(list);
  obj.add("lists", slist);
 
  out.print(obj);
  out.flush();
  
  %>
  
  
  
  
  
  
  
  
  
  
  
  