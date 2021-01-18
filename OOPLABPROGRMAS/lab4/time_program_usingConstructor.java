/* Consider  the already defined time class.Provide a default constructor ,parametrized constructor.
 * Also provide a display method.Illustrate all the constructor well as the display method by defining time object*/

package lab4;

import java.util.Scanner;

class time {
    int hours;
    int minutes;
    int seconds;

    time(int a, int b, int c) {
        this.hours = a;
        this.minutes = b;
        this.hours = c;
    }

    public time timeAdd(time t) {
        int hours_new = this.hours + t.hours;
        int minutes_new = this.minutes + t.minutes;
        int seconds_new = this.seconds + t.seconds;
        if (hours_new > 24) {
            hours_new = (hours_new) % 24;
        }
        if (minutes_new > 60) {
            hours_new++;
            minutes_new = (minutes_new) % 60;
        }
        if (seconds_new > 60) {
            minutes_new++;
            seconds_new = (seconds_new) % 60;
        }

        time result = new time(hours_new, minutes_new, seconds_new);
        return result;
    }

    public time timeSub(time t) {
        int hours_new = Math.abs(this.hours - t.hours);
        int minutes_new = Math.abs(this.minutes - t.minutes);
        int seconds_new = Math.abs(this.seconds - t.seconds);
        time result2 = new time(hours_new, minutes_new, seconds_new);
        return result2;
    }

    public void Compare(time t) {
        if (this.hours > t.hours && this.minutes > t.minutes && this.seconds > t.seconds) {
            System.out.println("First time is greater");
        } else if (this.hours == t.hours && this.minutes == t.minutes && this.seconds == t.seconds) {
            System.out.println("Both have same time");
        } else {
            System.out.println("Second time is greater");
        }
    }

    public void display() {
        System.out.println("First hours = " + this.hours + "\tFirst Minutes = " + this.minutes + "\tFirst Seconds = " + this.seconds);
    }
}

public class time_program_usingConstructor {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------### FIRST TIME ###--------------------------------------------");
        System.out.println("Enter hours / minutes / seconds : ");
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        time t1 = new time(x, y, z);
        t1.display();
        System.out.println("-----------------------### SECOND TIME ###--------------------------------------------");
        System.out.println("Enter hours / minutes / seconds : ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        time t2 = new time(a, b, c);
        t2.display();
        System.out.println("\n");
        System.out.println("ADDITION OF TIME IS : ");
        time tadd = new time(0, 0, 0);
        tadd = t1.timeAdd(t2);
        tadd.display();
        System.out.println("SUBSTRACTION OF TIME IS :");
        time stime = new time(0, 0, 0);
        stime = t1.timeSub(t2);
        stime.display();
        System.out.println("COMPARE TIME IS :");
        t1.Compare(t2);
    }
}
