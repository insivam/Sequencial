package Sequencial;
/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/

import java.util.Scanner;

public class DiasEmAnos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dias, anos, meses, diasRestantes; // declaração de variáveis

        // Entrada de dados
        System.out.print("Digite a idade em dias: ");
        dias = entrada.nextInt();

        // Calcula o valor de anos, meses e dias
        anos = dias / 365;
        diasRestantes = dias % 365;
        meses = diasRestantes / 30;
        diasRestantes = diasRestantes % 30;

        // Imprime o resultado
        System.out.print("\nA idade em dias é: " + anos + " anos, " + meses + " meses e " + diasRestantes + " dias");
        entrada.close();
    }
}