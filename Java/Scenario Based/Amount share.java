import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Total bill: ");
        double tbill=sc.nextDouble();
        double share=tbill/3;
        System.out.println("The Amount need to be paid by each Friend is  "+share);
    }
}