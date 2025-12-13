import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value: ");
        char ch=sc.next().charAt(0);
        if(ch>='A'&& ch<='Z')
        System.out.print("UpperCase");
        else if(ch>='a'&& ch<='z')
        System.out.print("LowerCase");
        else if(ch>='0' && ch<='9')
        System.out.print("Numbers");
        else
        System.out.print("Special Symbols");
    }
}