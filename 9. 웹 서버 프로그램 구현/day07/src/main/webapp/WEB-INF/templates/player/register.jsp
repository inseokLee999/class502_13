<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@taglib prefix="util" tagdir="/WEB-INF/tags/utils" %>
<c:url var="actionUrl" value="/player/register"/>
<c:url var="loginUrl" value="/member/login"/>
<c:url var="logoutUrl" value="/member/logout"/>
<c:url var="main" value="/"/>
<h1>선수 등록 페이지</h1>
<%--<util:MemberOnly>--%>
    ${loggedMember.userName}(${loggedMember.email})님 로그인🍙
    <a href="${logoutUrl}">로그아웃</a>
    <form method="post" action="${actionUrl}" enctype="multipart/form-data">
        선수 이름 : <input type="text" name="playerName"><br>
        소속 팀 : <select id="team" name="team">
        <optgroup label="수도권 팀">
            <option value="Bears">두산</option>
            <option value="Twins">LG</option>
            <option value="Landers">SSG</option>
            <option value="Heros">키움</option>
            <option value="Wizs">KT</option>
        </optgroup>
        <optgroup label="비수도권 팀">
            <option value="Eagles">한화</option>
            <option value="Giants">롯데</option>
            <option value="Lions">삼성</option>
            <option value="Dinos">NC</option>
            <option value="Tigers">KIA</option>
        </optgroup>
    </select>
        <br>
        선수 사진 : <input type="file" name="playerPhoto" ><br>
        <button type="submit">제출하기</button>
    </form>
<%--</util:MemberOnly>--%>
<util:GuestOnly>
    <h2>로그인이 필요한 페이지 입니다.</h2>
    <a href="${loginUrl}">로그인</a>
    <a href="${main}">메인 화면으로 가기</a>
</util:GuestOnly>