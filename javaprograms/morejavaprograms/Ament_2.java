import java.util.Scanner;
class Date {
    int day;
    int month;
    int year;
    int years;

    Date(int a, int b, int c) {
        day = a;
        month = b;
        year = c;

    }

    int daysSinceJan1() {
        int days = 0;
        if ((year % 4 != 4) || (year % 4 == 0) && (year % 100 == 0) && (year % 400 != 0)) {
            for (int i = 1; i < month; i++) {
                if (i == 4 || i == 6 || i == 9 || i == 11)
                    days = days + 30;
                else if (i == 29)
                    days = days + 31;
                else
                    days = days + 29;
            }
        }
        days = days + day;
        return days;

    }
}

public class Ament_2 {
    public static void main(String[] args) {
        int days;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Day of the month:=");
         days = scanner.nextInt();
    }
}