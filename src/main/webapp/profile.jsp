<html>

<%@ include file="head.jsp"%>
    <div class="container">
        <div class="row">
            <div id="center-div">
                <p>Username: ${userProfile.username}</p>
                <p>Rank: ${userProfile.rank}</p>
                <p><img src="images/weapons-equipment-mhw.png" alt="Weapon" width="24" height="24">${userWeapon.name}</p>
                <p><img src="images/mhw-helm-headgear.png" alt="Head" width="24" height="24">${userHead.name}</p>
                <p><img src="images/mhw-torso-chest-plate.png" alt="Chest" width="24" height="24">${userChest.name}</p>
                <p><img src="images/mhw-arm-gauntlets.png" alt="Arms" width="24" height="24">${userArm.name}</p>
                <p><img src="images/mhw-waist-belt.png" alt="Waist" width="24" height="24">${userWaist.name}</p>
                <p><img src="images/mhw-feet-boots-greaves.png" alt="Boots" width="24" height="24">${userLeg.name}</p>
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
