/* Create a simple generic class and dislay the output one type parameter */
class Gen<T> {
    T ob; /* Declare an obeject of type T */

    /* Pass the constructor a reference to an object of type T */
    Gen(T o) {
        ob = o;
    }

    /* return the obeject of generic class value */
    T getOb() {
        return ob;
    }

    /* Display the value of type T */
    void dislay() {
        System.out.println("Type of T is = " + ob.getClass().getName());
    }

}

public class GenericDemo {
    public static void main(String[] args) {

        /* Create a Gen reference for Integer */
        Gen<Integer> iob;
        iob = new Gen<Integer>(88);
        iob.dislay();

        /* Get the value in iob Notice that no cast is needed */
        int v = iob.getOb();
        System.out.println("Value is = " + v);

        /* Create an object for String */
        Gen<String> strOb = new Gen<String>("Generic Example");
        strOb.dislay();

        /* get the values of strOb() */
        String str = strOb.getOb();
        System.out.println("The String value is = " + str);

    }

}
