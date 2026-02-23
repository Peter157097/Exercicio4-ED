import java.util.Random;
import java.util.Scanner;
import controller.ContadorNegativos;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();

        System.out.print("Digite a quantidade de posições do array: ");
        int qtd = entrada.nextInt();

        int[] numeros = new int[qtd];

        // Gerando valores aleatórios entre -10 e 10
        System.out.println("Valores sorteados:");
        for (int i = 0; i < qtd; i++) {
            numeros[i] = gerador.nextInt(21) - 10;
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Criando objeto da classe
        ContadorNegativos verificador = new ContadorNegativos();

        int negativos = verificador.contarNegativos(numeros, qtd);

        System.out.println("Quantidade de números menores que zero: " + negativos);

        entrada.close();
    }
}