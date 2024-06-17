<html>
<head>
    <title>Scripting Tag</title>
</head>
<body>
<%!int data = 50;%><%--변수정의--%>
<%/*스크립틀릿*/
    out.println("Value of the variable is:" + data);
%>
<%!int sum(int a, int b) {/*메서드 정의*/
    return a + b;
}%>
<%/*자바로직 코드 작성*/
    out.println("2 + 3 = " + sum(2, 3));
%>
<br>
${data}
<%=data%>
<p> Today's date: <%=new java.util.Date()%></p>
<%
    int a = 10;
    int b = 20;
    int c = 30;
%>
<%=a + b + c%>
</body>
</html>