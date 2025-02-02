import java.util.Scanner;
public class leapyear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year :");
        int y = sc.nextInt();
        if(y%4==0){
            System.out.printf("%d is a leap year",y);
        }
        else{
            System.out.printf("%d is NOT a leap year",y);
        }
        sc.close();


    }
    
}
