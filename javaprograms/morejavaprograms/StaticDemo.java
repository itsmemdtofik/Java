class staticIndex{
    static int a=42;
    static int b=67;
    static void callme(){
        System.out.println("a="+a);
    }
}



public class StaticDemo {
    public static void main(String[] args) {
        staticIndex .callme();
        System.out.println("b="+staticIndex.b);
    }
    
}