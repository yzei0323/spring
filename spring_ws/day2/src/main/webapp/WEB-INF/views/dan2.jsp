<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>단 출력하기</title>
</head>
<body>


<h4>2단 출력하기</h4>

<c:forEach var="item" items="${dan2}">
${item}<br>
</c:forEach>

</body>
</html>