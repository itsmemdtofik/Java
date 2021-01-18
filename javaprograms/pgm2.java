//write a java program to define a class define instance method for seting// 
//and reteriving value of instance variable and instentiate its obeject//
class employee
{
	private String ename;
	private int eno;
	private double salary;
	public  void  setdata(String s,int n,double sa)
	{
		ename=s;
		eno=n;
		salary=sa;
		
	}
	public void display()
	{
		System.out.println("employee name is="+ename);
		System.out.println("employee number is="+eno);
		System.out.println("employee salary is="+salary);
	}
	}
	class pgm2
	{
		public static void main(String arg[])
		{
			employee e1=new employee();
			e1.setdata("tofik",18,486776.75);
			e1.display();
		}
	}
