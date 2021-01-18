
/* Write a program to use selection sort technique and give your
/*public class Selection_sort_Integer {
    public static void main(String[] args) {
        int names[] = {23,45,11,23,78};
        int n=names.length;
        System.out.println("Before sorting:");
        for(int i=0; i<n;i++){
            System.out.println(names[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <n; j++) {
                int temp;
                if (names[i]>(names[j])) {
                    temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;

                }
            }
        }
        System.out.println("After Sorting:");
        for(int i=0; i<n;i++){
            System.out.println(names[i]);
        }

    }

}
*/
/* Write a program to use selection short technique take input from user */
import java.util.Scanner;

class Selection_sort_Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] names = new int[100];
        System.out.println("Enter the size of Element ");
        int n = scanner.nextInt();
        names = new int[n];
        System.out.println("Enter the number of element for Sorting ");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextInt();
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
        }
    }
}

/*
 * class Selection_sort_Integer { public static void main(String[] args) {
 * Scanner scanner = new Scanner(System.in); String[] names = new String[100];
 * System.out.println("Enter the size of Strings "); int n = scanner.nextInt();
 * names = new String[n]; System.out.println("Enter the names for sorting ");
 * for (int i = 0; i < n; i++) { names[i] = scanner.nextLine(); }
 * System.out.println("---BEFORE SORTING---"); for (int i = 0; i < n; i++) {
 * System.out.println(names[i]); } for (int i = 0; i < n; i++) { for (int j = i
 * + 1; j < n; j++) { String temp; if (names[i].compareTo(names[j])>0) { temp =
 * names[i]; names[i] = names[j]; names[j] = temp; } } }
 * System.out.println("---AFTER SORTING---"); for (int i = 0; i < n; i++) {
 * System.out.println(names[i]); } } }
 */