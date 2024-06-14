<%@ page contentType='text/html;charset=UTF-8'%>
<%@ page isErrorPage="true" %>
<h1><b>오마이갓 비상사태 큰일났다 에러떴다</b></h1>
<%=exception=getMessage()%>
<%
    exception.printStatckTrace();
%>