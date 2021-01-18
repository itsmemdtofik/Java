import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        int first, last, mid;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of the Element ");
        int n = scanner.nextInt();
        int[] binary = new int[n];
        System.out.println("Enter the element ");
        for (int i = 0; i < n; i++) {
          binary[i] = scanner.nextInt();


        }
        System.out.println("Enter the Element to Search ");
        int search = scanner.nextInt();

        first = 0;
        last = n - 1;
        mid = (last + first) / 2;

        while (first <= last) {
            if (binary[mid] < search) {
                first = mid + 1;
            } else if (binary[mid] == search) {
                System.out.println(search + "Found at locations " + (mid + 1) + ",");
                break;
            } else {
                last = mid - 1;
                mid = (last + first) / 2;
            }

        }
        if (first > last) {
            System.out.println(search + "Is not found in the list ");
        }

    }

}
