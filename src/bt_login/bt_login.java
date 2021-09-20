package bt_login;
import java.util.*;  
import java.util.Scanner;

public class bt_login {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter your username");
		String username = input.nextLine();
		System.out.println("Enter your password");
		String password = input.nextLine();
		if(username.equals("HuyHoang") && password.equals("2021")) {
			System.out.println("Login success!");
		}
		else {
			System.out.println("Wrong username or password!");
		}
		
	}
}
