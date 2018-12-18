<html>

<%@ include file="head.jsp"%>


    <form action="j_security_check" method="POST">
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
