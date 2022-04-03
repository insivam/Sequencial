package Sequencial;
/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.
*/

import java.util.Scanner;

public class CustoDeFabrica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria um objeto Scanner
        double CustoFabrica, CustoFinal; // declaração de variáveis

        // Entrada de dados
        System.out.print("Custo de fábrica do carro: ");
        CustoFabrica = entrada.nextDouble();

        // Calcula o valor de custoFinal
        CustoFinal = CustoFabrica + (CustoFabrica * 0.28) + (CustoFabrica * 0.45);

        // Imprime o resultado
        System.out.print("\nO custo ao consumidor do carro é: R$" + CustoFinal);
        entrada.close();
    }
}