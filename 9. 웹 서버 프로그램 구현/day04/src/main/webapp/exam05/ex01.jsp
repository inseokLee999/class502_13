<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="jakarta.servlet.*"%>
<h1>ex01.jsp -  상단</h1>
<%
    RequestDispatcher rd = request.getRequestDispatcher("ex02.jsp");
//    rd.forward(request, response);//버퍼를 치환한다
    rd.include(request, response);//버퍼를 추가한다
%>
<h1>ex01.jsp - 하단</h1>