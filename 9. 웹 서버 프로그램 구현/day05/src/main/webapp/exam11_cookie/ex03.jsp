<%@page contentType="text/html; charset=UTF-8" %>
<%
    Cookie cookie = new Cookie("key3","value");
    cookie.setMaxAge(60*60*24*7);
    response.addCookie(cookie);
%>