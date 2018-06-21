

public class CommonElements {

    public static void main(String args[]){

        //enter string values
        String [] array1 = {"Dana", "Nico", "Ilinca", "Nicolae", "Cristian"};
        String [] array2 = {"Carmen","Dana", "Georgi", "Nico", "Ruxy"};

        System.out.print("Common elements: ");
        for (int i = 0; i<array1.length; i++){
            for (int j = 0; j<array2.length; j++) {

                if (array1[i]== array2[j]) {
                    System.out.print(array1[i] +" ");

                }
            }
        }

    }

}
