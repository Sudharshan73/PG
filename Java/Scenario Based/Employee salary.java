import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double basic = sc.nextDouble();
        double hra = sc.nextDouble();
        double allowance = sc.nextDouble();
        double totalSalary = basic + hra + allowance;
        System.out.println("Total Salary = " + totalSalary);
    }
}
