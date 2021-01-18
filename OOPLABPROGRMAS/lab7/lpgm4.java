/* Design a Interface called series with the following method
* 1.Get Next(return the next number in series )
* 2.reset(to restart the series)
* 3.setStart(to set the value from which the series should startt
Design a class named byTwo that will implement the method of the interface series such that it generate a series of number.
Each 2 greater than the previous one and include the main method. */


package lab7;

import java.util.Scanner;

import static java.lang.System.exit;

interface series {
    void getNext();

    void reset();

    void setStart();
}

class byTwo implements series {
    int num1;
    int num2;

    byTwo(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public void reset() {
        num1 = 0;
        num2 = 0;
        System.out.println("Starting point reset to Zero");
    }

    public void getNext() {
        for (int i = 0; i < num2; i++) {
            num2 = num2 - 2;
            System.out.println("Number one is = " + num2);
        }
    }

    public void setStart() {
        System.out.println("Enter starting point : ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Enter the number of terms : ");
        int num2 = scanner.nextInt();
        System.out.println("Strating point is = "+num1);
        System.out.println("Number of term is = "+num2);

    }


}

public class lpgm4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int n = 1;
        byTwo bobj = new byTwo(num1, num2);
        while (n != 0) {
            System.out.println("------------------------------------------");
            System.out.println("1-Set Start");
            System.out.println("2-getNext");
            System.out.println("3-Reset");
            System.out.println("4-Exit");
            System.out.println("------------------------------------------");
            System.out.println("Enter the choice : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bobj.setStart();
                    break;
                case 2:
                    bobj.getNext();
                    break;
                case 3:
                    bobj.reset();
                    break;
                case 4:
                    exit(0);
                    break;
                default:
                    System.out.println("Invalid choice !");
            }
        }
    }
}
