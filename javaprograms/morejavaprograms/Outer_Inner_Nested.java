class Outer {
    int nums[];

    Outer(int n[]) {
        nums = n;
    }

    void analyze() {

        Inner inob = new Inner();
        System.out.println("Minimum value is = " + inob.min());
        System.out.println("Maximum value is = " + inob.max());
        System.out.println("Average value is = " + inob.avg());

    }

    class Inner {
        int min() {
            int m = nums[0];

            for (int i = 1; i < nums.length; i++)
                if (nums[i] < m)
                    m = nums[i];
            return m;
        }

        int max() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++)
                if (nums[i] > m)
                    m = nums[i];
            return m;
        }

        int avg() {
            int a = 0;
            int m = nums[0];
            for (int i = 1; i < nums.length; i++)
                a = a + nums[i];
            return a / nums.length;

        }
    }

}

public class Outer_Inner_Nested {
    public static void main(String[] args) {
        int x[] = { 4, 5, 6, 4, 2, 1, 89, 33, 2, 1, 434, 53, 2 };
        Outer outob = new Outer(x);
        outob.analyze();
    }

}
