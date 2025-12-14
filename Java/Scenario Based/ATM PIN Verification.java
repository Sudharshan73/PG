import java.util.*;
class PinCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int storedPin = 1234;
        int enteredPin = sc.nextInt();
        if (enteredPin == storedPin)
            System.out.println("PIN Matched. Access Granted");
        else
            System.out.println("Wrong PIN. Access Denied");
    }
}
