<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script>
function reg(){
//	alert("ksdjfsd");

	//$.ajax({});
	let id = $("#id").val();  // document.querySelector("#id").value
	let pw = $("#pw").val();
	let name = $("#name").val();
	alert(name);
	
	//값 뽑아와서 json으로 만들기
	let member = {"id":id, "pw":pw, "name":name};
	console.log(member);
	
	$.ajax({
		type:"POST",
		url:"/prac4/members",
		data:JSON.stringify(member),
		contentType: "application/json",
		success: function(data){
			console.log(data);
		},
		error: function(err){
			console.log(err);
		}
	});

}
</script>
</head>
<body>

<input type="text" id="id">
<input type="text" id="pw">
<input type="text" id="name">
<button onclick="reg()">등록하기</button>

</body>
</html>