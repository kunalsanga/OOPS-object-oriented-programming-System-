import java.util.Scanner;

public class sumoften1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int sum=0;
        while(i<=10){
            System.out.println("enter 10 numbers :");
            System.out.println("enter num  :");
            int num = sc.nextInt();
            i++;
            sum += num;
        }
        System.out.println("the sum of ten numbers is :");
        System.out.println(sum);
        sc.close();
    }
}
