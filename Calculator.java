package packageName;
import java.util.Scanner;

public class Calculator {

	static double num1;
	static double num2;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num1 = scanner.nextDouble();
		System.out.print("Enter a number: ");
		num2 = scanner.nextDouble();
		
		// Clear Buffer
		scanner.nextLine();
		
		System.out.print("Enter an operation (A, S, M, D): ");
		String op = scanner.nextLine();
		
		double result;
		
		switch(op) {
		case "A":
			result = num1 + num2;
			break;
		case "S":
			result = num1 - num2;
			break;
		case "M":
			result = num1 * num2;
			break;
		case "D":
			result = num1 / num2;
			break;
		default:
			result = 0;
		}
		
		System.out.println(result);
		
		scanner.close();
	}
}
