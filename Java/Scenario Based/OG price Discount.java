import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Original Price: ");
        int og=sc.nextInt();
        System.out.print("Enter the Discout Percentage: ");
        int dis=sc.nextInt();
        dis=og*dis/100;
        int fip=og-(dis);
        System.out.println("The Final Price is "+fip);
    }
}