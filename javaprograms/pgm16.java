// write a  java program to implement the concept of exception handling  //
// using predefined exception, By creating user defined exception //
class pgm16 
{
	public static void main(String[] args) 
	{
		
		int a=10,b=10;
		try
		{
			int c=(a+b)/(a-b);
		}
		catch(ArithmeticException e)
		{
	
	System.out.println(" Divided By Zero Exception");
        }
    }
} 
