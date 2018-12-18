<!DOCTYPE html>
<html>

<%@ include file="head.jsp"%>


    <div class="container">
        <div class="row">
            <div class="col-sm-8">
                <h2>Hunters</h2>
                <div id="hunters">
                    <c:forEach var="hunter" items="${huntersOnHome}">
                        <p id="hunter-profile-box">
                            <a href="profile?id=${hunter.id}">${hunter.username}</a><br>
                            ${hunter.rank}
                        </p>
                    </c:forEach>
                </div>
            </div>
            <div class="col-sm-4">
                <a class="twitter-timeline" data-width="250" data-height="550" href="https://twitter.com/monsterhunter?ref_src=twsrc%5Etfw">Tweets by Monster Hunter</a> <script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
            </div>
        </div>
    </div>


</body>


</html>
