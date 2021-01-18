
//   write a java program to implement inheritance and 
//   demonstrate the use of method overriding
class A
{
	protected int a=10;
	public void display()
	{
		System.out.println("a value is="+a);
	}
}
class B
{
	int a=20;
	public void display()
	{
		System.out.println("a value is="+a);
	}
}
class pgm9
{
	public static void main(String[] args) {
		B b=new B();
		b.display();
	}
}