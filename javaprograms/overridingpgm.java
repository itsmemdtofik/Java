class A
{
	private int a=50;
	public void display()
	{
		System.out.println("superclass A is="+a);
	}
}
class B extends A
{
	int a=30;
	public void display()
	{
		System.out.println("subclass A is="+a);
	}
}
class overridingpgm
{
	public static void main(String[] args) {
		B b=new B();
		b.display();
		
	}
}