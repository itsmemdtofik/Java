import java.util.Scanner;

class Selection_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] names = new int[100];
        System.out.println("Enter the size of Element ");
        int n = scanner.nextInt();
        names = new int[n];
        System.out.println("Enter the number of element for Sorting ");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextInt();
            System.out.println("Hello to Java Programming");
        }
        System.out.println("---BEFORE SORTING---");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp;
                if (names[i] > names[j]) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("---AFTER SORTING---");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
            System.out.println("Hello to JAVA");
            System.out.println("Hello to Mohammad Tofik");
        }
    }
}
