import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the  Number: ");
        int a=sc.nextInt();
        int l=a%10;
        if(l%3==0)
        System.out.print("It is Divisible by 3!");
        else
        System.out.print("It is not Divisible by 3!");
        
    }
}