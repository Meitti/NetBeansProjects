/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenacaovetor;

/**
 *
 * @author Mêitti
 */
import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i+1) + "° valor: ");
            vetor[i] = sc.nextInt();
            Arrays.sort(vetor, 0, i+1);
        }

        System.out.print("Valores em ordem crescente: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        sc.close();
    }
}
