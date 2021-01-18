public class for_each {
    public static void main(String[] args) {
        int[] data = { 3, 4, 5, 6 };
        for (int i = 0; i < data.length; i++) {
            System.out.println("Simple Array=" + data.length);
        }
        for (int moreData : data) {

            System.out.println("For each loop value=" + moreData);
        }
        // Multi diamensional array using for each each loop
        int sum = 0;
        int nums[][] = new int[3][5];
        for (int i = 0; i < 3; i++) // give nums some values
            for (int j = 0; j < 5; j++)
                nums[i][j] = (i + 1) * (j + 1);
        // Use for-each for loop to display and sum the values
        for (int x[] : nums) // Notice how x is declared
        {
            for (int y : x) {
                System.out.println("Value is: " + y);
                sum += y;
            }
        }
        System.out.println("Summation: " + sum);
        // program using for each loop to search an unsorted array for a value. It stops
        // if the value is found.
        int nums1[] = { 6, 8, 3, 7, 5, 6, 1, 4 };
        int val = 5;
        boolean found = false;
        for (int x : nums1) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Value found!");

    }
}