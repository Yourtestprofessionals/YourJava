package codebase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectMySQL {

	public static void connection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static String[] ConnectionToMySql(String SqlInput) {
		connection();
		String[] resultaat = null;

		String host = "jdbc:mysql://192.168.50.238:3306/yourdb";
		String username = "Your";
		String password = "Your";

		try {
			Connection connect = DriverManager.getConnection(host, username,
					password);
			PreparedStatement statement = (PreparedStatement) connect
					.prepareStatement(SqlInput);
			ResultSet data = statement.executeQuery();
			data.next();

			//Ophalen objecten uit database
			Object bevinding_id = data.getObject("bevinding_id");
			Object category_id = data.getObject("category_id");
			Object reproducibility = data.getObject("reproducibility");
			Object severity = data.getObject("severity");
			Object priority = data.getObject("priority");
			Object platform = data.getObject("platform");
			Object os = data.getObject("os");
			Object os_build = data.getObject("os_build");
			Object handler_id = data.getObject("handler_id");
			Object summary = data.getObject("summary");
			Object description = data.getObject("description");
			Object steps_to_reproduce = data.getObject("steps_to_reproduce");
			Object additional_info = data.getObject("additional_info");
			Object custom_field_5 = data.getObject("custom_field_5");
			Object custom_field_1 = data.getObject("custom_field_1");
			
			String[] opsommingresultaat; 
			opsommingresultaat = new String [15];
			
			opsommingresultaat[0] = bevinding_id.toString();
			opsommingresultaat[1] = category_id.toString();
			opsommingresultaat[2] = reproducibility.toString();
			opsommingresultaat[3] =	severity.toString();			
			opsommingresultaat[4] = priority.toString();
			opsommingresultaat[5] =	platform.toString();
			opsommingresultaat[6] = os.toString();
			opsommingresultaat[7] = os_build.toString();
			opsommingresultaat[8] = handler_id.toString();
			opsommingresultaat[9]= summary.toString();
			opsommingresultaat[10]= description.toString();
			opsommingresultaat[11]= steps_to_reproduce.toString();
			opsommingresultaat[12]=	additional_info.toString();
			opsommingresultaat[13]= custom_field_5.toString();
			opsommingresultaat[14]= custom_field_1.toString();
					
			resultaat = opsommingresultaat;
			statement.close();
			connect.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultaat;
	}
	public static String[] ConnectTestcase(String SqlInput) {
		connection();
		String[] resultaat = null;

		String host = "jdbc:mysql://192.168.50.238:3306/yourdb";
		String username = "Your";
		String password = "Your";

		try {
			Connection connect = DriverManager.getConnection(host, username,
					password);
			PreparedStatement statement = (PreparedStatement) connect
					.prepareStatement(SqlInput);
			ResultSet data = statement.executeQuery();
			data.next();

			//Ophalen objecten uit database
			Object tc_id = data.getObject("tc_id");
			Object tc_naam = data.getObject("tc_naam");
						
			String[] opsommingresultaat; 
			opsommingresultaat = new String [2];
			
			opsommingresultaat[0] = tc_id.toString();
			opsommingresultaat[1] = tc_naam.toString();
								
			resultaat = opsommingresultaat;
			statement.close();
			connect.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultaat;
	}
	public static String GeefTcNaam (int TcId) {
		
		String[] connectionToMySql = ConnectMySQL.ConnectTestcase("select * from tbd_testcase where tc_id =" + TcId);
		
		return connectionToMySql[1];
	}
}
