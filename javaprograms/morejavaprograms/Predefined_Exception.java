public class Predefined_Exception {
public static void main(String[] args) {
    int a=10;
    int b=10;
    try{
        int c=(a+b)/(a-b);
    }catch(ArithmeticException e){
        System.out.println("Devide By Zero Exception");
    }
}    
}
