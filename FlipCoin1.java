package day5assignment;
import java.util.Scanner;
public class FlipCoin1 {public static void main(String[] args) {
    double flip=0;
    double head=0;
    double  tail=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter positive number of times to flip coin:");
    int n = sc.nextInt();
    for(int i=1; i<=n; i++) {
        flip = Math.random();
        //System.out.println(flip);
        if (flip >0.5) {
            //System.out.println("head:" + flip);
            head++;
        }
        else {
            tail++;
            //System.out.println("tali:" +flip);
        }
    }
    System.out.println("head: " +head);
    System.out.println("tail: " +tail);
    double head_per= (head)/(n)*100;
    double tail_per=(tail)/n*100;
    System.out.println("head % :" + head_per);
    System.out.println("tail % :"  +tail_per);
}


}


