<%--
  Created by IntelliJ IDEA.
  User: Kmaitland
  Date: 10/1/18
  Time: 6:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Profile</title>
</head>
<body>
<%@ include file="links.jsp"%>
    <p>${userProfile.username}</p>
    <p>${userProfile.rank}</p>
    <p>${userWeapon.name}</p>
    <p>${userHead.name}</p>
    <p>${userChest.name}</p>
    <p>${userArm.name}</p>
    <p>${userWaist.name}</p>
    <p>${userLeg.name}</p>

    <c:if test="${sameUser}">
        <p><button type="button">Edit!</button></p>
    </c:if>

</body>
</html>
