<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--把数据封装Account类中，类中存在list和map的集合--%>
<form action="params/saveAccount" method="post">
    姓名：<input type="text" name="username"><br/>
    密码：<input type="text" name="password"><br/>
    金额：<input type="text" name="money"><br/>


    用户的姓名：<input type="text" name="list[0].uname"><br/>
    用户的年龄：<input type="text" name="list[0].age"><br/>


    用户的姓名：<input type="text" name="map['one'].uname"><br/>
    用户的年龄：<input type="text" name="map['one'].age"><br/>


    <input type="submit" value="提交">
</form>

</body>
</html>
