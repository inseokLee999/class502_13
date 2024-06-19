<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags/layouts" %>
<c:url var="actionUrl" value="/member/login"/>
<layout:main title="로그인">
    <h1>록으인</h1>
    <form method="post" action="${actionUrl}" autocomplete="off">
        <dl>
            <dt>🍣이메일</dt>
            <dd>
                <input type="text" name="email" required="required">
            </dd>
        </dl>
        <dl>
            <dt>비밀번호</dt>
            <dd>
                <input type="password" name="password">
            </dd>
        </dl>
        <div>
            <input type="checkbox" name="saveEmail" value="true" id="saveEmail">
            <label for="saveEmail">이메일 기억하기</label>
        </div>
        <button type="submit">로그인</button>
    </form>
</layout:main>