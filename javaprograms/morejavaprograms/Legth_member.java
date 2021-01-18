public class Legth_member {
    public static void main(String[] args) {
        int list[] = new int[10];
        int nums[] = { 1, 2, 3 };
        // a variable length
        int[][] table = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9, } };
        System.out.println("Length of list is=" + list.length);
        System.out.println("Length of numbers=" + nums.length);
        System.out.println("Table of length=" + table.length);
        System.out.println("Table of length table[0]=" + table[0].length);
       
    }

}