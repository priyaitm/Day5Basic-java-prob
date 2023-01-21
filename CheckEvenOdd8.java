package day5assignment;
import java.util.Scanner;
public class CheckEvenOdd8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the   Number:");

        double N = sc.nextDouble();
           if(N %2  ==0) {
            System.out.println("Number is Even");
            }
           else{
               System.out.println("Number is odd");
           }

  }
}
