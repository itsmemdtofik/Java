public class CheckLeapYear {
    public static void main(String[] args) {
        int year = 1999;
        if (year % 4 != 0) {
            System.out.println(year + "Is not a leap year");
        } else if (year % 400 == 0) {
            System.out.println(year + "It is a century year(Century year is also a leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + "It is not a leap year");
        } else {
            System.out.println(year + "It is a leap year");
        }

    }
}
