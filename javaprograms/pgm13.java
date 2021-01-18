// write a java program to demostrate 
// use of implementing interface
// use of extending interface

import java.lang.*;
interface constant
{
  double pi=3.14;
  double radius=5.0;

}
interface method extends constant
{
	public void compute();
}

class circle implements method
{
  public void compute()
  {
  	double area,peri;
  	area=pi*radius*radius;
  	peri=2*pi*radius;
  	System.out.println("Area of circle is="+area);
  	System.out.println("Parameter of circle is="+peri);
  }
}
class pgm13
{
	public static void main(String[] args) {
		
		circle c=new circle();
		c.compute();
	}
}