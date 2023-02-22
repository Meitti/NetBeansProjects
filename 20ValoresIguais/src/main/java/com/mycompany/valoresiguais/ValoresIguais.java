/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valoresiguais;

/**
 *
 * @author Mêitti
 */
import java.util.Scanner;

public class ValoresIguais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];
        boolean possuiIguais = false;

        // Leitura do vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um valor inteiro para a posição " + i + ": ");
            vetor[i] = sc.nextInt();
        }

        // Verificação de valores iguais
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    System.out.println("Os valores " + vetor[i] + " estão nas posições " + i + " e " + j + ".");
                    possuiIguais = true;
                }
            }
        }

        if (!possuiIguais) {
            System.out.println("Não foram encontrados valores iguais.");
        }

        sc.close();
    }
}

