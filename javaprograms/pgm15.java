//  write a java program to illustrate thread by extending thread and implementing runnable interface  //
class A extends Thread 
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(" Thread A="+i);
		}
		System.out.println(" Exit from Thread A\n");
	}
}
	class B implements Runnable
	{
		public void run()
		{
			for(int j=1; j<=5; j++)
			{
				System.out.println(" Thread B is="+j);
			}
			System.out.println("Exit from Thread B\n");
		}
	}

class pgm15
{
	public static void main(String arg[]) {
		
		A Ta=new A();       
		Ta.start();
		B Tb=new B();
		Thread T=new Thread(Tb);
		T.start();
	}
}