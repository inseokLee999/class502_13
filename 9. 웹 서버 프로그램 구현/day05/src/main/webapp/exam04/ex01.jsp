<%@page contentType="text/html; charset=UTF-8" %>
<%
    pageContext.setAttribute("num",10);
%>
${100+200}<br>
${10==10?"10 임":"10 아님"}