/* Write a program to demonstrate the use of wildcard argument*/

package lab9;

class genericNum<T extends Number>{
     T num;
     genericNum(T n){
         this.num=n;
     }
     boolean absEqual(genericNum<T> ob){
         if(Math.abs(ob.num.doubleValue())==Math.abs(ob.num.doubleValue())){
             return true;
         }
         return false;
     }
}

public class program4 {
    public static void main(String[] args) {
        genericNum<Integer> gob=new genericNum<Integer>(6);
        genericNum<Double> gob1=new genericNum<Double>(9.0);
       if(gob.absEqual(gob)){
           System.out.println("Absolute value is read None :");
       }else {
           System.out.println("Ansolute value diffefernt");
           System.out.println("Testing iob,and obj, and LAB");
           if(gob.absEqual(gob)){
               System.out.println("Absolute value is :");
           }else {
               System.out.println("Abstract value");
           }
       }
    }
}
