<html>

<%@ include file="head.jsp"%>


<div class="container">
    <div class="row">

        <h2>Search Results: </h2>
        <table class="table table-bordered">
                <tr>
                    <th>UserName</th>
                    <th>Rank</th>
                </tr>

            <c:forEach var="hunter" items="${hunters}">
                <tr>
                    <td><a href="profile?id=${hunter.id}">${hunter.username}</a></td>
                    <td>${hunter.rank}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>

</body>
</html>
