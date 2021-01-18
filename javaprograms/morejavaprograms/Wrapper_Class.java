import java.util.*;

public class Wrapper_Class {
    public static void main(String[] args) {

        Vector v = new Vector();
        
        v.addElement("one");
        v.addElement("two");
        v.addElement("three");

        v.insertElementAt("zero", 0);
        v.insertElementAt("oop", 3);
        v.insertElementAt("four", 5);

        System.out.println("Vector size is = " + v.size());
        System.out.println("The capacity is = " + v.capacity());

        System.out.println("Th total element \n");
        for (int i = 0; i < v.size(); i++)
            System.out.println(v.elementAt(i));
        System.out.println("The first element of vector is = " + v.firstElement());
        System.out.println("The first element of vector is = " + v.lastElement());
        System.out.println("The position of oop is = " + v.indexOf("oop"));

        v.removeElement("oop");
        v.removeElement("3");
        System.out.println("----After removing the vector element----");
        System.out.println("The vecctor size is now = " + v.size());

        System.out.println("Total element now \r\n");
        for (int i = 0; i < v.size(); i++)
            System.out.println(v.elementAt(i));

        /** Copy vector element to array */
        String[] anArray = new String[v.size()];
        v.copyInto(anArray);
        System.out.println("Displaying array element");
        for (int i = 0; i < v.size(); i++)
            System.out.println(anArray[i]);

    }

}
