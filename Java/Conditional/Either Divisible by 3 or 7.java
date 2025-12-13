import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Value: ");
        int n=sc.nextInt();
        if(n%3==0 || n%7==0)
        System.out.print("Divisible");
        else
        System.out.print("Not Divisible");
    } 
}