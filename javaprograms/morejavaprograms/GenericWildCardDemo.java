
/*Write a program to display the value using Wild Card property of generic */

class NumericFans<T extends Number> {
    T num;

    NumericFans(T n) {
        num = n;
    }

    double reciprocal() {
        return 1 / num.doubleValue();
    }

    double fractional() {
        return num.doubleValue() - num.intValue();
    }

    /* Determine if the absolute value of two object are same or not */

    boolean absEqual(NumericFans<?> ob) {
        if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
            return true;
        return false;

    }

}

public class GenericWildCardDemo {
    public static void main(String[] args) {
        NumericFans<Integer> iob = new NumericFans<Integer>(6);

        NumericFans<Double> dob = new NumericFans<Double>(-6.0);
        NumericFans<Long> dob1 = new NumericFans<Long>(5L);

        System.out.println("-------------------------------------------\n");

        System.out.println("Testing is going to be done between object ---iOb--- and ---dob---");
        if (iob.absEqual(dob))
            System.out.println("Absolute values are equal");
        else
            System.out.println("Absolute values are differ");

        System.out.println();
        System.out.println("Testing again between --iob--- and ---dob1---");
        if (iob.absEqual(dob1))
            System.out.println("Absolute values are equal");
        else
            System.out.println("absolute values are differ");

    }

}
