/* Design a Student class with appropriate data number as lab5.Provide your own exception namely SeatFilled exception which
is thrown when student register number is >xx25(where xx is last 2 digit of the year of joining).Show the usage of this exception
handling using student objects in the main.
Create Registration number must be a unique number.
* */

package lab7;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class SeatFilledException extends Exception {
    int excep;

    SeatFilledException(int a) {
        excep = a;
    }

    public String toString() {
        return "Sets are full, Can not add";
    }
}

class student {
    static int excep = 24;
    int regNo;
    int month;
    int year;
    String name;
    short sem;
    GregorianCalendar cal;
    float gpa;
    float cgpa;

    student() {
        regNo = 1;
        name = new String("random");
        sem = 1;
        gpa = 0;
        cgpa = 0;
        excep++;
    }

    student(String b, short s, float g, float c, GregorianCalendar gl) {
        try {
            if (excep >= 25) {
                throw new SeatFilledException(excep);
            }
            excep++;
            this.name = b;
            this.sem = s;
            this.gpa = g;
            this.cgpa = c;
            cal = gl;
            String register;
            String str = Integer.toString(cal.get(Calendar.YEAR));
            if (excep < 10) {
                register = str.substring(str.length() - 2, str.length() + excep);
            } else {
                register = str.substring(str.length() - 2, str.length() + excep);
                regNo = Integer.parseInt(register);
            }
        } catch (SeatFilledException e) {
            System.out.println(e.getMessage());
        }

    }
}

public class lpgm3 {
    public static void main(String[] args) {
        int month;
        int date;
        int year;
        short sem;
        float gpa;
        float cgpa;
        String name;
        name = new String();
        student[] s = new student[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name :");
            name = scanner.next();
            System.out.println("Enter sem :");
            sem = scanner.nextShort();
            System.out.println("Enter GPA :");
            gpa = scanner.nextFloat();
            System.out.println("Enter CGPA :");
            cgpa = scanner.nextFloat();
            System.out.println("Enter year :");
            year = scanner.nextInt();
            System.out.println("Enter Month :");
            month = scanner.nextInt();
            System.out.println("Enter date :");
            date = scanner.nextInt();
            GregorianCalendar calendar = new GregorianCalendar(Calendar.YEAR, Calendar.MONTH, Calendar.DATE);
            s[i] = new student(name, sem, gpa, cgpa, calendar);

        }
    }
}
