import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Value: ");
        int n=sc.nextInt();
        int dig=n/100;
        if(dig%2!=0)
        System.out.print("Odd");
        else
        System.out.print("Even");
    } 
}