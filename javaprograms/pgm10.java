
//  write a java program to implement multilevel inheritance to
//  applying various access control to its data member and method

class student
{
	protected int rno;
	protected String name;
	public void readdata(int r,String s)
	{
		rno=r;
		name=s;
	}
	public void display()
	{
		System.out.println("student name is="+name);
		System.out.println("student roll number is="+rno);
	}
}
class marks extends student
{
	protected int test1,test2,test3;
	public void readmarks(int t1,int t2,int t3)
	{
		test1=t1;
		test2=t2;
		test3=t3;
	}
}
class result extends marks
{
	private int total;
	public void showresult()
	{
		total=test1+test2+test3;
		System.out.println("test1 value is="+test1);
		System.out.println("test2 value is="+test2);
		System.out.println("test3 value is ="+test3);
		System.out.println("total value is="+total);
	}
}
class pgm10
{
	public static void main(String[] args) {
		result r=new result();
		r.readdata(18,"Mohammad Tofik");
		r.readmarks(17,18,20);
		r.display();
		r.showresult();
	}
}