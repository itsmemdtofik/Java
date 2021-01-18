class Ret {
    int a;

    Ret(int i) {
        a = i;
    }

    Ret incrByTen() {
        Ret temp = new Ret(a + 10);
        return temp;
    }
}

class RetObj {
    public static void main(String[] args) {
        Ret ob1 = new Ret(2);
        Ret ob2;
        ob2 = ob1.incrByTen();
        System.out.println("ob1.a=" + ob1.a);
        System.out.println("ob2.a=" + ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println("ob2.a After second increse:=" + ob2.a);
    }
}