<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<c:url var="loginUrl" value="/member/login"/>
<%--<a href="<c:url value="/member/login" />">로그인</a>--%>
<a href="${loginUrl}">로그인</a>
<a href="<c:url value="/member/join"/> ">회원가입</a>

<form method="post" action="<c:url value="${loginUrl}"/> ">
    이메일 : <input type="text" name="email">
    비밀번호 : <input type="password" name="password">
    <button type="submit">로그인</button>
</form>