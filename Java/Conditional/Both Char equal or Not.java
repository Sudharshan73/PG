import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st Character: ");
        char ch1=sc.next().charAt(0);
        System.out.print("Enter the 2st Character: ");
        char ch2=sc.next().charAt(0);
        if(ch1==ch2)
        System.out.print("Equal!");
        else
        System.out.print("Not Equal!");
    }
}