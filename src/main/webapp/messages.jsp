<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 12/5/18
  Time: 3:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

    <%@ include file="head.jsp"%>

    <script>
        document.title = "Messages";
    </script>
<body>
    <%@ include file="links.jsp"%>
        <c:forEach var="message" items="${userMessages}">
            <div>
            <c:forEach var="user" items="${users}">
                <c:if test="${message.fromUser == user.id}">
                    <p>From:${user.username}</p>
                    <p>${message.message}</p>
                </c:if>
            </c:forEach>
                <%--<p>From:${message.fromUser}</p>--%>
                <%--<p>To:${message.toUser}</p>--%>
                <%--<p>${message.message}</p>--%>
            </div>
        </c:forEach>
</body>
</html>
