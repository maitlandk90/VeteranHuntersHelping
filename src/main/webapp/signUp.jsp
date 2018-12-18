<html>

<%@ include file="head.jsp"%>



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
