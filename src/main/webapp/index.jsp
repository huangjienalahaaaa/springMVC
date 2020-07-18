<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>

    <script>
       $(function () {
            $("#btn").click(function () {
                $.ajax({
                    url:"user/testAjax",
                    contentType:"application/json;charset=UTF-8", //发送信息到服务器时内容的编码类型
                    data:'{"username":"hehe","password":"123","age":30}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        // data服务器端响应的json的数据，进行解析
                    }
                })
            })
       })
    </script>
</head>
<body>
    <button id="btn"> 发送ajax的请求</button>
</body>
</html>
