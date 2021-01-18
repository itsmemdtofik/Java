//   write java program to implement wrapper classes and its method   //
import java.lang.*;
import java.io.*;

class pgm12
{
	public static void main(String[] args) {
		
		DataInputStream T= new DataInputStream(System.in);
		try
		{
			System.out.println("Enter one Integer Value");
			Integer i1= Integer.valueOf(T.readLine());
			int i=i1.intValue();

			System.out.println("Enter one double  Value");
			Double i2= Double.valueOf(T.readLine());
			double d=i2.doubleValue();

			System.out.println("Enter one float Value");
			Float i3= Float.valueOf(T.readLine());
			float  f=i3.floatValue();

			System.out.println("Enter one long Value");
			Long i4= Long.valueOf(T.readLine());
		    Long l=i4.longValue();

			System.out.println("Integer Number="+i);
			System.out.println("double Number="+d);
			System.out.println("Float Number="+f);
			System.out.println("Long Number="+l);
		}
		catch(Exception e)
		{
System.out.println("My name is taufique");
		}
	}
}