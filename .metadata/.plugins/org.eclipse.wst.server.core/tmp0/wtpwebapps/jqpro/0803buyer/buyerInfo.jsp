<%@page import="kr.or.ddit.buyer.vo.BuyerVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//서블릿에서 저장한 공유데이타 꺼내기 
   BuyerVO  vo = (BuyerVO) request.getAttribute("sdfsdfdswe");

%>

{

    "id"        : "<%= vo.getBuyer_id() %>",
    "name"      : "<%= vo.getBuyer_name() %>",
    "lgu"       : "<%= vo.getBuyer_lgu() %>",
    "mail"      : "<%= vo.getBuyer_mail() %>",
    "bank"      : "<%= vo.getBuyer_bank() %>",
    "bankno"    : "<%= vo.getBuyer_bankno()%>",
    "bankname"  : "<%= vo.getBuyer_bankname() %>"
}