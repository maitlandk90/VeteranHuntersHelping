<html>

<%@ include file="head.jsp"%>

<div class="container">
    <div class="row">
        <div id="center-div">

            <form class="form-group" action="j_security_check" method="POST">
                <%--<p>${signUpSuccessMessage}</p>--%>
                <c:if test="${not empty signUpSuccessMessage}">
                    <p>${signUpSuccessMessage}</p>
                </c:if>
                <c:remove var="signUpSuccessMessage"/>

                <%--<p>${signInErrorMessage}</p>--%>
                <c:if test="${not empty signInErrorMessage}">
                    <p>${signInErrorMessage}</p>
                </c:if>
                <c:remove var="signInErrorMessage"/>
                <br />
                <INPUT class="form-control" TYPE="TEXT" NAME="j_username" placeholder="Username"><br>
                <INPUT class="form-control" TYPE="PASSWORD" NAME="j_password" placeholder="Password"><br>
                <INPUT class="form-control" TYPE="SUBMIT" VALUE="Log In">
            </form>
        </div>
    </div>
</div>
</body>
</html>
