<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style>
			
		</style>
	</head>
	<body>
		<div>
			<h3>Netflex Home</h3>
		</div>
		<div>
			<span style="color:gray">
				${sessionScope.userInfo.name }님 (${sessionScope.userInfo.age }상)환영합니다.
			</span>
			<span style="color:orange">
				${requsetScope:genreMsg }
			</span>
			<span>
				<button onclick="document.getElementById('logoutForm').submit();">로그아웃</button>
			</span>
				<form action="${pageContext.request.contextPath }/netflex/logout" method="post"></form>
		</div>
		<div>
			<img src="${pageContext.request.contextPath }/resources/images/netflexhome.png">
		</div>
		<div>
			<form id="logoutForm" action="${pageContext.request.contextPath }/netflex/logout" method="post"></form>
		</div>
		
		<script src="${pageContext.request.contextPath }/resources/js/netflex.js"></script>
		
		<script>
			function readCookie(){
				let ip = getCookie('IP');
				if(null != ip){
					let msg = '당신은 '+getCookie('IP')+' 에서 접속하셨습니다.';
					alert(msg);
					setCookie("IP", '', 0);
				}
			}
		</script>
	</body>
</html>