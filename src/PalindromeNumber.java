import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String args[]){

        String original, reverse = ""; //Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number ");
        int n = in.nextInt();
        int sum = 0, r;
        int temp = n;
        while(n>0){
            r = n % 10;
            sum = (sum*10)+r;
            n = n/10;
        }
        if(temp==sum)
            System.out.println("It is a Palindrome number.");
        else
            System.out.println("It is not a Palindrome number.");

    }
}
