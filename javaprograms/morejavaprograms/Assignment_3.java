/*
2. Define a class Teacher with the following private instance variables,
 name, date of birth (is of type DATE) and appropriate constructor and display
  function. Define a separate DATE class with 3 integers year, month, date and
   override toString() method. Derive 2 classes from Teacher class namely 
   PartTimeTeacher (with an instance variable ‘int hrs’ representing number 
   of hours the teacher has worked) and FullTimeTeacher (with an instance 
   variable ‘double basic’ representing the basic salary).
For PartTimeTeacher, the salary is calculated based on the number of hours the 
teacher has worked. For 1 hr = the amount is Rupees 2000.00.
For FullTimeTeacher, the salary is calculated as follows.
 salary=Basic +HRA( 10% of basic)+DA(60% of basic). Define display method in
  both the subclasses that will display the salary of teacher. When the ‘display()’
   of subclass is called it should also execute the ‘display()’ from the 
   superclass.

Write a separate driver class to create objects of each class and test the methods.



*/
class DATE {
    int year;
    int month;
    int date;

    DATE(int d, int m, int y) {
        year = y;
        date = d;
        month = m;
    }

    // @override
    public String toString() {
        return date + "/" + month + "/" + year;
    }
}

class Teacher {
    private String name;
    private DATE dt;

    Teacher(String s, int d, int m, int y) {
        name = s;
        dt = new DATE(d, m, y);
    }

    public void display() {
        System.out.println("Name is= " + name);
        System.out.println("Date Of Birth = " + dt.toString());
    }
}

class PartTimeTeacher extends Teacher {
    int hrs;
    int salary;

    PartTimeTeacher(int h, String n, int d, int m, int y) {
        super(n, d, m, y);
        hrs = h;
        salary = h * 2000;

    }

    void DISP() {
        System.out.println("Salary =" + salary);
    }
}

class FullTimeTeacher extends Teacher {
    double basic;
    double salary;

    FullTimeTeacher(double b, String n, int d, int m, int y) {
        super(n, d, m, y);
        basic = b;
        salary = b * 1.7;

    }

    void DISP() {
        display();
        System.out.println("Salary =" + salary);
    }
}

public class Assignment_3 {
    public static void main(String[] args) {

        PartTimeTeacher pt = new PartTimeTeacher(40, "jhon", 12, 12, 1970);
        FullTimeTeacher ft = new FullTimeTeacher(30000, "jack", 30, 10, 1978);
        pt.DISP();
        ft.DISP();
    }
}