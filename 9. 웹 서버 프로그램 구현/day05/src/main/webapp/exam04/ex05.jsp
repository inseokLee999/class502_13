<%@page contentType="text/html; charset=utf-8" %>
User-Agent : ${header['User-Agent']}<br>
JSESSIONID.getValue : ${cookie.JSESSIONID.getValue()}<br>
JSESSIONID.value : ${cookie.JSESSIONID.value}<br>
Cookie : ${cookie}<br>
key1 : ${initParam.key1}<br>

URI : ${pageContext.getRequest().getRequestURI()}<br>
URI : ${pageContext.request.requestURI}<br>
uri : ${}
