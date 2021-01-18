public class multi_diamensional {
    public static void main(String[] args) {
        int[][] data = new int[3][]; // two diamensional array
        data[0] = new int[1];
        data[1] = new int[2];
        data[2] = new int[4];
        int[][] moreData = { { 1 }, { 2, 3 }, { 4, 5, 6 } };

        System.out.println(moreData.length);
        System.out.println(moreData[2].length); // number of rows

        // three diamensional array
        int[][][] tryD = new int[2][3][4];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 3; k++) {
                    tryD[i][j][k] = i + j + k;
                    System.out.println(tryD[i][j][k]);
                }
            }
        }
        // assigning array reference
        int nums1[] = new int[10];
        int nums2[] = new int[10];
        //Before assigning
        for (int i = 0; i < 10; i++){
            nums1[i] = i;
            System.out.println(nums1[i]);
        }
        for (int i = 0; i < 10; i++){
            nums2[i] = -i;
            System.out.println(nums2[i]);
        }
            nums1[2]=nums2[1];

    }

}