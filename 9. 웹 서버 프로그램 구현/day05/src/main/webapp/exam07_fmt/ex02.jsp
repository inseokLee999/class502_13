<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<c:set value="100000000" var="num1"/>

<fmt:formatNumber value="${num1}"/><br>
<fmt:formatNumber value="${num1}" groupingUsed="false"/><br>

type - percent : <fmt:formatNumber value="0.25" type="percent"/><br>
type - currency : <fmt:formatNumber value="1300" type="currency" currencySymbol="\\"/><br>
