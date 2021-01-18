class twoDShape{

	private double height;
	private double width;

	/* Accessor method */
	double getWidth(){

		return width;
	}

	double getHeight(){

		return height;

	}

	void setWidth(double w){

		width=w;
	}

	void setHeight(double h){

	     height=h;
	}

	void showDim(){

		System.out.println("Height and Width is = " +width+","+height);
	}

	


}
/*Creating a subclass */
class triangle extends twoDShape{

	private String style;


	triangle(String s,double w,double h){

		setWidth(w);
		setHeight(h);

		style=s;
	}

	double area(){

		return getWidth() * getHeight()/2;
	}

	void style(){

		System.out.println("Style is " +style);
	}

}

class Constructor_Inheritance{

	public static void main(String[] args) {
		
		triangle t1=new triangle("filled",4.0,4.0);
		t1.showDim();
		t1.style();
		System.out.println("the area of triangle is = " +t1.area());
	}
}