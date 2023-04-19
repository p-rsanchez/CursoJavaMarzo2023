package curso.g9900.BBDD;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleJDBC {
	
	private static Connection conn;
	public final static String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public final static String URL = "jdbc:oracle:thin:@curso2023.gestionproyectos.com:1521:xe";
	public final static String DATABASE = "";
	public final static String USUARIO = "MGG_hr";
	public final static String PASSWORD = "Curso2023";

	public final static String SQL_LEER_TODOS = "Select * from Employees";
	public final static String SQL_LEER_TODOS_COUNTRY = "Select * from countries";

	public static void main(String[] argv) throws SQLException {

		System.out.println("-------- Oracle JDBC Connection Testing ------");
//-----------------Carga driver
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return;
		}
		System.out.println("Oracle JDBC Driver Registered!");

//-----------------Consigue conexion
		conn = null;
		try {
			conn = DriverManager.getConnection(URL + DATABASE, USUARIO, PASSWORD);
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}
		
		lecturaCountry();

		lecturaEmployees();
		if (conn != null) {
			System.out.println("You made it, take control your database now!");
			conn.close();
		} else {
			System.out.println("Failed to make connection!");
		}
	}

	public static void lecturaCountry() throws SQLException {

		ResultSet rs=null;
		try {
			Statement stm = conn.createStatement();
			rs = stm.executeQuery(SQL_LEER_TODOS_COUNTRY );

			while (rs.next()) {
				Country ctr = new Country();
				ctr.setCountry_id(rs.getString("country_id"));
				ctr.setCountry_name(rs.getString("country_name"));
				ctr.setRegion_id(rs.getInt("region_id"));
				listarCtr(ctr);		
			}
		} catch (SQLException e) {
			System.out.println(SQL_LEER_TODOS + " " + e.getMessage());
		} finally {
			if (rs!=null) {
				rs.close();
			}
		}
	}
	
	
	public static void lecturaEmployees() throws SQLException {

		ResultSet rs=null;
		try {
			Statement stm = conn.createStatement();
			rs = stm.executeQuery(SQL_LEER_TODOS );

			while (rs.next()) {
				System.out.println(rs.getString("First_name") + " " + rs.getString("last_name"));
			}
		} catch (SQLException e) {
			System.out.println(SQL_LEER_TODOS + " " + e.getMessage());
		} finally {
			if (rs!=null) {
				rs.close();
			}
		}
	}
	
	public static void listarCtr(Country ctr) {
		System.out.println(ctr.getCountry_id());
	}
}