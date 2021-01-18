
//  write a java program to implement vector classes and its method   //
import java.util.*;
class pgm11
{
	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.addElement("one");
		v.addElement("two");
		v.addElement("three");
		v.insertElementAt("zero",0);
		v.insertElementAt("opp",3);
		v.insertElementAt("four",5);
		System.out.println("-------------------------------------------");
		System.out.println("vector size is="+v.size());
		System.out.println("-------------------------------------------");
		System.out.println("the capacity is="+v.capacity());
		System.out.println("-------------------------------------------");
		for(int i=0; i<v.size(); i++)
			System.out.println(v.elementAt(i));
		System.out.println("-------------------------------------------");
		System.out.println("First element of vector ="+v.firstElement());
		System.out.println("-------------------------------------------");
		System.out.println("Last Element of vector is="+v.lastElement());
		System.out.println("-------------------------------------------");
		System.out.println("position of oop="+v.indexOf("oop"));
		System.out.println("-------------------------------------------");
		v.removeElement("oop");
		v.removeElementAt(1);
		System.out.println("after removing the vector element ");
		System.out.println("-------------------------------------------");
		System.out.println("size="+v.size());
		System.out.println("-------------------------------------------");
		for(int i=0; i<v.size(); i++)
			System.out.println(v.elementAt(i));
		System.out.println("-------------------------------------------");
		System.out.println("copy vector to element to array");
		System.out.println("-------------------------------------------");
		String R[]=new String [v.size()];
		v.copyInto(R);
		System.out.println("displaying array element");
		System.out.println("-------------------------------------------");
		for(int i=0; i<v.size(); i++)
			System.out.println(R[i]);
		System.out.println("-------------------------------------------");
	}
}