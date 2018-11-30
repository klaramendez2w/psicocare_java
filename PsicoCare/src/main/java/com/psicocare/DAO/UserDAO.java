package com.psicocare.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import java.util.ArrayList;



public class UserDAO {

	private static UserDAO instance = null;

	public static UserDAO getInstance() throws Exception {
		if (instance == null)
			instance = new UserDAO();

		return instance;
	}

	public boolean subidausuario(String nombrerec, String emailrec, String userrec, String password1rec, Double anxiedad, Double depresion, Double estres, Double anxiedadsocial) throws SQLException {
		
		
		boolean ok=false;
		
		String url = "jdbc:mysql://localhost/PsicoCare";
		Connection conn = DriverManager.getConnection(url, "psicocare_user", "psicokiller");
		conn.setAutoCommit(false);
	
		try {
		
			String sql = "	INSERT INTO usuario (email, name, password, test) VALUES (?,?,?,?,?);";
			
			PreparedStatement psmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			psmt.setString(1,emailrec);
			psmt.setString(2,nombrerec );
			psmt.setString(3,userrec );
			psmt.setString(4,password1rec );
			
			
			psmt.executeUpdate();

			ResultSet rs = psmt.getGeneratedKeys();
			int idusuarioentablausuario_test = rs.getInt(1);
			

			rs.close();
			psmt.close();

			// INSERTAR CLIENTE_CUENTA
			sql = "INSERT INTO test_usuario( resultados) VALUES (?);";
			psmt = conn.prepareStatement(sql);
			
			psmt.setInt(1, idusuarioentablausuario_test);
			
			psmt.executeUpdate();
			
				
			TestDAO.getInstance().subidatest(anxiedad,depresion,estres,anxiedadsocial);		

			ok=true;
			psmt.close();

			conn.commit();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			conn.rollback();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

		conn.close();
		return ok;
	}	
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

