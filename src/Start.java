import java.util.Scanner;
import View.Menu;


public class Start {

	//Main class of the whole program. And it will call the start method of the menu class
	/*
	 * User Name and password is = isuru
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the user Name : ");
		String name = sc.nextLine();
		System.out.print("Enter the user Password : ");
		String password = sc.nextLine();
		
		if(name.equalsIgnoreCase("isuru") && password.equalsIgnoreCase("isuru")){
			Menu start = new Menu();
			start.intialDisplay();
		}else{
			System.out.println("User name or password is incorrect! Input again!");
			main(args);
		}
	}

}
