import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The  Value: ");
        char ch=sc.next().charAt(0);
        int asc=((int)ch);
        if(asc%2==0)
        System.out.print("Even!");
        else
        System.out.print("Odd!");
    }
}