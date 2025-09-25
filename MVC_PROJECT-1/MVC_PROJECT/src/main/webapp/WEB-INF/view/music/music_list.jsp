<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.melon.peace.bean.Music" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style>
		  table, th, td {
		    border: 1px solid black;
		    border-collapse: collapse;
		  }
		</style>
	</head>
	<body>
		<div>
			<h4><a href="/MVC_PROJECT/">Home</a></h4>
		</div>
		<div>
			<h1>MUSIC LIST</h1>
		</div>
		<div>
			<table>
				<tr>
					<th>No.</th>
					<th>Title</th>
					<th>Vocal</th>
					<th>ReleaseComp</th>
					<th>ReleaseDate</th>
				</tr>
				<%
					List<Music> musicList = (List<Music>)request.getAttribute("musicList");
					for (int i = 0 ; i < musicList.size() ; i++) {
						Music music = musicList.get(i);
				%>
				<tr>
					<td><%=i+1 %></td>
					<td><%=music.getTitle() %></td>
					<td><%=music.getVocal() %></td>
					<td><%=music.getReleasComp() %></td>
					<td><%=music.getReleasDate() %></td>
				</tr>
				<%	
					}
				%>
				
			</table>
		</div>
	</body>
	
	
	
	
	
	
	
	
</html>