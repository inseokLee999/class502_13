<%@ page contentType="text/html; charset=utf-8"%>
<%
    application.setAttribute("number",100);
    session.setAttribute("number",200);
    request.setAttribute("number",300);
    pageContext.setAttribute("number",400);
    pageContext.setAttribute("max-num",500);

%>
number(pageContext) : ${number}<br>
01010: ${pageScope['01010']}<br>
applicationScope.number : ${applicationScope['number']}<br>
sessionScope.number : ${sessionScope.number}<br>
requestScope.number : ${requestScope.number}<br>
pageScope.number : ${pageScope.number}<br>

max-num : ${pageScope['max-num']};