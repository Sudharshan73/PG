import java.util.*;
class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        boolean leap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        if (month < 1 || month > 12) {
            System.out.println("Invalid Month");
        } else if (month == 2) {
            if (leap)
                System.out.println("29 Days");
            else
                System.out.println("28 Days");
        } else if (month==4 || month==6 || month==9 || month==11) {
            System.out.println("30 Days");
        } else {
            System.out.println("31 Days");
        }
    }
}
