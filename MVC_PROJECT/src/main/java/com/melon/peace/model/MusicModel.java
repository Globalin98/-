package com.melon.peace.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.melon.peace.bean.Music;
import com.melon.peace.util.OracleConnection;

import jakarta.servlet.http.HttpServletRequest;

public class MusicModel {

	public static void writeMusic(HttpServletRequest req) {
		Connection conn = null;
		try {
			conn = OracleConnection.getConnection();
			conn.setAutoCommit(false);

			StringBuffer sb = new StringBuffer();
			sb.append(" INSERT INTO MUSIC (MUSIC_NO, TITLE, VOCAL) ");
			sb.append(" VALUES (SEQ_MUSIC.NEXTVAL, ?, ?) ");
			PreparedStatement stmt = conn.prepareStatement(sb.toString());
			stmt.setObject(1, req.getParameter("title"));
			stmt.setObject(2, req.getParameter("vocal"));
			stmt.executeUpdate();

			sb = new StringBuffer();
			sb.append(" INSERT INTO MUSIC_DETAIL (MUSIC_DETAIL_NO, RELEASE_COMP, RELEASE_DATE, MUSIC_NO) ");
			sb.append(" VALUES (SEQ_MUSIC_DETAIL.NEXTVAL, ?, ?, SEQ_MUSIC.CURRVAL) ");
			stmt = conn.prepareStatement(sb.toString());
			stmt.setObject(1, req.getParameter("releaseComp"));
			stmt.setObject(2, req.getParameter("releaseDate"));
			stmt.executeUpdate();

			conn.commit();

		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
//			try {
//				if (conn != null) conn.close();
//			} catch(Exception e){
//				e.printStackTrace();
//			}
		}
	}

	public static List<Music> listMusic(HttpServletRequest req) {
		Connection conn=null;
		List<Music> musicList = null;
		try {
			conn = OracleConnection.getConnection();
			musicList = new ArrayList<Music>();
			
			Statement stmt = conn.createStatement();
			StringBuffer sb = new StringBuffer();
			sb.append(" SELECT  M.MUSIC_NO ");
			sb.append("         ,M.TITLE ");
			sb.append("         ,M.VOCAL ");
			sb.append("         ,D.RELEASE_COMP ");
			sb.append("         ,TO_CHAR(D.RELEASE_DATE, 'YYYY/MM/DD') AS RELEASE_DATE ");
			sb.append(" FROM MUSIC M ");
			sb.append(" INNER JOIN MUSIC_DETAIL D ");
			sb.append(" ON M.MUSIC_NO = D.MUSIC_NO ");
			sb.append(" ORDER BY D.RELEASE_DATE DESC ");
			ResultSet rs = stmt.executeQuery(sb.toString());
			while (rs.next()) {
				Music music = new Music();
				music.setMusicNo(rs.getString("MUSIC_NO"));
				music.setVocal(rs.getString("VOCAL"));
				music.setTitle(rs.getString("TITLE"));
				music.setReleasComp(rs.getString("RELEASE_COMP"));
				music.setReleasDate(rs.getString("RELEASE_DATE"));
				musicList.add(music);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		return musicList;
	}
}
