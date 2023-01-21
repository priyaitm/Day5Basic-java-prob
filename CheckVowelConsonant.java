package day5assignment;
import java.util.Scanner;
public class CheckVowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Alphabet to check vowel or consonant: ");
        char Al = sc.next().charAt(0);
        if(Al == 'a' || Al == 'e' || Al == 'i'|| Al == 'o' || Al =='u' || Al =='A'|| Al=='E'|| Al =='I' || Al =='O' || Al =='U') {
            System.out.println(Al + " is Vowel");
        }
        else {
            System.out.println(Al + "is consonant");
           }
    }
}
