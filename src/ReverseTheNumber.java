import java.util.Scanner;

public class ReverseTheNumber {

    public static void main(String args[]){

        int num = 0;
        int reversenum = 0;
        Scanner digits = new Scanner(System.in);
        System.out.println("Input your number and press enter: ");
        num = digits.nextInt();

        while (num != 0){
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num/10;
        }
     System.out.print("Reverse of input number is: "+ reversenum);
    }

}
