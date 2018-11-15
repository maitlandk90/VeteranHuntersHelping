<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 10/1/18
  Time: 6:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign In</title>
</head>
<body>

<%@ include file="links.jsp"%>


    <form method="POST" action="j_security_check">
        <%--<c:choose>--%>
            <%--<c:when test="${existingSessionErrorMessage}">--%>
                <%--<p>${existingSessionErrorMessage}</p>--%>
                <%--<c:remove var="existingSessionErrorMessage"/>--%>
            <%--</c:when>--%>
            <%--<c:otherwise>--%>
                <p>${signUpSuccessMessage}</p>
                <c:remove var="signUpSuccessMessage"/>

                <p>${signInErrorMessage}</p>
                <c:remove var="signInErrorMessage"/>

                <%--<input type="text" name="Username" placeholder="Username"><br />--%>
                <%--<input type="text" name="Password" placeholder="Password"><br />--%>
                <%--<input type="submit" value="Submit">--%>

                <INPUT TYPE="TEXT" NAME="j_username" placeholder="Username">
                <INPUT TYPE="PASSWORD" NAME="j_password" placeholder="Password">
                <INPUT TYPE="SUBMIT" VALUE="Log In">

            <%--</c:otherwise>--%>
        <%--</c:choose>--%>
    </form>

</body>
</html>
