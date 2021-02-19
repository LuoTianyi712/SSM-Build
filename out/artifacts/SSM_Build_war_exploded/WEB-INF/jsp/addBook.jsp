<%--
  Created by IntelliJ IDEA.
  User: LiuFeiyu
  Date: 2021/2/19
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>JSP：Add-Book</title>
        <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    </head>

    <body>
        <div class="container">
<%--------------------------------------------------------------------------------------------------------------------%>
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <div class="page-header">
                        <h1>
                            <small>书籍列表 -------- 新增书籍</small>
                        </h1>
                    </div>
                </div>
            </div>
<%--------------------------------------------------------------------------------------------------------------------%>
        <form action="${pageContext.request.contextPath}/book/addBook" method="post">
            <%--<div class="form-group">
                <label for="BookId">书籍编号</label>
                <input type="text" name="bookID" class="form-control" id="BookId">
            </div>--%>
            <div class="form-group">
                <label for="BookName">书籍名称</label>
                <input type="text" name="bookName" class="form-control" id="BookName" required>
            </div>
            <div class="form-group">
                <label for="BookCounts">书籍数量</label>
                <input type="text" name="bookCounts" class="form-control" id="BookCounts" required>
            </div>
            <div class="form-group">
                <label for="BookDetail">书籍描述</label>
                <input type="text" name="detail" class="form-control" id="BookDetail" required>
            </div>

            <button type="submit" class="btn btn-default">Submit</button>
        </form>
<%--------------------------------------------------------------------------------------------------------------------%>
        </div>
    </body>
</html>
