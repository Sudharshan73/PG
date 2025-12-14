import java.util.*;
class TicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 12)
            System.out.println("Child Ticket: ₹100");
        else if (age < 60)
            System.out.println("Adult Ticket: ₹200");
        else
            System.out.println("Senior Ticket: ₹150");
    }
}
