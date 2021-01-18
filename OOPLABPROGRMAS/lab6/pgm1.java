/*###LAB6 PROGRAM ###INHERITANCE & PACKAGE
Create a person class with private instance variable for the person month  name od the biirth date
add appropriate accessor  method for the variable.Then create a subclass college graduate withe the private instance
variable for the stuident for gpa  and year of graduation and appropriate constructor for your class.Then create
a class with main() method that demonstarte yOur class.
* */
package lab6;
import java.lang.*;
class person {

    private String name;
    private int date;
    private int month;
    private long year;

    /*Constructor*/
    person(String n, int d, int m, int y) {
        this.name = n;
        this.date = d;
        this.month = m;
        this.year = y;
    }

    /*Accessor method starting */
    String getName() {
        return name;
    }

    int getDate() {
        return date;
    }

    int getMonth() {
        return month;
    }

    long getYear() {
        return year;
    }
}

/*Sub class of super class*/
class collegeGraduate extends person {
    private double gpa;
    private long year_gpa;

    collegeGraduate(String n, int d, int m, int y, double g, long y_g) {
        super(n, d, m, y);
        this.gpa = g;
        this.year_gpa = y_g;

    }

    /*Accessor method*/
    double getGpa() {
        return gpa;
    }

    long getYearGpa() {
        return year_gpa;
    }

}

class pgm1 {
    public static void main(String[] args) {
        collegeGraduate cg = new collegeGraduate("Mohammad Tofik", 13, 9, 2021, 9.04, 2021);
        System.out.println("Name is = " + cg.getName());
        System.out.println("Date is = " + cg.getDate());
        System.out.println("Month is = " + cg.getMonth());
        System.out.println("Year is = " + cg.getYear());
        System.out.println("GPA is = " + cg.getGpa());
        System.out.println("Graduate year is = " + cg.getYearGpa());
        System.out.println("Date of Birth is = " + cg.getDate() + "/" + cg.getMonth() + "/" + cg.getYear());

    }
}