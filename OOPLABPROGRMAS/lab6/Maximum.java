package lab6;

public class Maximum {
    public int max(int num1, int num2, int num3) {
        int res = num1 > num2 ? num1 > num3 ? num1 : num3 : num2 > num3 ? num2 : num3;
        return res;
    }

    public int max(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public int max(int arr[][]) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

}