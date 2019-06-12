<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script>
$(function(){
	$("#btn").click(function(){
	$.ajax({
	url:"User_reg",
	data:{uname:$("#name").val()},
	success:function(data){
		alert(data);
		if(data=="用户名已存在"){
			$("#prompt").html("用户名已存在");
			}
			}	
		});
		});
});

</script>
<body>
 <form method="post">
用户名:<input type="text" name="uname" id="name"/><span id="prompt"></span><br>
<button type="button" id="btn">注册</button>
</form>

</body>
</html>