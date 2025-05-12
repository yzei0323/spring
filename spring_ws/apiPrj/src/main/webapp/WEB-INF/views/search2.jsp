<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>

$(document).ready( function(){
	//alert(" 문서로드 완료 되었어");
	$("#searchBtn").click( function(){
		//alert("클릭되었어");
		search();
	});
});


function search(){
	alert("조회합니다");
	$.ajax( {
		type:"GET" , 
		url: "/api/members" ,
		success:function(data){
			//let dataHtml = toHtml(data);
		//	$("#result").html(dataHtml);
			console.log(data);
		},
		error: function(){
			alert( error);
		}
    }); // 매개변수값을 전달하는데 json타입의 객체로 넘겨줌
}


function toHtml(data){	 
	console.log( data);	
	let str="";
	/*for( let i=0 ; i< data.length; i++){
		let item = data[i];
		str+= "<div>"+ item.id + item.name +"</div>";  
	} 
	*/

	
	data.forEach( function( item, index){
		str+= "<div>"+ item.id + item.name +" bbb </div>";  
	});
	
	/*
	data.forEach( ( item, index) =>{
		str+= "<div>"+ item.id + item.name +"</div>";  
	});
	*/
	
	 
	return str;
}
</script>
</head>
<body>
화면이다 !!
<div id="result">
</div>
<button id="searchBtn"> 고객조회</button>
</body>
</html>