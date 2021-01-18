class Inheritance2 {
    public static void main(String[] args) {
        Area aa = new Area();
        aa.height = 12;
        aa.width = 10;
        aa.ShowData();
        aa.showsArea();
    }

}

class Demo1 {
    double width;
    double height;

    void ShowData() {
        System.out.println("Width and Height of Triangle is=" + width + "\t" + height);
    }
}

class Area extends Demo1 {
    double area;

    void showsArea() {
        area = width * height / 2;
        System.out.println("Area of Triangle is=" + area);
    }
}
