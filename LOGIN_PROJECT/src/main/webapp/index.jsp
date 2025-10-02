<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div>
			<h1>Netflex Login Form</h1>
		</div>
		<div>
			<input type="text" name="genre" placeholder="좋아하는 장르는"><br>
		</div>
		<div>
			<form onsubmit ="" action= "${pageContext.request.contextPath }/netflex/login" method="post">
				<input type="text" name="userId" placeholder="아이디"><br>
				<input type="password" name="userPw" placeholder="비밀번호"><br>
				<input type="submit" value="로그인"><br>
			</form>
		</div>
		<script src="${pageContext.request.contextPath }/resources/js/netfslex.js"></script>
		<script>
			function login(){
				setCookie('GENRE', document.genre.value, 60);
			}
		</script>
	</body>
</html>