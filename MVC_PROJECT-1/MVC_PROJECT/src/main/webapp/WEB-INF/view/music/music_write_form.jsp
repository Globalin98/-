<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div>
			<h1>MUSIC WRITE</h1>
		</div>
		<div>
			<form id="frm1" action="/MVC_PROJECT/music_write.melon" method="post">
				<input type="text" name="title" placeholder="Title"><br>
				<input type="text" name="vocal" placeholder="Vocal"><br>
				<input type="text" name="releaseComp" placeholder="Release Comp"><br>
				<input type="date" name="releaseDate" placeholder="Release Date"><br>
				<input type="button" id="btnWrite" value="WRITE">
			</form>
		</div>
		<script>
			document.getElementById('btnWrite').addEventListener('click',function(){
				if (confirm('Are you sure?')) {
					document.getElementById('frm1').submit();
				}
			});
		</script>
		
		
		
		
		
		
		
		
	</body>
</html>