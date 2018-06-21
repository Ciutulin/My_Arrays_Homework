import java.util.Scanner;

public class SumOfFirstAndLastDigit {

    public static void main(String args[]) {

        Scanner digit = new Scanner(System.in);
        System.out.println("Enter five digit number: ");
        int nr = digit.nextInt();

        int d1 = nr / 10000;

        int d2 = (nr - d1 * 10000) / 1000;

        int d3 = (nr - d1 * 10000 - d2 * 1000) / 100;

        int d4 = (nr - d1 * 10000 - d2 * 1000 - d3 * 100) / 10;

        int d5 = (nr - d1 * 10000 - d2 * 1000 - d3 * 100 - d4 * 10);


        int sum = d1 + d5;
        System.out.println(sum);
    }
}
