<%@ page import="org.choongang.member.MemberUtil" %>
<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="util" tagdir="/WEB-INF/tags/utils" %>
<c:url var="loginUrl" value="/member/login"/>
<c:url var="joinUrl" value="/member/join"/>
<c:url var="logoutUrl"  value="/member/logout"/>
<%
    boolean isLogin = MemberUtil.isLogin(request);
    System.out.println(session.getAttribute("member"));
    System.out.println(isLogin);
    pageContext.setAttribute("isLogin", isLogin);
%>
<%--<c:if test="${sessionScope.member == null}"/>--%>
${isLogin}
<c:if test="${!isLogin}">
<%--    미로그인--%>
    <a href="${loginUrl}">로그인</a>
    <a href="${joinUrl}">회원가입</a>
</c:if>
<%--<c:if test="${sessionScope.member!=null}">--%>
<c:if test="${isLogin}">
    ${sessionScope.memeber.userName}(${sessionScope.member.email})님 로그인🍙
    <a href="${logoutUrl}">로그아웃</a>
</c:if>
<h1>헤야헤야헤야</h1>

<util:MemberOnly>
    ${sessionScope.memeber.userName}(${sessionScope.member.email})님 로그인🍙
    <a href="${logoutUrl}">로그아웃</a>
</util:MemberOnly>
<util:GuestOnly>
    <a href="${loginUrl}">로그인</a>
    <a href="${joinUrl}">회원가입</a>
</util:GuestOnly>