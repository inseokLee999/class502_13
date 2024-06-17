<%@ tag import="java.util.Map" %>
<%@tag body-content="empty" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@tag import="java.util.*" %>
<%@tag dynamic-attributes="attrs" %>
color:${attrs.color}<br>
size:${attrs.size}<br>
<%
    Map<String, String> attr = (Map<String, String>) jspContext.getAttribute("attrs");
    String _size = attr.getOrDefault("size","0");
    int size = Integer.parseInt(_size);
    String color = attr.get("color");
%>
<div style="color:${attrs.color};">
    <%
        for(int i=0;i<size;i++){
            out.write("*");
        }
    %>
</div>