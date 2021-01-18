/* Define a class CurrentDate with data member day,month and year .
 * Define a method createDate() to create data object by reading values keyboard.
 * From user defined exception by name InvalidDayException of the day invalid and InvalidMonthException of month is found.
 * Display current date if the data is valid.Write a test program to illustrate the functionality
 */


package lab7;

import java.util.Scanner;

class currentDate {
    int date;
    int month;
    int year;

    currentDate(int a, int b, int c) {
        date = a;
        month = b;
        year = c;
    }

    void createDate(int date, int month, int year)
            throws lpgm2.InvalidDayException, lpgm2.InvalidMonthException {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
                if (date >= 1 && date <= 31) {
                    this.date = date;
                    this.month = month;
                    this.year = year;
                } else
                    throw new lpgm2.InvalidDayException();
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (date >= 1 && date <= 31) {
                    this.date = date;
                    this.month = month;

                } else throw new lpgm2.InvalidDayException();
                break;
            case 2:
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            if (date >= 1 && date <= 24) {
                                this.date = date;
                                this.month = month;
                            } else throw new lpgm2.InvalidDayException();
                        } else {
                            if (date >= 1 && date <= 28) {
                                this.date = date;
                                this.month = month;
                            } else throw new lpgm2.InvalidDayException();
                        }
                        if (date >= 1 && date <= 29) {
                            this.date = date;
                            this.month = month;
                        } else throw new lpgm2.InvalidDayException();
                    } else {
                        if (date >= 1 && date <= 28) {
                            this.date = date;
                            this.month = month;
                        } else throw new lpgm2.InvalidDayException();
                    }
                    break;
                }
            default:
                throw new lpgm2.InvalidDayException();
        }
        this.year = year;
    }
}

public class lpgm2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter current Day = ");
        int day = scanner.nextInt();
        System.out.println("Enter current Month = ");
        int month = scanner.nextInt();
        System.out.println("Enter current Year = ");
        int year = scanner.nextInt();
        currentDate cobj = new currentDate(day, month, year);
        try {
            cobj.createDate(day, month, year);
            System.out.println("Current Date is =" + cobj.date + "/" + cobj.month + "/" + cobj.year);
        } catch (InvalidDayException | InvalidMonthException e) {
            System.out.println(e.getMessage());
        }
    }

    static class InvalidDayException extends Exception {
        public String getMessage() {
            return "invalid day";
        }
    }

    class InvalidMonthException extends Exception {
        public String getMessage() {
            return "Invalid Month";
        }
    }

    public static class InvalidDateException extends Throwable {

    }
}

