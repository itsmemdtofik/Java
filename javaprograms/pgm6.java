//write a java program to implement the array of obeject//
class student
{
	private int rno;
	private String sname;
	public student(int r,String sa)
	{
		
		rno=r;
		sname=sa;

	}
	public void display()
	{
		System.out.println("The name of student is="+sname);
		System.out.println("The roll number of student is="+rno);
	}

}
class pgm6
{
	public static void main(String args[])
	 {
		student s[]=new student[5];
		System.out.println("The display details student\n\n");
		s[0]=new student(1,"mohammad taufique");
		s[1]=new student(2,"mohammad irfan");
		s[2]=new student(3,"mohammad tauqeer");
		s[3]=new student(4,"mohammad shoeb");
		s[4]=new student(5,"nihal khan");
		for(int i=0; i<5; i++)
			s[i].display();

	}
}