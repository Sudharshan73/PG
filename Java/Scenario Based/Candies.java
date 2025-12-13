import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int candies = sc.nextInt();
        int students = sc.nextInt();
        System.out.println("Each student gets: " + (candies / students));
        System.out.println("Remaining candies: " + (candies % students));
    }
}
