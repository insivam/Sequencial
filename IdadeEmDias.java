package Sequencial;
/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias. */

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria um objeto Scanner
        int ano, mes, dia, idade; // declaração de variáveis

        // Entrada de dados
        System.out.print("Digite a idade em anos: ");
        ano = entrada.nextInt();
        System.out.print("Digite a idade em meses: ");
        mes = entrada.nextInt();
        System.out.print("Digite a idade em dias: ");
        dia = entrada.nextInt();

        idade = (ano * 365) + (mes * 30) + dia; // Calcula a idade em dias
        System.out.print("\nA idade em dias é: " + idade); // Imprime a idade em dias

        entrada.close();
    }
}