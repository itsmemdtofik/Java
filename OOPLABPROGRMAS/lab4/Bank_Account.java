
/**Define a class to represent a bank acoount */

import java.util.Scanner;

class Bank {
    String name;
    String acc;
    double ammount;
    String ac_type;
    static float rate_of_interest;

    Bank(String a, String b, double c, String d, float e) {
        name = a;
        acc = b;
        ammount = c;
        ac_type = d;
        rate_of_interest = e;
    }

    public void deposit(int deposit) {
        this.ammount = this.ammount + deposit;
    }

    public void withdraw(int deposit) {
        if (this.ammount > deposit && this.ammount - 1 > 0) {
            this.ammount = this.ammount - deposit;
            System.out.println("Ammount after withdraw = " + this.ammount);

        } else {
            System.out.println("Low Balance,\t You can not withdraw now.");
            System.out.println("Your current balanace is = " + this.ammount);
        }
    }

    public void display() {
        System.out.println();
        System.out.println("-------Account holder Details--------");
        System.out.println("Name is = " + this.name);
        System.out.println("Account Number is = " + this.acc);
        System.out.println("Your Ammount is = " + this.ammount);
        System.out.println("Account type is = " + this.ac_type);

    }

    static void interest() {
        System.out.println("Rate of Interest is = " + rate_of_interest);
    }
}

public class Bank_Account {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------Enter details-------");
        System.out.println();
        System.out.println("Enter account type = ");
        String type = scanner.nextLine();
        System.out.println("Enter name = ");
        String name = scanner.nextLine();
        System.out.println("Enter Account number = ");
        String acc = scanner.nextLine();
        System.out.println("Enter Ammount = ");
        double ammount = scanner.nextDouble();
        System.out.println("Enter the rate of interest = ");
        float rate_of_interest = scanner.nextFloat();

        Bank bank = new Bank(name, acc, ammount, type, rate_of_interest);

        System.out.println("Enter the Ammount to Deposit = ");
        int a = scanner.nextInt();
        bank.deposit(a);

        System.out.println("Enter the ammount to withdraw = ");
        int w = scanner.nextInt();
        bank.withdraw(w);
        bank.display();
        bank.interest();

    }

}
