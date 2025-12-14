import java.util.*;
class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();
        double discount;
        if (bill >= 5000)
            discount = bill * 0.20;
        else if (bill >= 3000)
            discount = bill * 0.15;
        else if (bill >= 1000)
            discount = bill * 0.10;
        else
            discount = 0;
        System.out.println("Discount = " + discount);
        System.out.println("Final Amount = " + (bill - discount));
    }
}
