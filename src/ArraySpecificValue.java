
public class ArraySpecificValue {
    public static void main(String args[])  {

        int[] numbers = {2, 3, 5, 6};

        int a = 3;

        for( int i =0; i<numbers.length; i++ ){
            if ( numbers[i] == a) {
                System.out.println(numbers[i]);
            }

        }


    }
}
