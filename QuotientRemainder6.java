package day5assignment;

import java.util.Scanner;
public class QuotientRemainder6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  dividend Number:");
         int dividend = sc.nextInt();
        System.out.println("Enter the divisor Number: ");
        int divisor =sc.nextInt();
        int Quotient =dividend/divisor;
        int Remainder=dividend%divisor;
        System.out.println("Quotient :" +Quotient);
        System.out.println("Remainder :" +Remainder);

    }
}
