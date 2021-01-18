// Interface one
interface ifA {
    void doSomething();
}
// Interface two
interface ifB {
    void doSomethingElse();
}

class MyClass implements ifA, ifB {
    /* Implementing two Interface */

    public void doSomething() {
        System.out.println("Display=doSomething");
    }

    public void doSomethingElse() {
        System.out.println("Display=doSomethingElse");
    }
}

public class Multiple_Interface {
    public static void main(String[] args) {
        /* Creating Object for class MyClass*/
        MyClass ob=new MyClass();
        ob.doSomething();
        ob.doSomethingElse();

    }
}
