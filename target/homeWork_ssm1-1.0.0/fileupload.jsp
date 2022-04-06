<%--
  Created by IntelliJ IDEA.
  User: weijisheng
  Date: 2022/3/1
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<form action="/upload" method="post" enctype="multipart/form-data">
<%--  <input type="file" name="fileUpload">--%>
    <select name="10">
        <option value="1">100</option>
        <option value="2">200</option>
        <option value="3">300</option>
    </select>
    <input type="submit">
</form>
</body>
</html>
