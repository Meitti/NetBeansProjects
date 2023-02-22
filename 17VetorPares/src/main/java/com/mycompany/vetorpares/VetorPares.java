/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetorpares;

/**
 *
 * @author Mêitti
 */
import java.util.Scanner;

public class VetorPares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];
        int pares = 0;

        System.out.println("Digite 10 valores inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = input.nextInt();
            if (vetor[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.println("O vetor tem " + pares + " valores pares.");
    }
}
