<%--
  Created by IntelliJ IDEA.
  User: weijisheng
  Date: 2022/3/1
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品添加界面</title>
</head>
<body>
<center>
    <form action="/goods/add" method="post" enctype="multipart/form-data">
        <table>
            <tr>
                <th>商品名字</th>&nbsp;&nbsp;
                <th>商品价格</th>&nbsp;&nbsp;
                <th>商品照片</th>&nbsp;&nbsp;
                <th>类型</th>&nbsp;&nbsp;
            </tr>
            <tr>
               <td><input type="text" name="goodsName" placeholder="商品名字"></td>
                <td><input type="text" name="goodsPrice" placeholder="商品价格"></td>
                <td><input type="hidden" name="goodsPhoto" value="1"></td>
                <td><input type="file" name="fileuploadimgs" placeholder="商品图片"></td>&nbsp;&nbsp;
             <td><input type="button" value="商品类型"></td>&nbsp;&nbsp;
                    <td><select name="typeId">
                    <c:forEach items="${typeList}" var="type">
                        <option value="${type.typeId}">${type.typeName}</option>
                    </c:forEach>
                </select></td>
            </tr>
        </table>
        <input type="submit">
    </form>
</center>
</body>
</html>
