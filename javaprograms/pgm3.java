//write a java program to define a class and desribe the constructor,overloading constructor//
//and its obeject//
class employee
{
	private String ename;
	private int eno;
	private double salary;
	public employee()
	{
		ename="Mohammad Taufique";
		eno=18;
		salary=40000.00;
	}
	public employee(String s,int n,double d)
	{
		ename=s;
		eno=n;
		salary=d;
	}
	public void display()
	{
		System.out.println("employee name is="+ename);
		System.out.println("employee number is="+eno);
		System.out.println("employee salary is="+salary);
	}
}
class pgm3
{
	public static void main(String arg[])
	{
		employee e1=new employee();
		employee e2=new employee("Mohammad Irfan Pathan",14,65733.00);
		e1.display();
		e2.display();
	}
}