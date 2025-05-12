<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script>
function search(){
	
	$.ajax({
		type:"GET",
		url:"/prac4/members/1",
		success: function( data ){
			console.log(data);
		},
		error: function( err ){
			console.log(err);
		}
	});
	
	
}
</script>

</head>
<body>

<h2>결과</h2>
<div class="result"></div>
<button onclick="search()">고객조회하기</button>

</body>
</html>