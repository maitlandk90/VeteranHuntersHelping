<html>

<%@ include file="head.jsp"%>


<div class="container">
    <div class="row">
        <div id="center-div">
            <form class="form-group" method="POST" action="signUp">
                <%--<p>${signUpErrorMessage}</p>--%>
                <c:if test="${not empty signUpErrorMessage}">
                    <p>${signUpErrorMessage}</p>
                </c:if>
                <c:remove var="signUpErrorMessage"/>
                    <br />
                <input class="form-control" type="text" name="Username" id="Username" placeholder="Username"><br />
                <input class="form-control" type="text" name="Password" id="Password" placeholder="Password"><br />
                <input class="form-control" type="text" name="RePassword" id="RePassword" placeholder="Re-enter Password"><br />
                <input class="form-control" type="submit" value="Submit"/>
            </form>
        </div>
    </div>
</div>
</body>
</html>
