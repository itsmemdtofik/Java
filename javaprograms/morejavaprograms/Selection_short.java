// Write a program to short usding string or character
public class Selection_short {
    public static void main(String[] args) {
        String names[] = { "Allen", "Tofik", "Lithesh", "Pallavi" };
        int n = names.length;
        System.out.println("Before shorting:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String temp;
                if (names[i].compareTo(names[j]) > 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }

}