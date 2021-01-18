/* Write s aimple program to dispaly using abstract method*/

public class Abstract_Class {
    Sub s= new Sub();
    
}

abstract class Super {
    int x = 30;

    int getX() {
        return x;
    }

    abstract void setX(int newX); // no body
}

class Sub extends Super {
    void setX(int newX) {
        x = newX;
    }
}