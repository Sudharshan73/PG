import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The 1st Value: ");
        int n1=sc.nextInt();
        System.out.print("Enter The 2nd Value: ");
        int n2=sc.nextInt();
        int dig1=n1%10;
        int dig2=n2%10;
        if(dig1==dig2)
        System.out.print("Same Last Digit!");
        else
        System.out.print("Not Same Last Digit!");
    }
}