//1. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro. Caso contrário solicitar novamente apenas o segundo valor.

import static java.lang.System.out;
import java.util.Scanner;
public class TP02Ex01 {

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

       double num1, num2;
       out.println("Entre com o primeiro valor : ");
       num1 = ler.nextDouble();

       out.println("Entre com o segundo valor : ");
       num2 =ler.nextDouble();


       while (num1 > num2) {

           out.println("Entre com o segundo valor : ");
           num2 =ler.nextDouble();


       }

    }
}


