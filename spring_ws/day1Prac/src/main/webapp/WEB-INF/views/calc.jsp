<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>calcForm</title>
</head>
<body>

 <form action="<%=request.getContextPath()%>/calc" method="post">
 <input type="text" name="su1" placeholder="수를 입력하세요.">
 <input type="text" name="su2" placeholder="수를 입력하세요.">
 <button>계산하기</button>
 </form>

</body>
</html>