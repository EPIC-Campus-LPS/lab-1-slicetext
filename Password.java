package packageName;
import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a username: ");
		String username = scanner.nextLine();
		System.out.print("Enter a password: ");
		String password = scanner.nextLine();
		
		if(username.equals("admin") && password.equals("1234password")) {
			System.out.println("Login Successful!");
		} else {
			System.out.println("Login Failed! Please try again.");
		}
	}
}
