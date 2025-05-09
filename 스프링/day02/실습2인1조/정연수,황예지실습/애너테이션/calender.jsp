<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calender</title>
</head>
<body>
<form action="<%= request.getContextPath()%>/calender" method="post">
<input type="text" name="order" placeholder="원하는 요일을 입력">
결과:${result }
</form>
</body>
</html>