//write a java program to define a class,define instance method and overload them//
class overload
{
	public void display( String s)
	{
		System.out.println("String is="+s);
	}
	public void display(int a)
	{
		System.out.println("the integer is="+a);
	}
	public void display(double d)
	{
		System.out.println("the double value is="+d);
	}
	public void display(float f,int y)
	{
		System.out.println("the float value is="+f+" "+" integer value is="+y);
	}
}
class pgm4{
	public static void main(String arg[])
	{
		overload o=new overload();
		o.display("hellow to Mohammad Taufique Pathan");
		o.display(100);
		o.display(58.45);
		o.display(43f,10);
	}
}