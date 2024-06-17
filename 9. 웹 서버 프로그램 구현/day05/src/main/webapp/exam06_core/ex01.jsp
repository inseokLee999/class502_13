<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<c:catch var="e"><%--try catch 와 비슷함--%>
    <%
        String str = null;
        str.toUpperCase();
    %>
</c:catch>
<c:if test="${e!=null}">
    에러메시지 : ${e.getMessage()}<br>
    에러메시지 : ${e.message}
</c:if>