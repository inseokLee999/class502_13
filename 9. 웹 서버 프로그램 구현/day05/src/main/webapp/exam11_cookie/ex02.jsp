<%@ page import="java.util.Arrays" %>
<%@page contentType="text/html; charset=UTF-8" %>
<%
    Cookie[] cookies = request.getCookies();
    for(Cookie cookie : cookies){
        String name = cookie.getName();
        String value = cookie.getValue();
        System.out.printf("name = %s\n",name);
        System.out.printf("value = %s\n",value);
    }

%>