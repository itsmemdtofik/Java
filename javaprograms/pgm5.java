//write a java program to demostrate the use of nested class//
class outer
{
	private int a=10,b=20;
	class inner
	{
		public void display()
		{
			System.out.println("The a value is="+a+" "+" The b value is="+b);
		}
	}
}
class pgm5
{
	public static void main(String arg[])
	{
		outer o=new outer();
		outer.inner i=o.new inner();
		i.display();
	}
}