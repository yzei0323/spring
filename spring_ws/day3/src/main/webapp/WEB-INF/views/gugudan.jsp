<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h2> 구구단 정보 !!</h2>



<% ArrayList<String>  list =(   ArrayList<String>)  request.getAttribute("data"); %>
<%
   for(  String item : list){
	  
%>
     <div>  <%=item %></div>

<%
}

%>

<h2> 구구단 정보 !!</h2>



<c:forEach  var="item" items="${data}">
 <div>${item} </div>
</c:forEach>


</body>
</html>