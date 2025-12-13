import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        int a=sc.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int b=sc.nextInt();
        System.out.print("Enter the 3rd Number: ");
        int c=sc.nextInt();
        if((a>b)&&(a>c))
        System.out.println(a+" is the Greatest!");
        else if(b>c)
        System.out.println(b+" is the Greatest!");
        else
        System.out.println(c+" is the Greatest!");
    }
}