import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Value: ");
        int n=sc.nextInt();
        if(n>=0 && n<=9)
        System.out.print("Single Digit!");
        else if(n>=10 && n<=99)
        System.out.print("Two-Digit!");
        else if(n>=100 && n<=999)
        System.out.print("Three-Digit!");
    }
}