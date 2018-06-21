

public class DuplicateValues {
  public static void main(String args[]) {

      int[] numbers = {2, 5, 6, 7, 9, 6, 4};

      //System.out.println("Finding duplicates elements in array using brute force method");
      for (int i = 0; i < numbers.length; i++) { /*imi initializeaza i ia valoarea 0, i mai mic decat lungimea arrey-ului(index=5),
                                        i++ imi verifica conditia i=0<6(lungimea array-ului) apoi i++ imi verifica conditia i=1<6
                                        i++ imi verifica conditia i=2<6 .... i++ imi verifica conditia i=6<6 care nu este adevarata
                                        si iese fin for si nu mai repeta*/

          for (int j = i + 1; j < numbers.length; j++) {

              if (numbers[i]==numbers[j]) {
                  System.out.println(numbers[i] + " is duplicate");
              }
          }
      }
  }

  }

