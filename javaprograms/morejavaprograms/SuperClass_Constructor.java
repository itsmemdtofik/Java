class toDShape{

	double width;
	double height;

    /*Parameterized constructor */

	toDShape(double w,double h){

		width=w;
		height=h;
	}

	/**Accessor method */

	double getWidth(){

		return width;
	}

	double getHeight(){

		return height;
	}

	void setWidth(double w){

		setWidth(w);
	}

	void setHeight(double h){

		setHeight(h);
	}

	void ShowDisplay(){

		System.out.println("Height and width is " +width+","+height);
	}
}

class toTriangle extends toDShape{

	private String toStyle;

	toTriangle(String s,double w,double h){

		super(w,h);

		toStyle=s;
	}

	double area(){

		return getHeight()*getWidth()/2;
	}

	void toShowStyle(){

		System.out.println("Style is = " +toStyle);
	}


}

class SuperClass_Constructor{

	public static void main(String[] args) {

		System.out.println("------For first triangle-------");
		
		toTriangle t1=new toTriangle("filled",4.0,4.0);
		System.out.println("The area of first triangle is = " +t1.area());
		t1.ShowDisplay();
		t1.area();
		t1.toShowStyle();

		System.out.println("------For second trisngle-------");
		toTriangle t2=new toTriangle("Outlined",8.0,8.0);

		System.out.println("The area of triangle is = " +t2.area());
		t2.ShowDisplay();
		t2.toShowStyle();
	}
}