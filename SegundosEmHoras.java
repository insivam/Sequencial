package Sequencial;
/* Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos. */

import java.util.Scanner;

public class SegundosEmHoras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria um objeto Scanner
        int segundos, horas, minutos, segundosRestantes; // declaração de variáveis

        // Entrada de dados
        System.out.print("Duração do evento em segundos: ");
        segundos = entrada.nextInt();

        // Calcula o valor de horas, minutos e segundos
        horas = segundos / 3600;
        segundosRestantes = segundos % 3600;
        minutos = segundosRestantes / 60;
        segundosRestantes = segundosRestantes % 60;

        // Imprime o resultado
        System.out.print("\nO tempo de duração do evento é: " + horas + ":" + minutos + ":" + segundosRestantes);
        entrada.close();
    }
}