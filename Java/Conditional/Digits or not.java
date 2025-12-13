import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value: ");
        char ch=sc.next().charAt(0);
        if(ch>='0'&& ch<='9')
        System.out.print("Digits!");
        else
        System.out.print("Not Digits!");
    }
}