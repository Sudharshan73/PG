import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the  Number: ");
        int a=sc.nextInt();
        if((a>=100)&&(a<=999)||(a>=-100)&&(a<=-999))
        System.out.print("It is a 3-Digit Number!");
        else
        System.out.print("It is not a 3-Digit Number!");
        
    }
}