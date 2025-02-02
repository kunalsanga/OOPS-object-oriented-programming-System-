import java.util.Scanner;
public class sumoften {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1:");
        int num1 = sc.nextInt();
        System.out.println("enter number 2:");
        int num2 = sc.nextInt();
        System.out.println("enter number 3:");
        int num3 = sc.nextInt();
        System.out.println("enter number 4:");
        int num4 = sc.nextInt();
        System.out.println("enter number 5:");
        int num5 = sc.nextInt();
        System.out.println("enter number 6:");
        int num6 = sc.nextInt();
        System.out.println("enter number 7:");
        int num7 = sc.nextInt();
        System.out.println("enter number 8:");
        int num8 = sc.nextInt();
        System.out.println("enter number 9:");
        int num9 = sc.nextInt();
        System.out.println("enter number 10:");
        int num10 = sc.nextInt();
        int sum = num1 + num2 + num3 +num4+num5+num6+num7+num8+num9+num10;
        System.out.println("the sum of ten numbers is :");
        System.out.println(sum);
        sc.close();
    }
}
