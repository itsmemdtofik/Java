// write a java program to demostrate the use of sub class
class student
{
	private int rno;
	private String sname;
	public student(String s,int r)
	{
		rno=r;
		sname=s;
	}
	public void display()
	{
		System.out.println("the name of student is="+sname);
		System.out.println("student rool number is="+rno);
	}
} 
class marks extends student
{
	private int marks1;
	private int marks2;
	public marks(String s,int r,int m1,int m2)
	{
		super(s,r);
		marks1=m1;
		marks2=m2;
	}
	public void displaymarks()
	{
		System.out.println("student marks1="+marks1);
		System.out.println("students marks2 is="+marks2);
	}

}
class pgm7
{
	public static void main(String[] args) {
		marks m=new marks("Mohammad Taufique",18,92,95);
		m.display();
		m.displaymarks();
	}
}