<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<c:set var="num1" value="100"/>
<c:set var="num2" value="200"/>
<%
    int num1 = Integer.parseInt((String)pageContext.getAttribute("num1"));
    System.out.println(num1);
    String str = request.getContentType();
    System.out.println(str);
    String str1 = response.getContentType();
    System.out.println(str1);
%>
${num1} + ${num2} = ${num1+num2}<br>
${str}