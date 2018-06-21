import java.util.Arrays;

public class SortInAscendingOrder {

    public static void main(String args []){

        int[] numbers = {1,3,5,2,9,4,14};

        Arrays.sort(numbers);
        System.out.println("Values in ascending order: "+ Arrays.toString(numbers));
    }
}
