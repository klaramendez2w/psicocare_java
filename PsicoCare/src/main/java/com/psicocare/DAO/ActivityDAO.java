package com.psicocare.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.psicocare.models.Activity;

public class ActivityDAO extends DAO {

	protected ActivityDAO() throws Exception {
		super();

	}

	private static ActivityDAO instance = null;

	public static ActivityDAO getInstance() throws Exception {
		if (instance == null)
			instance = new ActivityDAO();

		return instance;
	}

	public Activity getActivityByAid(int aidInt) throws SQLException {
		Activity resactivity = null;

		String url = "jdbc:mysql://localhost/psicocare";

		Connection conn = datasource.getConnection();

		String sql = "SELECT `aid`, `statement`, `value`, `about`, `description`, `content`, `countdown` FROM actividad WHERE aid=?";
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setInt(1, aidInt);

		ResultSet rs = psmt.executeQuery();

		while (rs.next()) {

			resactivity = new Activity(aidInt, rs.getString(2), rs.getString(3), rs.getString(4));
		}
		rs.close();
		psmt.close();
		conn.close();

		return resactivity;
	}
	
	

}
