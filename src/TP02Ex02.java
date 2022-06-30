// Autores: Rodrigo Rebelo, Guilherme Pontes

/*Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de erro, se necessário. Após a digitação, exibir:
a. O maior valor;
b. A soma dos valores;
c. A média aritmética dos valores.*/

import static java.lang.System.out;
import java.util.Scanner;

public class TP02Ex02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double maior = 0, soma = 0, num, media, num1;

        out.print("Informe o 1º número: ");
        num1 = ler.nextInt();
        soma += num1;
        for (int i = 2; i <= 10; i++) {

            out.print("Informe o " + i + "º número: ");
            num = ler.nextInt();

            soma += num;

            if (num > num1)
                maior = num;
        }

        media = soma / 10;

        out.println("Maior: " + maior +
                "\nSoma: " + soma +
                "\nMédia: " + media);
    }
}
