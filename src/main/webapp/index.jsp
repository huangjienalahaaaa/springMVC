<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>

    <script>
       $(function () {
            $("#btn").click(function () {
              // 发送ajax请求
                $.ajax({
                    // 编写json格式，设置属性和值
                    url:"user/testAjax",
                    contentType:"application/json;charset=UTF-8", //发送信息到服务器时内容的编码类型
                    data:'{"username":"hehe","password":"123","age":30}',
                    dataType:"json", /*
                    预期服务器返回的数据类型。如果不指定，jQuery将根据http包MIME信息来智能判断，比如XML MIME类型就被识别为XML。在1.4中，JSON就
                    会生成一个Jvascript对象，而script则会执行这个脚本。随后服务器端返回的数据就会根据这个值解析后，传递给回调函数。可用值：
                        1. “xml”:返回XML文旦，可用jquery处理，
                        2. "html":但会纯文本HTML信息；包含script标签会插入dom时执行。
                        3. “script”:返回纯文本Javascript代码。不会自动缓存结果。除非设置了"cache"参数。注意：在远程请求时（不在同一个域下），所有
                            POST请求都将转为GET请求。（因为将使用DOM的script标签来加载）
                       4. “json”:返回json数据
                       5. "jsonp":jsponp格式。使用jsonp形式调用函数时，如"myurl?callback=?"jQuery将自动替换？为正确的函数名，以执行回调函数。
                       6. "text":返回纯文本字符串、
                    */
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
