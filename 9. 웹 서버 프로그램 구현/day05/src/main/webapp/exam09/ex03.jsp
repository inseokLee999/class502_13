<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@taglib prefix="util" tagdir="/WEB-INF/tags/utils" %>
<c:set var="num" value="100"/>
<util:linebox color="blue">
    <h1>안녕하세욤ㅎㅎ</h1>
    ${num}
    <c:url value="/member/join"/>
</util:linebox>