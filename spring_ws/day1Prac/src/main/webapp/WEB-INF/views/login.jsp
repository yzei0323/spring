<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--form action="<%=request.getContextPath()%>/login" method="post"-->
<form action="<%=request.getContextPath()%>/login2" method="post">
<!--form action="<%=request.getContextPath()%>/login3" method="post"-->
<input type="text" name="id">
<input type="text" name="pw">
<button>login</button>
</form>

</body>
</html>