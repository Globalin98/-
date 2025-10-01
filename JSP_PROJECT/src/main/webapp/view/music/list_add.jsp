<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<%!	
	public static List<Map<String,String>> musicList = new ArrayList<Map<String,String>>();
%>
		
<%
	String title = request.getParameter("title");
	String vocal = request.getParameter("vocal");
	String releaseComp = request.getParameter("releaseComp");
	String releaseDate = request.getParameter("releaseDate");
	
	if (null==title){
		throw new Exception("속이 뻥~~~~");
	}	
	
	Map<String, String> musicMap = new HashMap<String,String>();
	musicMap.put("title", title);
	musicMap.put("vocal", vocal);
	musicMap.put("releaseComp", releaseComp);
	musicMap.put("releaseDate", releaseDate);
	
	musicList.add(musicMap);
	
	application.setAttribute("musicList", musicList);
	
	response.sendRedirect("./list_music.jsp");
//	request.getRequestDispatcher("/list_music.jsp").forward(request, response);
%>