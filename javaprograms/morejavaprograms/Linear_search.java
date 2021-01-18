import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        int search, count = 0;
        int flag = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of element ");
        int n = scanner.nextInt();
        int[] names = new int[n]; // new array created here
        System.out.println("Enter those element " + n);
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextInt();
        }
        System.out.println("Enter the element to be Search : ");
        search = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (names[i] == search) {
                System.out.println("Element is persent at location= " + search + "\t" + (i + 1));
                count++;
                flag = 1;
                break;
            }

        }
        if (flag == 1)
            System.out.println("The found at location and count is= " + search + "\t" + (count+1));
        else {
            System.out.println("Element is not found = " + search);
        }

    }
}