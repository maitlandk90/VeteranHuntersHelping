<html>

<%@ include file="head.jsp"%>


<form method="POST" action="update">

        <select id="updateWeapon" name="updateWeapon">
            <c:forEach var="item" items="${allWeapons}">
                <option value="${item.id}">${item.name}</option>
            </c:forEach>
        </select>
        <br />
        <select id="updateHead" name="updateHead">
            <c:forEach var="item" items="${allHeads}">
                <option value="${item.id}">${item.name}</option>
            </c:forEach>
        </select>
        <br />
        <select id="updateChest" name="updateChest">
            <c:forEach var="item" items="${allChests}">
                <option value="${item.id}">${item.name}</option>
            </c:forEach>
        </select>
        <br />
        <select id="updateArm" name="updateArm">
            <c:forEach var="item" items="${allArms}">
                <option value="${item.id}">${item.name}</option>
            </c:forEach>
        </select>
        <br />
        <select id="updateWaist" name="updateWaist">
            <c:forEach var="item" items="${allWaists}">
                <option value="${item.id}">${item.name}</option>
            </c:forEach>
        </select>
        <br />
        <select id="updateLeg" name="updateLeg">
            <c:forEach var="item" items="${allLegs}">
                <option value="${item.id}">${item.name}</option>
            </c:forEach>
        </select>

        <input type="submit" value="Update"/>

    </form>


</body>
</html>
