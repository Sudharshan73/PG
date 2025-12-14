import java.util.*;
class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Balance = " + balance);
                break;
            case 2:
                int withdraw = sc.nextInt();
                if (withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("Withdrawn: " + withdraw);
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;
            case 3:
                int deposit = sc.nextInt();
                balance += deposit;
                System.out.println("Deposited: " + deposit);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
