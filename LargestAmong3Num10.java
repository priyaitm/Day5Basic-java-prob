package day5assignment;
import java.util.Scanner;
public class LargestAmong3Num10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first Number: ");
    int N1 = sc.nextInt();
    System.out.println("Enter second Number: ");
    int N2 = sc.nextInt();
    System.out.println("Enter third Number: ");
    int N3 = sc.nextInt();
    if(N1 >N2 && N1> N3) {
        System.out.println(N1+ " is largest number");
    }
    else if(N2>N1 && N2>N3) {
        System.out.println(N2+ " is largest number");
    }
    else {
        System.out.println(N3+ " is largest number");
    }


}
}
