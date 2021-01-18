
interface Y{
    public interface Z {
        boolean isNotNegative(int x);
    }

    void doSomething();
}

class Z implements Y.Z {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

public class Nested_Interface {
    public static void main(String[] args) {
        Y.Z nif = new Z();
        if (nif.isNotNegative(10)) {
            System.out.println("10 is not a negative number:");
        }
        if (nif.isNotNegative(-12)) {
            System.out.println("-12 is a negative number:");
        }

    }

}
