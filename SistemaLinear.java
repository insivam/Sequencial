package Sequencial;
/* Um sistema de equações lineares do tipo:
			ax + by = c
			dx + ey = f

Pode ser resolvido segundo mostrado abaixo:
		x = ce - bf / ae - bd
		y = af - cd / ae - bd

Escreva um sistema que lê os coeficientes
a,b,c,d,e e f e calcula e mostra os
valores de x e y.
*/

import java.util.Scanner;

public class SistemaLinear {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, d, e, f, x, y; // declarando as variáveis do tipo double

        // entrada dos valores
        System.out.print("Digite o valor de a: ");
        a = entrada.nextDouble();
        System.out.print("Digite o valor de b: ");
        b = entrada.nextDouble();
        System.out.print("Digite o valor de c: ");
        c = entrada.nextDouble();
        System.out.print("Digite o valor de d: ");
        d = entrada.nextDouble();
        System.out.print("Digite o valor de e: ");
        e = entrada.nextDouble();
        System.out.print("Digite o valor de f: ");
        f = entrada.nextDouble();

        // calculando os valores
        x = ((c * e) - (b * f)) / ((a * e) - (b * d));
        y = ((a * f) - (c * d)) / ((a * e) - (b * d));

        // mostrando os valores
        System.out.print("\nx = ce - bf / ae - bd    --->    ");
        System.out.printf("%s = %.2f - %.2f / %.2f - %.2f", x, c * e, b * f, a * e, b * d);
        System.out.print("\ny = af - cd / ae - bd    --->    ");
        System.out.printf("%.2f = %.2f - %.2f / %.2f - %.2f", y, a * f, c * d, a * e, b * d);

        System.out.println("\n==================================================================");
        System.out.printf("                       x = %.2f       y = %.2f                       ", x, y);
        System.out.println("\n==================================================================");

        entrada.close();
    }
}