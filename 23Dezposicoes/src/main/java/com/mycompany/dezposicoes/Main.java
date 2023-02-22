/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dezposicoes;

/**
 *
 * @author Mêitti
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[20];

        System.out.println("Digite os valores do primeiro vetor: ");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do segundo vetor: ");
        for (int i = 0; i < 10; i++) {
            vetor2[i] = sc.nextInt();
        }

        int posicaoVetor3 = 0;
        for (int i = 0; i < 10; i++) {
            vetor3[posicaoVetor3] = vetor1[i];
            posicaoVetor3++;

            vetor3[posicaoVetor3] = vetor2[i];
            posicaoVetor3++;
        }

        System.out.println("Valores do terceiro vetor: ");
        for (int i = 0; i < 20; i++) {
            System.out.println(vetor3[i]);
        }

        sc.close();
    }
}
