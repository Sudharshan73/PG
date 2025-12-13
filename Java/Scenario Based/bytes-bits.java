import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Bytes: ");
        double by=sc.nextDouble();
        double bi=by*8;
        System.out.println("The Bits are: "+bi);
    }
}