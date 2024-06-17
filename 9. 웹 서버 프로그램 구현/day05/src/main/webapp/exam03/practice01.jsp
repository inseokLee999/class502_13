<%@page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@page import="java.lang.Integer" %>

<%
    int sum = 0;
    for (int cnt = 1; cnt <= 100; cnt++)
        sum += cnt;
    request.setAttribute("RESULT", Integer.valueOf(sum));
    RequestDispatcher dispatcher = request.getRequestDispatcher("HundredResult.jsp");
    dispatcher.forward(request, response);
%>