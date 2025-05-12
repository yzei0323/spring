<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 모델로 전달된 이미지 이름 -->

${img}

<!-- 이미지 가져오는 매핑 요청하기 -->
<!-- pathVariable, path뒤에 값 전달 -->
<!-- /prac4/images/귀여운이미지.jpg -->
<img src="<%=request.getContextPath()%>/images/${img}">

</body>
</html>