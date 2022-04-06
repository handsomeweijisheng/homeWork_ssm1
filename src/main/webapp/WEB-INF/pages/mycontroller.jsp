<%@ page language="java" contentType="text/html; charset=UTF-8"

         pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>请选择</title>

</head>

<body>

<form action="${pageContext.request.contextPath }/mycontroller"

      method="post">

    <input type="checkbox" name="interest" value="a1" />a1<br />

    <input type="checkbox" name="interest" value="a2" />a2<br />

    <input type="checkbox" name="interest" value="a3" />a3<br />

    <input type="checkbox" name="interest" value="a4" />a4<br />

    <input type="checkbox" name="interest" value="a5" />a5<br />

    <input type="submit"/>

</form>

</body>

</html>