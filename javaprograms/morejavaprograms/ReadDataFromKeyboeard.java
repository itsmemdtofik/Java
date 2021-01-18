import java.io.*;
class ReadDataFromKeyboeard{
	public static void main(String[] args) 
	throws IOException{
		byte [] data=new byte[10];

		System.out.println("Enter some Character : ");
		System.in.read(data);
		System.out.println("You Entered : ");
		for(int i=0; i<data.length; i++)
			System.out.println((char) data[i]);

		
	}
}