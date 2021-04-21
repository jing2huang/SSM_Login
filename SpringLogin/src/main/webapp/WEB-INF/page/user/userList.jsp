<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="/WEB-INF/tld/c.tld"%>
<head>
    <meta charset="UTF-8">
    <title>用户管理界面</title>
</head>
<body>
    <h1>用户管理</h1></br>
    <a href="">添加</a>
    <table border="1" style="width:300px;">
        <tr>
            <th>用户 ID</th>
            <th>用户姓名</th>
            <th>用户年龄</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${list }" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.age}</td>
            <td>
                <a href="">修改</a>
                <a href="">删除</a>
            </td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>