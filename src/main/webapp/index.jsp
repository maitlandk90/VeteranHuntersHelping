<!DOCTYPE html>
<html>

<%@ include file="head.jsp"%>

<body>

    <div class="jumbotron text-center">
        <h1>Hunters Helping</h1>
        <img src="images/background.jpg">
        <%@ include file="links.jsp"%>
    </div>

    <div class="container">
        <div class="row">
            <div class="col-sm-4">
                <p>Something Here</p>
            </div>
            <div class="col-sm-4">
                <p>List of Users</p>
                <table>
                <c:forEach var="hunter" items="${huntersOnHome}">
                    <tr>
                        <th><a href="profile?id=${hunter.id}">${hunter.username}</a></th>
                        <th>${hunter.username}</th>
                    </tr>
                </c:forEach>
                </table>
            </div>
            <div class="col-sm-4">
                <a class="twitter-timeline" data-width="250" data-height="550" href="https://twitter.com/monsterhunter?ref_src=twsrc%5Etfw">Tweets by Monster Hunter</a> <script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
            </div>
        </div>
    </div>


</body>


<html/>
