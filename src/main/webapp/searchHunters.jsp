<!DOCTYPE html>
<html>

<%@ include file="head.jsp"%>

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
                <th><a href="profile?id=${hunter.id}">${hunter.username}</a></th>
                <th>${hunter.rank}</th>
            </tr>
        </c:forEach>
    </table>

</div>

</body>
</html>
