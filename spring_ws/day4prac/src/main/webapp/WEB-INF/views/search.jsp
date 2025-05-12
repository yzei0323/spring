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
	//alert("조회 확인용 ~~ 잘 뜨나여");
	
	//ajax, fetch를 사용하여 서버의 데이터 요청하기 (화면전환없이 데이터 가져오기)
	//$.ajax( {} );
	
	$.ajax({
		type:"GET",
		url:"/prac4/members",
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