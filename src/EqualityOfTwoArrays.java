import java.util.Arrays;

public class EqualityOfTwoArrays {
    public static void main(String args[]){

        int [] numner1 = {2, 4, 6, 8};
        int [] number2 = {2, 4, 5, 8};

        /*boolean user = true;
        for( int i = 0; i< numner1.length; i++){
            for (int j = 0; j< number2.length; j++){
                if (numner1[i]==number2[j]){
                    System.out.println(numner1[i]);
               }
            }

        }*/
        if (Arrays.equals(numner1, number2)){
            System.out.println("Same");
        }
            else {
            System.out.println("Not same");
        }
    }
}
