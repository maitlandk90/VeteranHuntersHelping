<html>

<%@ include file="head.jsp"%>
    <div class="container">
        <div class="row">
            <div id="center-div">
                <p>${userProfile.username}</p>
                <p>${userProfile.rank}</p>
                <p>${userWeapon.name}</p>
                <p>${userHead.name}</p>
                <p>${userChest.name}</p>
                <p>${userArm.name}</p>
                <p>${userWaist.name}</p>
                <p>${userLeg.name}</p>

            <c:choose>
                <c:when test="${sameUser}">
                    <form method="POST" action="edit?id=${userProfile.id}">
                        <input type="submit" value="Edit"/>
                    </form>
                    <form method="POST" action="messages?id=${userProfile.id}">
                        <input type="submit" value="Messages"/>
                    </form>
                </c:when>

                <c:otherwise>
                    <c:if test="${not empty errorMessage}">
                        <h1>${errorMessage}</h1>
                    </c:if>
                    <form method="POST" action="sendMessage?id=${userProfile.id}">
                        <textarea rows="4" cols="50" name="message" placeholder="Enter message" style="resize: none"></textarea><br />
                        <input type="submit" value="Message"/>
                    </form>
                </c:otherwise>
            </c:choose>
            </div>
        </div>
    </div>
</body>
</html>
