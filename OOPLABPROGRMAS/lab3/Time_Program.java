
/**Create a class called time that has three instance variable to represent hours,minute,second.
 * (a).To assign initial value to the time object.
 * (b).To Display the Time object in the form of hh:mm:ss{24 hours format}.
 * (c).To add two time object(return type should be a Time).
 * (d).To subsitute two time object(return type should be time).
 * (e).To compare two time obeject and to determine if they are equal or if the first is greater or smaller than second one.
*/

import java.util.Scanner;

class Time {

    int hours;
    int minute;
    int second;

    public void assign(int a, int b, int c) {

        this.hours = a;
        this.minute = b;
        this.second = c;
    }

    public void Display() {

        System.out.println("The Time is = \n" + "" + this.hours + ":" + this.minute + ":" + this.second);
    }

    /** Adding the time */
    public Time add(Time c) {
        Time Time_New = new Time();
        int hours_h = this.hours + c.hours;
        int minute_m = this.minute + c.minute;
        int second_s = this.second + c.second;

        if (hours_h > 24) {
            hours_h = 1;
        }
        if (minute_m > 60) {
            hours_h++;
        }
        if (second_s > 60) {
            minute_m++;
        }

        Time_New.assign(hours_h, minute_m, second_s);

        return Time_New;

    }

    /** Subtracting the two time */
    public Time subtract(Time c) {

        Time Time_New = new Time();
        int hours_h = Math.abs(this.hours - c.hours);
        int minute_m = Math.abs(this.minute - c.minute);
        int second_s = Math.abs(this.second - c.second);

        Time_New.assign(hours_h, minute_m, second_s);
        return Time_New;

    }

    /** comparing the two time object */
    public void compare(Time c) {

        if (this.hours > c.hours)
            System.out.println("Current object is bigger");
        else
            System.out.println("Invoking object is bigger");
        if (this.hours == c.hours && this.minute == c.minute && this.second == c.second)
            System.out.println("Both object are equal");
        else
            System.out.println("Both object are not equal");
        if (this.hours > c.hours) {

            System.out.println("Firs time is greater than second");

        } else {
            System.out.println("Second time is greater than first");
        }

    }
}

public class Time_Program {
    public static void main(String[] args) {

        int x;
        int y;
        int z;
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        Time c1 = new Time();
        Time c2 = new Time();
        System.out.println("Enter the first time");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        c1.assign(x, y, z);
        c1.Display();

        System.out.println("Enter the second time");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        c2.assign(a, b, c); /* Assigning the value of date */
        c2.Display(); /* Displaying the time */

        /** Here comparing the between two time object */
        c1.compare(c2);

        /** Here adding the two time object */
        Time add_new = new Time();
        add_new = c1.add(c2);
        Time student_time = new Time();
        student_time = c1.subtract(c2);
        add_new.Display();
        student_time.Display();

    }

}
