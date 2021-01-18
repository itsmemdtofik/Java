public class return_value_to_method {
    public static void main(String[] args) {
        ChkNum e = new ChkNum();
        if (e.isEven(10))
            System.out.println("10 is even");
        if (e.isEven(9))
            System.out.println("9 is even");
        if (e.isEven(8))
            System.out.println("8 is even");
        int[][] data = new int[3][];
        data[0] = new int[1];
        data[1] = new int[2];
        data[2] = new int[4];

        int[][] moreData = { { 1 }, { 2, 3 }, { 4, 5, 6 } };
        System.out.println(moreData.length);
        // displays no. of rows 3

        System.out.println(moreData[2].length);
        // displays no. of cols in 2nd row , i.e., 3
    }

}

class ChkNum {
    boolean isEven(int x) {
        if ((x % 2) == 0)
            return true;
        else
            return false;

    }
}