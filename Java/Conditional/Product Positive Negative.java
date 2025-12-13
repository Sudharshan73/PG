import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The 1st Value: ");
        int n1=sc.nextInt();
        System.out.print("Enter the 2nd Value: ");
        int n2=sc.nextInt();
        int div=n1*n2;
        if(div>0)
        System.out.print("Positive!");
        else
        System.out.print("Negative!");
    }
}