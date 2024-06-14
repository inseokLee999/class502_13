<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<c:forEach var="item" items="Apple, Orange, Melon">
    <div>
            ${cnt}. 한요한-반복 - ${item}
    </div>
</c:forEach>