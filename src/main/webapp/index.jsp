<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script> //引入jquery

    <script>
        //页面加载，绑定单击事件
       $(function () {
            $("#btn").click(function () {
                alert("jquery引入成功");
            })
       })
    </script>
</head>
<body>
    <button id="btn"> 发送ajax的请求</button>
</body>
</html>

<%--但是tomcat启动之后，发现不能访问到js/jquery.min.js文件，因为js/jquery.min.js是静态文件，现在的配置是读取不到的，所以现在要去springmvc.xml文件去配置静态资源过滤--%>
