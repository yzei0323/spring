<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>짱 좋은!!!! 이미지 </h2>

<img src="<%=request.getContextPath()%>/resources/imgs/${data}">
<img src="${pageContext.request.contextPath}/resources/imgs/${data}">

</body>
</html>