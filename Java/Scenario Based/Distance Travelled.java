import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Speed: ");
        int sp=sc.nextInt();
        System.out.println("Enter the Hours: ");
        int hr=sc.nextInt();
        int dis=sp*hr;
        System.out.println("The Distance covered is "+dis);
    }
}