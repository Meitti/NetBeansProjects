/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrizquadrada;

/**
 *
 * @author Mêitti
 */
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        // Lê o valor inteiro entre 2 e 10
        System.out.print("Digite um valor inteiro entre 2 e 10: ");
        int n = sc.nextInt();
        
        // Cria a matriz quadrada de tamanho n
        int[][] matriz = new int[n][n];
        
        // Preenche a matriz com números randômicos entre 1 e 1000
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rand.nextInt(1000) + 1;
            }
        }
        
        // Calcula a média dos elementos da diagonal principal
        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma += matriz[i][i];
        }
        double media = (double) soma / n;
        
        // Imprime a matriz e a média
        System.out.println("\nMatriz gerada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.printf("\nMédia dos elementos da diagonal principal: %.2f\n", media);
        
        sc.close();
    }
}
