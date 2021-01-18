//import java.util.Scanner;

/* Write a java program to sort the element using bubble sort  */
/*
class Bubble_sort {
    public static void main(String[] args) {
        int[] names = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size ");
        int n = scanner.nextInt();
        names = new int[n];
        System.out.println("Enter the Element ");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextInt();
        }
        System.out.println("---BEFORE SORTING---");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int temp;
                if (names[j] > names[j + 1]) {
                    temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                }
            }
        }
        System.out.println("---AFTER SORTING---");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }

    }
}
*/
/* Write a program to sort the string names usinf bubble sort */
/*
class Bubble_sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size ");
        int n = scanner.nextInt();
        String[] names = new String[n];
        System.out.println("Enter the Element ");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }
        System.out.println("---BEFORE SORTING---");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                String temp;
                if (names[j].compareTo(names[j + 1]) > 0) {
                    temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
        System.out.println("---AFTER SORTING---");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }

    }
}

*/

/* Write a program to sort the names or number suing bubble sot technique */
class Bubble_sort {
    public static void main(String[] args) {
        int[] names = { 11, -1,3, 1, 78, 22,-100,-21 };
        int n = names.length;
        System.out.println("---BEFORE SORTING---");
        for (int i = 0; i < n; i++) {
            System.out.print(names[i]+"\t\n");
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int temp;
                if (names[j] > names[j + 1]) {
                    temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
        System.out.println("---AFTER SORTING---");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]+"\t");
        }

    }
}
