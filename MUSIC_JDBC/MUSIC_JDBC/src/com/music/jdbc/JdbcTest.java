package com.music.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTest {

	public static void main(String[] args) {
		try {
			Connection conn = OracleConnection.getConnection();
			System.out.println(conn);
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM MUSIC");
			while (rs.next()) {
				String musicNo = rs.getString("MUSIC_NO");
				String title = rs.getString("TITLE");
				String vocal = rs.getString("VOCAL");
				String releaseDate = rs.getString("RELEASE_DATE");
				System.out.printf("%s. %s (%s). %s"
						,musicNo
						,title
						,vocal
						,releaseDate);
				System.out.println();
			}
			
			
			int result = stmt.executeUpdate(
					"INSERT INTO MUSIC (MUSIC_NO, TITLE, VOCAL, RELEASE_DATE) "
					+ "VALUES (1,'ランデヴー','シャイトープ','2025.8.1')");
//			System.out.println(result);

		} catch(Exception e) {
			e.printStackTrace();
		}


	}

}
