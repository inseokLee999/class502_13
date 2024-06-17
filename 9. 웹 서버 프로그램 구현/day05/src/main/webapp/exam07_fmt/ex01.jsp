<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="java.util.*" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@taglib prefix="fmt" uri="jakarta.tags.fmt" %>

<c:set var="date" value="<%=new Date()%>"/>
<fmt:formatDate value="${date}" type="time"/><br>
type : date - <fmt:formatDate value="${date}" /> <br>
type : time - <fmt:formatDate value="${date}" type="time"/> <br>
type : both - <fmt:formatDate value="${date}" type="both"/><br>

style : full - <fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full"/><br>
style : short - <fmt:formatDate value="${date}" type="both" dateStyle="short" timeStyle="short"/><br>
style : medium - <fmt:formatDate value="${date}" type="both" dateStyle="medium" timeStyle="medium"/><br>
style : long - <fmt:formatDate value="${date}" type="both" dateStyle="long" timeStyle="long"/><br>

pattern - <fmt:formatDate value="${date}" type="both" pattern="yyyy.MM.dd HH:mm:ss"/><br>