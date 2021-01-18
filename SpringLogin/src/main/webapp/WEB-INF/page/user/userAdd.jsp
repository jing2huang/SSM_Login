<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
<title>用户新增</title>
</head>
<body>
    <h1>新增</h1>
    <form action="addUser.do" method="post">
        <label>用户姓名：</label><input type="text" name="name"/><br/>
        <label>用户年龄：</label><input type="text" name="age"/><br/>
        <input type="submit" value="确定"/><br/>
    </form>
</body>
</html>