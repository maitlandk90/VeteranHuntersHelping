<html>

    <%@ include file="head.jsp"%>
    <div class="container">
        <div class="row">
            <div id="center-div">
                <div id="messages">
                    <c:forEach var="message" items="${userMessages}">
                        <c:forEach var="user" items="${users}">
                            <c:if test="${message.fromUser == user.id}">
                                <div id="message-box">
                                <p>From:${user.username}</p>
                                <p>${message.message}</p>
                                </div>
                            </c:if>
                        </c:forEach>
                    </c:forEach>
                </div>
                <a href="profile">Back To Profile</a>

            </div>
        </div>
    </div>
</body>
</html>
<script>
    document.title = "Messages";
</script>
