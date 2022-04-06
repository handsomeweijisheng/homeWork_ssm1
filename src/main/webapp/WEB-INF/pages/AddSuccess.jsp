<%--
  Created by IntelliJ IDEA.
  User: weijisheng
  Date: 2022/2/28
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>展示界面</title>
</head>
<body>
<table cellpadding="1px">
    <tr>
        <th>商品名字</th>&nbsp;&nbsp;
        <th>商品价格</th>&nbsp;&nbsp;
        <th>商品照片</th>&nbsp;&nbsp;
        <th>类型</th>&nbsp;&nbsp;
    </tr>
<%--      <c:forEach items="${typeList}" var="type">
                        <option value="${type.typeId}">${type.typeName}</option>
                    </c:forEach>--%>
    <c:forEach items="${goodAll}" var="goods">
        <tr>
            <td><span>${goods.goodsName}</span></td>
            <td><span>${goods.goodsPrice}</span></td>
            <td><img width="40px" height="40px" src="${pageContext.request.contextPath}/imgs/${goods.goodsPhoto}"/></td>
            <td><span>${goods.typeId}</span></td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
