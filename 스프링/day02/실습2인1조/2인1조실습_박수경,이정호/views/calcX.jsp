<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>두 수를 사용자로 부터 입력 받아 사칙연산(XML)</h1>
	
	<form action="<%=request.getContextPath() %>/calcX" method="post">
		<input type="number" name="num1">
		
		<select name="oper">
			<option value="plus">+</option>
			<option value="minus">-</option>
			<option value="multi">*</option>
			<option value="divide">/</option>
		</select>
		
		<input type="number" name="num2">
		<button>계산</button>
	</form>
	
	<p>결과 : ${result }</p>
</body>
</html>