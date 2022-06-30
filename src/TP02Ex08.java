// Autores: Rodrigo Rebelo, Guilherme Pontes

/*8. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a digitação dos valores solicitar uma constante multiplicativa,
que deverá multiplicar cada valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições correspondentes.
Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por colunas.*/

import static java.lang.System.out;
import java.util.Scanner;

public class TP02Ex08 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[][] v1 = new int[3][4], v2 = new int[3][4];
        int mult;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                out.print("Informe [" + i + "][" + j + "]: ");
                v1[i][j] = ler.nextInt();
            }
        }

        out.print("Informe a constante : ");
        mult = ler.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                v2[i][j] = v1[i][j] * mult;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                out.print("[" + v1[i][j] + "] ");
            }
            out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                out.print("[" + v2[i][j] + "] ");
            }
            out.println();
        }
    }
}