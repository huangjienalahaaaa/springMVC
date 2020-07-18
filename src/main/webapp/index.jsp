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
