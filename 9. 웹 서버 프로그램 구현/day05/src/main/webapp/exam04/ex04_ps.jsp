<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.ArrayList" %>
<%@page contentType="text/html; charset=utf-8" %>
<%
    String[] chklist = request.getParameterValues("chk");
    System.out.println(Arrays.stream(chklist).toList());
%>
이메일 : ${param.email}<br>
비밀번호 : ${param.password}<br>
선택 : ${paramValues.chk[0]} / ${paramValues.chk[1]} / ${paramValues.chk[2]} <br>

