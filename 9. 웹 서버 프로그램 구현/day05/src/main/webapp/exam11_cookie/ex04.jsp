<%@page contentType="text/html; charset=UTF-8" %>
<%
    //쿠키 삭제 - 만료 기간으로 삭제
    Cookie cookie = new Cookie("key2","value");
    cookie.setMaxAge(0);
    response.addCookie(cookie);
%>