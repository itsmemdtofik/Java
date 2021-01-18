import java.lang.*;
class STATIC
{
	static int a=10;
	static void taufique()
	{
		System.out.println("The a value is="+a);
		a++;
	}
}
	class staticpgm
	{
		public static void main(String[] args)
		 {
			STATIC.taufique();
			System.out.println("The a value is="+STATIC.a);
		}
	}
