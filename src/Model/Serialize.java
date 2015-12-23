package Model;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

//this  class for the serialize the objects and write it in the file io and the database. Then de-serialize and use again
public class Serialize implements Serializable {

	public void serialize(List<FootballClub> football) {

		try {
			FileOutputStream fileOut = new FileOutputStream("isuru.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			//System.out.println("this is the out : " + out);
			out.writeObject(football);
			//System.out.println("this is the name after write : " + out);
			out.close();
			fileOut.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		//  deserialize an Object
		try {
			FileInputStream fileIn = new FileInputStream("isuru.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			List<FootballClub> iis = new ArrayList<FootballClub>();

			iis = (List<FootballClub>) in.readObject();

			for (FootballClub is : iis) {
				System.out.println(is);
			}
			in.close();
			fileIn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
