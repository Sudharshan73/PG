import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the  Number: ");
        int a=sc.nextInt();
        if((a&1)==0)
        System.out.print("It is Even!");
        else
        System.out.print("It is Odd!");
        
    }
}