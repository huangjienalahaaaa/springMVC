<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="params/saveAccount" method="post">
    姓名：<input type="text" name="username"><br/>
    密码：<input type="text" name="password"><br/>
    金额：<input type="text" name="money"><br/>
    用户的姓名：<input type="text" name="User.uname"><br/>
    用户的年龄：<input type="text" name="User.age"><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
