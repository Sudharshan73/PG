import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the KM: ");
        int km=sc.nextInt();
        int m=km*1000;
        System.out.println("The KiloMeters in Meters is "+m);
    }
}