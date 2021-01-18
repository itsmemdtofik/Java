//write a java program to sort a list of names using selection sort technique//
class pgm1
{
	static String names[]={"lithes","nihal","akshatha","allen","hafiz"};
	public static void main(String[] arg)
	{
		String t;
		int n=names.length;
		System.out.println("before sorting\n");
		for(int i=0; i<n; i++)
			System.out.println(names[i]);
		for(int i=0; i<n; i++)
		{
	
			for(int j=i+1; j<n; j++)
			{
				if(names[j].compareTo(names[i])<0)
				{
					t=names[j];
					names[j]=names[i];
					names[i]=t;
				}
			}
		}
		System.out.println("after sorting\n\n");
		for(int i=0; i<n; i++)
			System.out.println(names[i]);
	}

	
}