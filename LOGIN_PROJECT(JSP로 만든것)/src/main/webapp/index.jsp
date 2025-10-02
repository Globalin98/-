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
		<%
			Object userinfo = session.getAttribute("userinfo");
			if ( null==userinfo) {
		%>
		<div>
			<form action="${pageContext.request.contextPath }/netflex/login" method="post">
				<input type="text" name="userId" placeholder="아이디">
				<input type="password" name="userPw" placeholder="비밀번호">
				<input type="submit" value="로그인">			
			</form>
		</div>
		<%
			} else {
		%>
		<div>
			<h3>${sessionScope.userInfo.name }님 (${sessionScope.userInfo.age }살)로그인 중입니다.</h3>
			<form action="${pageContext.request.contextPath }/netflex/login" method="post">
				<input type ="submit" value="로그아웃">			
			</form>
		</div>
		<%
			}
		%>
	</body>
</html>