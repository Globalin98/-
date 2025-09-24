<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<%
	List<Map<String,String>> musicList 
		= (List<Map<String,String>>)application.getAttribute("musicList");

%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style>	table, th, td{
				border: 1px solid black;
				border-collapse: collapse;
		</style>
	</head>
	<body>
		<div>
			<h1>MUSIC LIST</h1>
			
		</div>
		<div>
			<table>
				<tr>
					<th>NO</th>
					<th>title</th>
					<th>vocal</th>
					<th>releaseComp</th>
					<th>releaseDate</th>
				</tr>
				<%
					for(int i=0; i<musicList.size(); i++){
						Map<String,String> music = musicList.get(i);
				%>
				<tr>
					<td><%=i+1 %></td>
					<td><%=music.get("title") %></td>
					<td><%=music.get("vocal") %></td>
					<td><%=music.get("releaseComp") %></td>
					<td><%=music.get("releaseDate") %></td>
				</tr>
				<%
					}
				%>
			</table>
		</div>
	</body>
</html>