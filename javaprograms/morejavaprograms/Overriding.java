
/* Write a simple program depend on Method Overiding*/


class A{

    int a=20;

    void display(){

        System.out.println("Value of A is="+a);

    }
}
class B extends A{
    
    int b=40;

    void display(){ /*Method overriding*/

        System.out.println("Value of B is="+b);
    }
}

public class Overriding {

    public static void main(String[] args) {

        B b=new B();

        b.display();
    }
}