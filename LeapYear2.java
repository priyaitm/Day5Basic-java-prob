package day5assignment;
import java.util.Scanner;
public class LeapYear2 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Year Number:");
            int year = sc.nextInt();
            if((year%400==0) ||(year%4==0) && (year%100 !=0))
            {
                System.out.println("year is Leap Year");
            }
            else{
                System.out.println("year is not Leap Year");
            }
    }
}
