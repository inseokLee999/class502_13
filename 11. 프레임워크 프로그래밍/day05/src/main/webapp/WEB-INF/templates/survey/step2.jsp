<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:url var="actionUrl" value="/survey/step3"/>

<form:form method="post" action="${actionUrl}" autocomplete="off" modelAttribute="requestSurvey">
<%--    <form:hidden path="q1"/>--%>
<%--    <form:hidden path="q2"/>--%>
    질문 3: <form:input path="q3"/><br>
    질문 4: <form:input path="q4"/><br>
    <button type="submit">다음 설문</button>
</form:form>