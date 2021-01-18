public class Exception {
    public static void main(String[] args) {
        int[] names = new int[4];
        System.out.println("Before Genarate eception");
        try {
            names[7] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Of Bound Exception");
        }
        System.out.println("DOnt go upside");
    }

}
