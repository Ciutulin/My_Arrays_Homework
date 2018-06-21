
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayInsert {
    public static void main(String args[]){
        //Creates an array of integer value and prints the original values.
       Integer [] numbers = new Integer[]{1,5,8,9,14};
       System.out.println("Original numbers: "+ Arrays.toString(numbers));

       /*Creates an ArrayList object and add the entire content of numbers
       array into the list. We use the add (index, element) method to add
       element = 6 at index = 4.
        */
       List<Integer> list = new ArrayList<>();
       list.addAll (Arrays.asList(numbers));
       list.add(4, 6);

       //Convert back the list into array object and prints the new values.

        numbers = list.toArray(new Integer[list.size()]);
        System.out.println("After insert:"+ Arrays.toString(numbers));
    }
}
