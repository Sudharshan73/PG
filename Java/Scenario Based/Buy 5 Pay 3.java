import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int pens = sc.nextInt();
        int freeSets = pens / 5;
        int payPens = pens - (freeSets * 2);
        int totalCost = payPens * price;
        System.out.println("Pens to Pay For = " + payPens);
        System.out.println("Total Cost = " + totalCost);
    }
}
