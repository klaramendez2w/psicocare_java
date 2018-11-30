package com.psicocare.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TestDAO {

	private static TestDAO instance = null;

//Singleton de instancias de TESTDAO//
	public static TestDAO getInstance() throws Exception {
		if (instance == null)
			instance = new TestDAO();

		return instance;
	}

	private TestDAO() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();// new com.mysql.jdbc.Driver
	}

	// Metodo para validar los campos del Registro (register)
	public Boolean validateregisterform(String nombrerec, String emailrec, String userrec, String password1rec,
			String password2rec) {

		Boolean ok = true;
		// HAY QUE AÑADIR VALIDACION REGEX (Copiando la de JS)
		if ((nombrerec == null) || (nombrerec == "")) {
			ok = false;
			System.out.println("1 mal");
		}
		if ((emailrec == null) || (emailrec == "")) {
			ok = false;
			System.out.println("2 mal");
		}
		if ((userrec == null) || (userrec == "")) {
			ok = false;
			System.out.println("3 mal");
		}
		if ((password1rec == null) || (password1rec == "") || (password1rec != password2rec)) {
			ok = false;
			System.out.println(password1rec + "!=" + password2rec);
			System.out.println("4 mal");
		}

		else {

			System.out.println(ok);
		}
		// String regex = "[a-zA-Z0-9\\._\\-]{3,}";
		// OR || OR//
		System.out.println("Todo bn");

		return ok;

	}

	public boolean subidatest(Double anxiedad, Double depresion, Double estres, Double anxiedadsocial) throws SQLException {
		
		boolean ok=false;
		
		String url = "jdbc:mysql://localhost/PsicoCare";

		Connection conn = DriverManager.getConnection(url, "psicocare_user", "psicokiller");
		conn.setAutoCommit(false);
		try {	
		String sql = "INSERT INTO test( respuesta1, respuesta2, respuesta3, respuesta4, respuesta5, anxiety, depression, social_anxiety, stress) VALUES (?,?,?,?,?,?,?,?,?);";
		
		
		
		PreparedStatement psmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		psmt.setInt(1,1);//Se generan solos o me va a tocar darle al AI?//
		psmt.setInt(2,2 );
		psmt.setInt(3,3 );
		psmt.setInt(4,4 );
		psmt.setInt(5,5 );
		psmt.setDouble(6, anxiedad );
		psmt.setDouble(7, depresion);
		psmt.setDouble(8, estres );
		psmt.setDouble(9, anxiedadsocial);
	
		
		psmt.executeUpdate();

		ResultSet rs = psmt.getGeneratedKeys();
		

			int idtablausuario_test = rs.getInt(1);
		

		rs.close();
		psmt.close();

		// INSERTAR CLIENTE_CUENTA
		sql = "	INSERT INTO test_usuario(tid, resultados) VALUES (?);";
		psmt = conn.prepareStatement(sql);
		
		psmt.setInt(1, idtablausuario_test);
		//Aqui identificador de usuario, de momento se meten valores manualmente, habra que sacarlos de get session

		psmt.executeUpdate();
		ok=true;
		psmt.close();

		conn.commit();
	
		} catch (Exception e) {
			System.out.println("Excepcion tx:" + e.getMessage());
			conn.rollback();
			throw new SQLException();
		}

		conn.close();
		return ok;
	}

	
}
