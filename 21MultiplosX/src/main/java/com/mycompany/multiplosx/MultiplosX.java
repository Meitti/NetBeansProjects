/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multiplosx;

/**
 *
 * @author Mêitti
 */
import java.util.Scanner;

public class MultiplosX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];

        // Lê os valores do vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o valor para a posição %d: ", i);
            vetor[i] = sc.nextInt();
        }

        System.out.print("Digite o valor de x: ");
        int x = sc.nextInt();

        // Verifica os múltiplos de x e suas posições
        System.out.print("Múltiplos de x nas posições: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % x == 0) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println();

        sc.close();
    }
}
