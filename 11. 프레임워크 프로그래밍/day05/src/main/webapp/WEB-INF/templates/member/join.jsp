<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<c:url var="actionUrl" value="/member/join"/>
<h1>회원가입</h1>
<form method="post" action="${actionUrl}" autocomplete="off">
    <dl>
        <dt>이메일</dt>
        <dd>
            <input type="text" name="email">
        </dd>
    </dl>
    <dl>
        <dt>비밀번호</dt>
        <dd>
            <input type="password" name="password">
        </dd>
    </dl>
    <dl>
        <dt>비밀번호확인</dt>
        <dd>
            <input type="password" name="confirmPassword">
        </dd>
    </dl>
    <dl>
        <dt>회원명</dt>
        <dd>
            <input type="text" name="userName">
        </dd>
    </dl>
    <dl>
        <dt>약관동의</dt>
        <dd>
            <input type="checkbox" name="agree" value="true" id="agree">
            <label for="agree">회원가입 약관에 동의합니다.</label>
        </dd>
    </dl>
    <button type="submit">제출하기</button>
    <button type="reset">다시쓰기</button>
</form>