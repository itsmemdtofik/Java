// write a java program to practice using string class and it nested using string buffer class and its method//
import java.lang.*;
class pgm8
{
	public static void main(String arg[])
	{
		System.out.println("-----------------static string------------------\n");
		String s1=new String("STATIC STRING");
		System.out.println("giving string is="+s1);
			System.out.println("length of a string is="+s1.length());
				System.out.println("Uppercase string is="+s1.toUpperCase());
					System.out.println("Lowercase string is="+s1.toLowerCase());
						System.out.println("the character is 4th position is="+s1.charAt(4));
							System.out.println("replacing c by k is="+s1.replace('C','K'));
		String s2="static string";
                                System.out.println("combining two string is="+s1.concat(s2));
				System.out.println("s1 equal to s2 is="+s1.equalsIgnoreCase(s2));
				int n=s1.compareTo(s2);
				if(n==0)
						System.out.println("s1==s2");
					else
						if(n>0)
								System.out.println("s1>s2");
							if(n<0)
									System.out.println("s1<s2\n");
		System.out.println("------------------STRING BUFFER---------------\n\n");
		StringBuffer sb1=new StringBuffer("DYNAMIC STRING");
			System.out.println("given string is="+sb1);
				System.out.println("length of string is="+sb1.length());
                                  System.out.println("memory capacity="+sb1.capacity());
                                  sb1.setLength(9);
                                  System.out.println("after seting length string is="+sb1);
                                  System.out.println("after inserting string is="+sb1.insert(9,"string"));
					
System.out.println("after the deleting the string is="+sb1.delete(8,14));
System.out.println("after appending string is="+sb1.append("DYNAMIC"));

                  sb1.setCharAt(1,'i');
                  System.out.println("the string is="+sb1);
                  System.out.println("after reversing is="+sb1.reverse());


	}
}