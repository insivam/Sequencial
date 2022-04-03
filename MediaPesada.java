package Sequencial;
/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/

import java.util.Scanner;

public class MediaPesada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria um objeto Scanner
        double nota1, nota2, nota3, media; // declaração de variáveis

        // Entrada de dados
        System.out.print("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = entrada.nextDouble();

        media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10; // Calcula a média

        System.out.printf("\nA média final do aluno é: %.2f", media); // Imprime a média
        entrada.close();
    }
}