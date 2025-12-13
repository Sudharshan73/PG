import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Value: ");
        int n=sc.nextInt();
        if(n%2==0 && n%5==0 && n%8!=0)
        System.out.print("Divisible!");
        else
        System.out.print("Not Divisible!");
    }
}