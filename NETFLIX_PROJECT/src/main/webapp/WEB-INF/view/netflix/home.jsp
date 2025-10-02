<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div>
			<h1>Netflex Home</h1>
		</div>
		<div>
			<span>
				${sessionScope.userInfo.name }님(${sessionScope.userInfo.age }살) 환영합니다.
			</span>
			<span>
				<button onclick="document.getElementById('logoutForm').submit();">로그아웃</button>
			</span>
		</div>
		<br>
		<div>
			<img src="${pageContext.request.contextPath }/resources/images/netflix/home.png">
		</div>
		<form id="logoutForm" action="${pageContext.request.contextPath }/netflix/logout" method="post">
		</form>
	</body>
</html>