<%@page contentType="text/html; charset=UTF-8"%>
<h1>💾파일 업로드 페이지💾</h1>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:url var="actionUrl" value="/file/upload"/>
<form method="post" action="${actionUrl}" enctype="multipart/form-data">
    제목📃 : <input type="text" name="title"><br>
    내용😎 : <input type="text" name="content"><br>
    파일 : <input type="file" name="file"><br>
    <button type="submit">작성 하기</button>
</form>
