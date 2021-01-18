class EvenException extends Exception
{
	EvenException(String msg)
	{
		super(msg);
	}
}
class pgm16a
{
	public static void main(String[] args) {
		
		int n=5;
		try
		{
			if(n%2!=0)
			
				throw new EvenException(" number is not found");
			
		}
		catch(EvenException e)
		{
			System.out.println( e.getMessage());
		}
	}
}