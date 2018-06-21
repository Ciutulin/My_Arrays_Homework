import java.util.Scanner;

public class DigitNumberSum {

    public static void main(String args[]){

        Scanner digit = new Scanner(System.in);
        int nr = digit.nextInt();

        int d1 = nr/10000;
        System.out.println(d1);
        int d2 = (nr - d1*10000)/1000;
        System.out.println(d2);
        int d3 = (nr - d1*10000 - d2*1000)/100;
        System.out.println(d3);
        int d4 = (nr - d1*10000 - d2*1000 - d3*100)/10;
        System.out.println(d4);
        int d5 = (nr - d1*10000 - d2*1000 - d3*100 - d4*10);
        System.out.println(d5);

        int sum = d1+d2+d3+d4+d5;
        System.out.println(sum);
    }
}
