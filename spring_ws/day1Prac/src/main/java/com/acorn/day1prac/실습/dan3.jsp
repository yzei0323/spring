<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>3단 출력</h2>
	<% for(int i=1; i<10; i++) { %>
		<p>3 x <%=i %> = <%=3*i %></p>
	<% } %>
</body>
</html>