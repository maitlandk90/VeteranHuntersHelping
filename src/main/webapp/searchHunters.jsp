<!DOCTYPE html>
<html>
<head>
    <title>Hunters Helping Hunter Search</title>
    <meta http-equiv="Content-Language" content="English" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body>

<%@ include file="links.jsp"%>


<div class="container-fluid">
    <h2>Search Results: </h2>
    <table class="table table-bordered">
            <tr>
                <th>UserName</th>
            </tr>

        <c:forEach var="hunter" items="${hunters}">
            <tr>
                <th>${hunter.username}</th>
            </tr>
        </c:forEach>
    </table>

</div>

</body>
</html>
