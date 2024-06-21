<%@ page import="org.choongang.member.MemberUtil" %>
<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="util" tagdir="/WEB-INF/tags/utils" %>
<c:url var="loginUrl" value="/member/login"/>
<c:url var="joinUrl" value="/member/join"/>
<c:url var="logoutUrl"  value="/member/logout"/>
<%--
<%
    boolean isLogin = MemberUtil.isLogin(request);
    pageContext.setAttribute("isLogin", isLogin);
%>
--%>
로그인 상태 ${isLogin}<br>
<%--<c:if test="${sessionScope.member == null}"/>--%>

<%--
<c:if test="${!isLogin}">
&lt;%&ndash;    미로그인&ndash;%&gt;
    <a href="${loginUrl}">로그인</a>
    <a href="${joinUrl}">회원가입</a>
</c:if>
&lt;%&ndash;<c:if test="${sessionScope.member!=null}">&ndash;%&gt;
<c:if test="${isLogin}">
    ${sessionScope.memeber.userName}(${sessionScope.member.email})님 로그인🍙
    <a href="${logoutUrl}">로그아웃</a>
</c:if>
--%>
<util:MemberOnly>
    ${loggedMember.userName}(${loggedMember.email})님 로그인🍙
    <a href="${logoutUrl}">로그아웃</a>
</util:MemberOnly>
<util:GuestOnly>
    <a href="${loginUrl}">로그인</a>
    <a href="${joinUrl}">회원가입</a>
</util:GuestOnly>
<h1>헤야헤야헤야</h1>
