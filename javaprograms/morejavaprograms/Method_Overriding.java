/** USe Dynamic method() dispatch */

class TwoDShape{

	private double width;
	private double height;
	private String name;

	/**A default constructor */
	TwoDShape(){

		width=height=0.0;
		name="none";

	}

	/**Parameterized constructor*/
	TwoDShape(double w,double h,String s){

		width=w;
		height=h;
		name=s;
	}

	/**Constructor object with equal width and height*/
	TwoDShape(double x,String s){

		width=height=x;
		name=s;
	}

	/*Construct an object from an object*/
	TwoDShape(TwoDShape ob){

		width=ob.width;
		height=ob.height;
		name=ob.name;

	}

	/*Accessor method for width and height*/

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

	String getName(){

		return name;
	}

	void showDim(){

		System.out.println("Width and height is = " +width+"\t"+height);
	}

	double area(){

		System.out.println("Area()method must be overriden ");
		return 0.0;

	}

}

/*A subclass for TwoDShape of triangle*/

    class Triangle extends TwoDShape{

    	private String Style;

    	/*A default constructor*/
    	Triangle(){

    		super();
    		Style="none";

    	}

    	/*Parameterized constructor*/
    	Triangle(String s,double w,double h){

    		super(w,h,"triangle");
    		Style=s;

    	}

    	/*One Arugument constructor*/

    	Triangle(double x){

    		super(x,"triangle");
    		Style="filled";
    	}

    	/*Construct an object from object*/

    	Triangle(Triangle ob){

    		super(ob);
    		Style=ob.Style;

    	}

    	/*Override area for triangle */

    	double area(){

    		return getWidth()*getHeight()/2;
    	}

    	void showStyle(){

    		System.out.println("Triangle style is = " +Style);
    	}

    }


    /*A subclass of TwoDShape for Rectangle*/

    class Rectangle extends TwoDShape{

    	/*A default constructor*/

    	Rectangle(){

    		super();

    	}

    	/*Parameterized constructor for rectangle*/

    	Rectangle(double w,double h){

    		super(w,h,"rectangle"); //call superclass constructor

    	}
    	

    	/*Construct a square*/
    	Rectangle(double x){

    		super(x,"rectangle"); //call super class constructor

    	}

    	/*Construct an object from object*/

    	Rectangle(Rectangle ob){

    		super(ob); //pass object to TwoDShape constructor

    	}

    	boolean isSquare(){

    		if(getWidth()==getHeight())return true;
    		else
    			return false;
    	}

    	/*Overriden area for Rectangle */
    	double area(){

    		return getWidth()*getHeight();
    	}

    }


    /*Here main class of TwoDShape*/

    class Method_Overriding{

    	public static void main(String[] args) {
    		
    		TwoDShape shape[]=new TwoDShape[5];

    		shape[0]=new Triangle("Outlined",8.0,12.0);
    		shape[1]=new Rectangle(10);
    		shape[2]=new Rectangle(10,4);
    		shape[3]=new Triangle(7.0);
    		shape[4]=new TwoDShape(10,20,"generic");

    		for(int i=0; i<shape.length;i++){

    			System.out.println("Object is = " +shape[i].getName());
    			System.out.println("Area is = " +shape[i].area());
    			System.out.println();
    		}
    	}
    }






