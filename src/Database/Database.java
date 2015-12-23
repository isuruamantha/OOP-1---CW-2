package Database;

//New class to connect the mysql database and the Eclipse GUI

import javax.swing.*;
import java.sql.*;

public class Database {

	Connection conn = null;

	public static Connection ConnecrDb() { // this will create method to connect
											// DB

		// to handle the exceptions
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/FootballChampionship", "root", "isuru");
			return conn;

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;

		}
	}

}