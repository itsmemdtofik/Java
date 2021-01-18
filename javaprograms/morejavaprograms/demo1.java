
public class demo1 {
    public static void main(String[] args) throws java.io.IOException {

        char ch;
        ch = 'x';
        System.out.println(ch);
        ch++;
        System.out.println(ch);
        ch = 90;
        System.out.println("ch is now " + ch);
        int i = 123_45_1234;
        System.out.println(i);
        int k = 0;
        k = k + 1;
        System.out.println(k);
        System.out.println("------------------------------");
        ++k;
        System.out.println(k);
        System.out.println("------------------------------");
        k++;
        System.out.println(k);
        System.out.println("------------------------------");
        k++;
        System.out.println(k);
        System.out.println("------------------------------");
        k++;
        System.out.println(k);
        System.out.println("------------------------------");
        k++;
        System.out.println(k);
        System.out.println("------------------------------");
        int s = 10;
        int l = ++s;
        System.out.println(s + "\t" + l);
        System.out.println("------------------------------");
        int c = 10;
        int d = c++;
        System.out.println(c + "\t" + d);
        System.out.println("------------------------------");

        char f;
        System.out.println("Press a key from the keyboard:");
        ch = (char) System.in.read(); /* Get a Character */
        System.out.println(ch);
        System.out.println("------------------------------");

        boolean t = true;
        first: {
            second: {
                third: {
                    System.out.println("Before the break.");
                    if (t)
                        break second; // break out of second block
                    System.out.println("This won't execute");
                } // end of third
            } // end of second
            System.out.println("This is after second block.");
        } // end of first
        // end of main()
        // end of class
        for (i = 0; i < 10; i++) {
            System.out.println(i + "");
            if ((i % 2) == 0)
                continue;
            System.out.println();
        }
        int dd=4 << 4;
        System.out.println(dd);

    }
}
