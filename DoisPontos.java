package Sequencial;
/*Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
que efetua tal cálculo é: d = √(x₂ - x₁)² + (y₂ - y₁)²
*/

import java.util.Scanner;

public class DoisPontos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria um objeto Scanner
        double x1, y1, x2, y2, distancia; // Declara variáveis

        // Entrada dos valores
        System.out.println("Preencha o primeiro ponto:");
        System.out.print("x1 = ");
        x1 = entrada.nextDouble();
        System.out.print("y1 = ");
        y1 = entrada.nextDouble();

        // Entrada dos valores
        System.out.println("\nPreencha o segundo ponto:");
        System.out.print("x1 = ");
        x2 = entrada.nextDouble();
        System.out.print("y2 = ");
        y2 = entrada.nextDouble();

        // Calculando a distância
        distancia = Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0));

        // Mostra os valores
        System.out.println("\nd = √(x2 - x1)² + (y2 - y1)²");
        System.out.printf("%.2f", distancia);
        System.out.println(" = √(" + x2 + " - " + x1 + ")² + (" + y2 + " - " + y1 + ")²");

        System.out.println("\n=====================================");
        System.out.printf("   Distância entre os pontos: %.2f", distancia);
        System.out.print("\n=====================================");

        entrada.close();
    }
}