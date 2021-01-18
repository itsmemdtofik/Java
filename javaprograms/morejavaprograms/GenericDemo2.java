/* A simple program with generic class parameter as per bounded type */

class numericFans<T extends Number> {
    T num;

    /* pass the constructor a reference to a numeric object */
    numericFans(T n) {
        num = n;
    }

    double reciprocal() {
        return 1 / num.doubleValue();
    }

    /* return the fraction value */
    double fracional() {
        return num.doubleValue();
    }

}

public class GenericDemo2 {
    public static void main(String[] args) {

        
        numericFans<Integer> nob;
        nob = new numericFans<Integer>(5);
        System.out.println("Reciprocal part is =" + nob.reciprocal());
        System.out.println("Fractional part is =" + nob.fracional());

        System.out.println("------------------------------------------");
        numericFans<Double> dob = new numericFans<Double>(5.25);
        System.out.println("Reciprocal part is =" + dob.reciprocal());
        System.out.println("Fractional part is =" + dob.fracional());
    }

}
