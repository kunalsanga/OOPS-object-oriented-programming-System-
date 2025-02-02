import java.util.Scanner;
public class inpt3age{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter age 1:");
        int age1 = scanner.nextInt();
        System.out.println("enter age 2:");
        int age2 = scanner.nextInt();
        System.out.println("enter age 3:");
        int age3 = scanner.nextInt();
        if (age1<age2 && age1<age3){
            System.out.println("the youngest age among them all is : "+age1);
        }
        else if(age2<age1 && age2<age3){
            System.out.println("the youngest age among them all is : " +age2);
        }
        else if(age3<age1 && age3<age2){
            System.out.println("the youngest age among them all is : " +age3);
        }
        scanner.close();
    }
}