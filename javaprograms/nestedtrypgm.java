class nestedtrypgm
{
	public static void main(String[] args) {
		try
		{
			int a=24,b=32,c=67,x=34,z;
			int p[]={24};
			p[3]=33;
			try
			{
				z=x/(b*b)-(4*a*c);
				System.out.println("the value of Z is="+z);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Division by Zero in Arithmentic exception");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index is out of bounds");
		}
	}
}