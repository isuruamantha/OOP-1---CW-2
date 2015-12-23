package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import Model.FootballClub;

public class DatabaseManager {

	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pst = null;
	
	public DatabaseManager() {
		conn = Database.ConnecrDb();
	}
	
	public void addObjects(ArrayList<FootballClub> football){
		System.out.println("size of the arraylist : " + football.size());
		try {
			String sql = "Insert into footballObjects (name) values (?)";
			pst = conn.prepareStatement(sql);

			for(FootballClub list : football){
				FootballClub name = list;
			pst.setObject(1, name);
			}
		

			pst.execute();
		System.out.println("details added succesfully");


		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public Object returnObjects(ArrayList<FootballClub> football){
		System.out.println("size of the arraylist : " + football.size());
		try {
			String sql = "Select from footballObjects (name) values (?)";
			pst = conn.prepareStatement(sql);

			for(FootballClub list : football){
				FootballClub name = list;
			pst.setObject(1, name);
			}
		

			pst.execute();
		System.out.println("details added succesfully");

		return null;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
}
