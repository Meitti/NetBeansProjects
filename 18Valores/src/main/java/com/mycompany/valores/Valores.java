/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valores;

/**
 *
 * @author Mêitti
 */
import java.util.Scanner;

public class Valores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] valores = new int[15];
        int menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE, soma = 0;

        System.out.println("Digite 15 valores inteiros:");
        for (int i = 0; i < 15; i++) {
            valores[i] = input.nextInt();
            soma += valores[i];
            if (valores[i] < menor) {
                menor = valores[i];
            }
            if (valores[i] > maior) {
                maior = valores[i];
            }
        }

        double media = (double) soma / 15;

        System.out.println("Valores lidos:");
        for (int i = 0; i < 15; i++) {
            System.out.print(valores[i] + " ");
        }
        System.out.println("\nMenor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.printf("Média dos valores: %.2f", media);
    }
}

