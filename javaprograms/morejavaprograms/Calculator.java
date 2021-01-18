/* Write a java program as calculator using switch case statement */

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice, ignore = 0;
		int n;
		while (ignore != '\n') {
			System.out.println("\n1-ADDITION");
			System.out.println("\n2-SUBTRACTION");
			System.out.println("\n3-MULTIPLICATION");
			System.out.println("\n4-DIVISION");
			System.out.println("\n5-exit");
			System.out.println("\n");
			System.out.println("Enter your choice ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the number to add ");
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				System.out.println("The Addition of the numbers is " + (a + b));

				break;

			case 2:
				System.out.println("Enter the number to Substract ");
				int c = scanner.nextInt();
				int d = scanner.nextInt();
				System.out.println("The Subtraction of the numbers is " + (c - d));
				break;
			case 3:
				System.out.println("Enter the number to Multipli ");
				int e = scanner.nextInt();
				int f = scanner.nextInt();
				System.out.println("The Result of the numbers is " + (e * f));
				break;
			case 4:
				System.out.println("Enter the number to Divide ");
				double g = scanner.nextDouble();
				double h = scanner.nextDouble();
				System.out.println("The Result of the numbers is " + (g / h));
				break;
			default:
				System.out.println("Invalid Operation!");
			}
		}
	}

}
