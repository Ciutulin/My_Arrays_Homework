
import java.util.Arrays;

public class ShortNumericAndStringArray {
    public static void main(String args[]){

        int[] my_array1 = {10, 15, 14, 11, 19,
                           12, 20, 21, 24, 29,
                           31, 34, 39, 36, 40};

        String[] my_array2 = {"Mother", "Father", "Children", "Uncle", "Sister", "Brother"};

        //System.out.println("Original numeric array: "+Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array: "+Arrays.toString(my_array1));

        //System.out.println("Original string array:" +Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sort string array: "+ Arrays.toString(my_array2));

    }
}
