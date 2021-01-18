
class Test{
    int a,b;
    Test(int i ,int j){
        a=i;
        b=j;
    }
    void method(Test o){
        o.a=a*2;
        o.b=b/2;

    }
}
 class callByRef {
    public static void main(String[] args) {
        Test ob=new Test(10,20);
        System.out.println("Before calling ="+ob.a+"\t"+ob.b);
        ob.method(ob);
        System.out.println("After calling ="+ob.a+"\t"+ob.b);
    }
}