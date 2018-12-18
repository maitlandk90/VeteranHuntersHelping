<html>

    <%@ include file="head.jsp"%>

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
<script>
    document.title = "Messages";
</script>
