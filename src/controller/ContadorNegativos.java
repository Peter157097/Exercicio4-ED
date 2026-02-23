public class ContadorNegativos {

    // Construtor padrão
    public ContadorNegativos() {
        // Apenas cria a instância da classe
    }

    // Método recursivo para contar valores negativos
    public int contarNegativos(int[] numeros, int quantidade) {

        /*
         * CASO BASE:
         * Quando a quantidade for 0,
         * significa que todos os elementos já foram verificados.
         */
        if (quantidade == 0) {
            return 0;
        }

        /*
         * PASSO RECURSIVO:
         * Soma 1 caso o elemento atual seja negativo,
         * caso contrário apenas continua a contagem.
         */
        if (numeros[quantidade - 1] < 0) {
            return 1 + contarNegativos(numeros, quantidade - 1);
        } else {
            return contarNegativos(numeros, quantidade - 1);
        }
    }
}