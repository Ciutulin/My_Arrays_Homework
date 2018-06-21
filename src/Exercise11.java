import java.util.Scanner;

public class Exercise11 {
    public static void main(String args[]){

        Scanner digit = new Scanner(System.in);//crete object for input
        System.out.println("Introduceti five digit number: ");
        int nr = digit.nextInt();//read from keyboard and assign to variable 'nr' what was read from the keyboard
        int odd = 0;
        int even =0;//ii dau 0 pentru ca nu stiu cate cifre sunt even
        int suma_de_odd = 0;
        int suma_de_even =0;


        int d1 = nr/10000;//calculeaza prima cifra and assign to variable d1 the calculated value
        if(d1%2 !=0){
            odd = odd +1;//il numar ca fiind odd
            suma_de_odd = suma_de_odd+d1;
        }
        else {
            even = even + 1;//il numar ca fiind even
            //am luat prima cifra din numar si am verificat-o sa vad daca este odd sau even
            suma_de_even = suma_de_even+d1;
        }


        int d2 = (nr - d1*10000)/1000;//calculeaza a doua cifra and assign to variable d2 the calculated value
        if(d2%2 !=0){
            odd = odd +1;//il numar ca fiind odd.
            suma_de_odd = suma_de_odd+d2;
        }
        else {
            even = even + 1;//il numar ca fiind even
            //am luat prima cifra din numar si am verificat-o sa vad daca este odd sau even
            suma_de_even = suma_de_even+d2;
        }

        int d3 = (nr - d1*10000 - d2*1000)/100;//calculeaza a treia cifra and assign to variable d3 the calculated value
        if(d3%2 !=0){
            odd = odd +1;//il numar ca fiind odd
            suma_de_odd = suma_de_odd+d3;
        }
        else {
            even = even + 1;//il numar ca fiind even
            //am luat prima cifra din numar si am verificat-o sa vad daca este odd sau even
            suma_de_even = suma_de_even+d3;
        }


        int d4 = (nr - d1*10000 - d2*1000 - d3*100)/10;//calculeaza a patra cifra and assign to variable d4 the calculated value
        if(d4%2 !=0){
            odd = odd +1;//il numar ca fiind odd
            suma_de_odd = suma_de_odd+d4;
        }
        else {
            even = even + 1;//il numar ca fiind even
            //am luat prima cifra din numar si am verificat-o sa vad daca este odd sau even
            suma_de_even = suma_de_even+d4;
        }

        int d5 = (nr - d1*10000 - d2*1000 - d3*100 - d4*10);//calculeaza a cincea cifra and assign to variable d5 the calculated value
        if(d5%2 !=0){
            odd = odd +1;//il numar ca fiind odd
            suma_de_odd = suma_de_odd+d5;
        }
        else {
            even = even + 1;//il numar ca fiind even
            //am luat prima cifra din numar si am verificat-o sa vad daca este odd sau even
            suma_de_even = suma_de_even+d5;
        }

        System.out.println("The number contain "+ odd +" odd digits and "+ even +" even digits");
        System.out.println("Sum of odd digits: "+ suma_de_odd);
        System.out.println("Sum of even digits: "+ suma_de_even);


    }
}
