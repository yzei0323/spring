<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>BMI 계산하기</title>
</head>
<body>
    <h2>BMI 계산기</h2>

    <form action="<%=request.getContextPath()%>/result" method="post">
        키(cm): <input type="text" name="h"><br>
        몸무게(kg): <input type="text" name="w"><br>
        <button type="submit">BMI 계산하기</button>
    </form>
</body>
</html>
