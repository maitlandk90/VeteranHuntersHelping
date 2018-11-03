<%--
  Created by IntelliJ IDEA.
  User: KMaitland
  Date: 10/1/18
  Time: 6:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign Up</title>
</head>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body>

<%@ include file="links.jsp"%>


<form method="POST" action="signUp">
    <p>${signUpErrorMessage}</p>
    <c:remove var="signUpErrorMessage"/>
    <input type="text" name="Username" id="Username" placeholder="Username"><br />
    <input type="text" name="Password" id="Password" placeholder="Password"><br />
    <input type="text" name="RePassword" id="RePassword" placeholder="Re-enter Password"><br />
    <input type="submit" value="Submit"/>
</form>

</body>
</html>
