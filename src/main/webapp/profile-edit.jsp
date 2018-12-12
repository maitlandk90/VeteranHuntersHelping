<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 12/11/18
  Time: 8:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Edit Profile</title>
</head>
<body>
<%@ include file="links.jsp"%>


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
