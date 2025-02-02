import java.util.Scanner;
public class upplwr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter charecter :");
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z')
        {
            System.out.println("this is lowercase");
        }
        else if(ch>='A' && ch<='Z')
        {
            System.out.println("this is a digit");
        }
        else if(ch =='!' && ch == '@' && ch=='#' && ch=='$' && ch=='%')
        {
            System.out.println("it is special charecter");
        }
    }
}
