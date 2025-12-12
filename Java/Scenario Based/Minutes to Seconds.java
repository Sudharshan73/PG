import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Minutes: ");
        int min=sc.nextInt();
        int sec=min*60;
        System.out.println("The Minutes in Seconds "+sec);
    }
}