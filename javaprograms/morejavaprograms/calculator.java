import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {

		int choice, ignore;
		Scanner scanner = new Scanner(System.in);
		for (;;) {
			do {
				System.out.println("-----------------------------");
				System.out.println("1-ADDITION");
				System.out.println("2-SUBSTRACTION");
				System.out.println("3-MULTIPLICATION");
				System.out.println("4-DIVISION");
				System.out.println("------------------------------\n");
				System.out.print("Enter your choice : ");
				choice = scanner.nextInt();
				switch (choice) {

				case 1:
					System.out.println("Enter the first number :");
					int a = scanner.nextInt();
					System.out.println("Enter the second number :");
					int b = scanner.nextInt();
					System.out.println("ADDITION IS = " + (a + b));
					System.out.println("Type any Character to Exit/Any number to Re-Enter");
					break;
				case 2:
					System.out.println("Enter the first number :");
					int d = scanner.nextInt();
					System.out.println("Enter the second number :");
					int e = scanner.nextInt();
					System.out.println("Substraction IS = " + (d - e));
					System.out.println("Type any Character to Exit OR any Number to Re-Enter");

					break;
				case 3:
					System.out.println("Enter the first number :");
					int g = scanner.nextInt();
					System.out.println("Enter the second number :");
					int h = scanner.nextInt();
					System.out.println("Multiplication IS = " + (g * h));
					System.out.println("Type any Character to Exit/Any number to Re-Enter");
					break;
				case 4:
					System.out.println("Enter the first number :");
					int j = scanner.nextInt();
					System.out.println("Enter the second number :");
					int k = scanner.nextInt();
					System.out.println("Division IS = " + (j / k));
					System.out.println("Type any Character to Exit/Any number to Re-Enter");
					break;

				default:
					System.out.println("----invalid choice----");
					System.out.println("Type any Character to Exit/Any number to Re-Enter");
				}
				ignore = scanner.nextInt();

			} while (ignore != '\n');

		}
	}
}
