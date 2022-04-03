package Sequencial;

/*Escreva  um sistema que leia três números inteiros e positivos (A, B, C)
  e calcule a seguinte expressão:
  D =  R+S /2
  R = (A+B)²
  S = (B+C)²
*/

import java.util.Scanner;

public class ABCs {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); // Cria um objeto Scanner
    int A, B, C, R, S; // declaração de variáveis inteiras
    double D; // declaração de variável do tipo double

    // Entrada de dados
    System.out.print("A = ");
    A = entrada.nextInt();
    System.out.print("B = ");
    B = entrada.nextInt();
    System.out.print("C = ");
    C = entrada.nextInt();

    // Calcula o valor de R e S
    R = (A + B) * (A + B);
    S = (B + C) * (B + C);
    D = (R + S) / 2.0;

    // Imprime o resultado
    System.out.print("\nR = (A + B)²      -->    ");
    System.out.print(R + " = (" + A + " + " + B + ")²\n");

    System.out.print("S = (B + C)²      -->    ");
    System.out.print(S + " = (" + B + " + " + C + ")²\n");

    System.out.print("D = (R + S) / 2   -->    ");
    System.out.print(D + " = " + (R + S) + " / 2\n");

    System.out.print("\n=====================================");
    System.out.print("\nO resultado final de D é: " + D);
    System.out.print("\n=====================================");

    entrada.close();
  }
}