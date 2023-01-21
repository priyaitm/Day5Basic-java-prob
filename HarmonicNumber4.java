package day5assignment;
import java.util.Scanner;
public class HarmonicNumber4 { public static void main(String[] args) {
    double sum=0.0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter positive Number:");
    int N = sc.nextInt();
          for (double i = 1; i <=N; i++) {
            double out1 = 1 / i;
            sum = sum + out1;
        }
        System.out.println(sum);
}
}
