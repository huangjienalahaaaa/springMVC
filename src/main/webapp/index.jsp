<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>Title</title>
<body>
    <h3>文件上传</h3>

    <form action="/user/fileUpload2" method="post" enctype="multipart/form-data">
        选择文件：<input type="file" name="upload"><br/>
        <input type="submit" value="上传">
    </form>
</body>
</html>
