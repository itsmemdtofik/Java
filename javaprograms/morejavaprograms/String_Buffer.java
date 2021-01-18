import java.lang.*;



public class String_Buffer {
    public static void main(String[] args) {
        System.out.println("------------STATIC STRING------------");
        String s1 = new String("static string ");
        System.out.println("Given string is = " +s1);
        System.out.println("The length of the string = "+s1.length());
        System.out.println("Lower Case string = "+s1.toLowerCase());
        System.out.println("To Upper Case string = " +s1.toUpperCase());
        System.out.println("Display Charater at 4th position = "+s1.charAt(4));
        System.out.println("Replace c by k is = " +s1.replace('c','k'));

        /**New String created here */
        String s2="static string";
        System.out.println("Combining two string = " +s1.concat(s2));
        System.out.println("s1 equal to = "+s1.equalsIgnoreCase(s2));

        int n;
        n=s1.compareTo(s2);
        if(n==0)
            System.out.println("s1 = s2");
            else if(n>0)
                System.out.println("s1 > s2");
                else if(n<0)
                    System.out.println("s1 < s2");
                    else
                        System.out.println("s1 is not equal to s2");

                    /**New string buffer created */

                    System.out.println("\n-------STRING BUFFER----------");

                    StringBuffer sb1=new StringBuffer("DYNAMIC STRING");
                    System.out.println("Given string is = "+sb1);
                    System.out.println("Length of the string "+sb1.length());
                    System.out.println("Memory capacity "+sb1.capacity());

                    /**Setting new length */
                    sb1.setLength(9);
                    System.out.println("After setting length is = " +sb1.length());
                    System.out.println("After inserting string is = " +sb1.insert(9, "string"));
                    System.out.println("After deleting the string is = " +sb1.delete(8, 14));
                    System.out.println("After appending string is = " +sb1.append("DYNAMIC"));

                    /**Setting new position */
                    sb1.setCharAt(1, 'i');
                    System.out.println("The new string is "+sb1);
                    System.out.println("After reversing the string is = " +sb1.reverse());

               


    }

}
