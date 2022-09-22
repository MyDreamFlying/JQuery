<%@page import="kr.or.ddit.prod.vo.ProdVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
  //서블릿에서 저장된 공유 데이타 꺼내니
  ProdVO  vo  = (ProdVO)request.getAttribute("sdfsldf");
 %>
 
 {
    "id"     : "<%=  vo.getProd_id() %>",
    "name"   : "<%=  vo.getProd_name() %>",
    "lgu"    : "<%=  vo.getProd_lgu() %>",
    "price"  : "<%=  vo.getProd_price() %>",
    "sale"   : "<%=  vo.getProd_sale() %>",
    "cost"   : "<%=  vo.getProd_cost() %>",
    "buyer"  : "<%=  vo.getProd_buyer() %>"
 }




















