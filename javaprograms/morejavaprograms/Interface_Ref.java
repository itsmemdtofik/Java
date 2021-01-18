
import java.lang.*;
interface Series1 {
    void reset();

    int getNext();

    int setStart(int x);
}

class ByTwos1 implements Series1 {
    int start;
    int val;

    ByTwos1() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val = val + 3;
        return val;
    }

    public void reset() {
        start = val;
        
    }

    public int setStart(int x) {
        start = x;
        val = x;
        return val;
    }
}
class Simulation{  
   /* using polymorphism */
    Series1 numSeq;
    Simulation(Series1 s){
        numSeq=s;
    }
    public void display(){
        System.out.println("The value os Simulation"+numSeq);
    }
}
interface Interface_Ref{
    public static void main(String[] args) {
        ByTwos1 ob1=new ByTwos1();
        Simulation sim2=new Simulation(new ByTwos1());
        sim2.display();
        Series1 iRef;
        iRef=ob1;
        System.out.println("ByTwos1 Series: Default value");
        System.out.println("Starting at:"+ob1.val); // we can not write iRef.val
        for(int i=0; i<5; i++)
        System.out.println("The Next Value is="+iRef.getNext());

        /* Reset Method() */
        iRef.reset();
        System.out.println("Series1: Reset Value");
        System.out.println("Starting at:"+ob1.val); // we can write iref.val 
        for(int i=0; i<5; i++)
        System.out.println("The next value is="+iRef.getNext());

        /* setStart method() */
        iRef.setStart(300);
        System.out.println("Series1: setStart value");
        System.out.println("Starting at:"+ob1.val);
        for(int i=0; i<5; i++)
        System.out.println("The next value is="+iRef.getNext());





    }
}