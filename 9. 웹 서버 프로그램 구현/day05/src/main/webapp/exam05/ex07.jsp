<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<c:forTokens var="team" items="KIA/LG/삼성/두산/SSG/NC/한화/롯데/KT/키움" delims="/">
    <div>
            ${team}
    </div>
</c:forTokens>