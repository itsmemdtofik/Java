class twoDshape{
    int width;
    int height;
    void ShowstwoDshape(){
        System.out.println("Height:"+height+"\t width"+width);
    }
}
class Triangle extends twoDshape{
    String style;
    double area(){
        return height * width;
    }
    void showsTriangle(){
        System.out.println("Style is="+style);
    }
}

 class Inheritance1 {
     public static void main(String[] args) {
         Triangle t1=new Triangle();
         Triangle t2=new Triangle();
         t1.height=12;
         t1.width=10;
         t1.style="filled";
         t2.height=44;
         t2.width=2;
         t2.style="not filled";
         System.out.println("Information for traingle1 is=\n");
         t1.ShowstwoDshape();
         t1.showsTriangle();
         t1.area();
         System.out.println("Area of Triangle is="+t1.area());
         System.out.println("information for triangle 2=\n");
         t2.ShowstwoDshape();
         t2.showsTriangle();
         t2.area();
         System.out.println("Area of Triangle is="+t2.area());
     }
    
}