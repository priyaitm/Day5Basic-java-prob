package day5assignment;

import java.util.Scanner;

public class SwapTwoNum7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  first Number:");
        int first_num = sc.nextInt();
        System.out.println("Enter the second Number: ");
        int sec_num = sc.nextInt();
        int temp;
        temp=first_num;
        first_num=sec_num;
        sec_num=temp;
        System.out.println("first num: " +first_num);
        System.out.println("second num: " +sec_num);
    }

}
