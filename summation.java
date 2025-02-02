import java.util.Scanner;
public class summation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a 1st number:");
        int num1 = sc.nextInt();
        System.out.println("enter a 2nd number:");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("the sum of 1st & 2nd number is:");
        System.out.println(sum);
        sc.close();
    }
}
