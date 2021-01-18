
interface Iconst {
    int MIN = 0;
    int MAX = 10;
    String ERRMSG = "Boundary Error";
}

public class Constant_Interface implements Iconst {
    public static void main(String[] args) {
        int[] nums = new int[MAX];
        for (int i = MIN; i <= MAX; i++) {
            if (i >= MAX) {
                System.out.println(ERRMSG);
            } else {
                nums[i] = i;
                System.out.println(nums[i] + "");
            }
        }
    }

}
