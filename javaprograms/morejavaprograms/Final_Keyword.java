/* If you do noe want to a class to be sub classed preecede the class declaration width the keyword final*/
// examle using final
public class Final_Keyword {

  /*  // example usimg final, read only
    final int x = 3;
    public static final double PI = 3.14159;

    // method final can not be wverriden
    final double getPI() {
        return PI;
    }*/
    public static void main(String[] args) {
       String s1="abc";
       String s2="def";
       System.out.println(s1.compareTo(s2));
    }
}