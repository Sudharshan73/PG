import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        int a=sc.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int b=sc.nextInt();
        int sum=a+b;
        if(sum%2==0)
        System.out.print("It is Even!");
        else
        System.out.print("It is Odd!");
        
    }
}