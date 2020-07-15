<%--
* "isELignored=false"的作用:
    1.  ＜%@ page isELIgnored＝"true|false"%＞ 如果设定为真，那么JSP中的表达式被当成字符串处理。比如下面这个表达式${2000 % 20}, 在isELIgnored＝"true"时输出为${2000 % 20}，
    2. ，而isELIgnored＝"false"时输出为100。Web容器默认isELIgnored＝"false"。
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>入门成功了</h3>

<%--    request域对象中取值--%>
    <%--    ${requestScope.mgs} 可以简写，如下面这句--%>
    ${msg}

    <%--    session域对象中取值--%>
    ${sessionScope.msg}
</body>
</html>
