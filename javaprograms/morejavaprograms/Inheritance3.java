class Inheritance3 {
    public static void main(String[] args) {
        int a, b;
        TwoDimPoint pt = new TwoDimPoint();
        a = pt.getX();
        b = pt.getY();
        System.out.println("Values of a and b is=" + a + "," + b);
    }
}

class OneDimPoint {
    int x = 3;

    int getX() {
        return x;
    }
}

class TwoDimPoint extends OneDimPoint {
    int y = 4;

    int getY() {
        return y;
    }
}
