/*Add constructor Add class two diamensional aaray */

public class Super_Keyword {
    public static void main(String[] args) {
        DemoZ dm1=new DemoZ(4,4,"filled");
        DemoZ dm2=new DemoZ(5, 5, "outlined");
        student s1=new student("tofik",13);
        s1.DisplayData();
        marks mm=new marks(13,78,"tofik",13);
        mm.DisplayMarks();
        System.out.println("Information for 1:");
        dm1.Display();
        dm1.display1();
        double ar=dm1.area();
        System.out.println("Area is="+ar);
        System.out.println("Information for 2:");
        dm2.Display();
        dm2.display1();
        double Ar=dm2.area();
        System.out.println("Area is="+Ar);
    }
    
}
class twoDShape{
    private double width; // now these are private
    private double height; // private
   //now accessor method we ahve to use
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
   void Display(){
       System.out.println("Width is="+width+"\t and height is="+height);
   }

}
//now we are creating a sub class
class DemoZ extends twoDShape{
    private String style; 
  // now pass to constructor
  DemoZ(double h,double w,String s){
      setWidth(w);
      setHeight(h);
      style=s;
  }
  double area(){
      return getWidth()*getHeight()/2;
  }
  void display1(){
      System.out.println("Triangle is="+style);
  }
}


// Write a simple java program to use the keyword super

class student extends twoDShape {
    private int rno;
    private String name;
    student(String s, int r){
        name=s;
        rno=r;
    }
    void DisplayData(){
        System.out.println("Student name is="+name);
        System.out.println("Student roll no is="+rno);

    }

}
class marks extends twoDShape{

    private int marks1;
    private int marks2;
    marks(int m1,int m2,String s,int r){
        marks1=m1;
        marks2=m2;
    }
    void DisplayMarks(){
        System.out.println("Display marks one="+marks1);
        System.out.println("Display mraks two="+marks2);
    }
}