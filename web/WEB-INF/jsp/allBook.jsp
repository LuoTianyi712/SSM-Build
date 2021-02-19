<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.neusoft.pojo.Books" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LiuFeiyu
  Date: 2021/2/18
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>

<html>
    <head>
        <title>JSP: All-Book</title>
        <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表 -------- 显示所有书籍</small>
<%--                    <%--%>
<%--                        List<Books> list = (List<Books>) request.getAttribute("list");--%>
<%--                        out.print(list.size());--%>
<%--                    %>--%>
                </h1>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                    <tr>
                        <th>书籍编号</th>
                        <th>书籍名称</th>
                        <th>书籍数量</th>
                        <th>书籍详情</th>
                    </tr>
                </thead>
                <%--从数据库中查询--%>
                <tbody>
<%--                <c:if test="${list.size() == 3}">--%>
<%--                    <h1>111111111</h1>--%>
<%--                </c:if>--%>
                    <c:forEach items="${list}" var="b">
                        <tr>
                            <td>${b.bookID}</td>
                            <td>${b.bookName}</td>
                            <td>${b.bookCounts}</td>
                            <td>${b.detail}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>

    </body>
</html>