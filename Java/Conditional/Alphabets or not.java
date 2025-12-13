import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value: ");
        char ch=sc.next().charAt(0);
        if(ch>='A'&& ch<='Z'||ch>='a'&& ch<='z')
        System.out.print("Alphabets!");
        else
        System.out.print("Not Alphabets!");
    }
}