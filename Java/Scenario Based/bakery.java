import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cakesPerHour = sc.nextInt();
        int hours = sc.nextInt();
        System.out.println("Total cakes made: " + (cakesPerHour * hours));
    }
}
