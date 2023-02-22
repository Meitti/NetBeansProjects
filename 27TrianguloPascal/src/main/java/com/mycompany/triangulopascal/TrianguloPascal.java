/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.triangulopascal;

/**
 *
 * @author Mêitti
 */
import java.util.Scanner;

public class TrianguloPascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o número de linhas do Triângulo de Pascal: ");
        int n = sc.nextInt();
        
        int[][] pascal = new int[n][n];
        
        // preenche a primeira linha com 1
        for (int i = 0; i < n; i++) {
            pascal[0][i] = 1;
        }
        
        // preenche as demais linhas
        for (int i = 1; i < n; i++) {
            pascal[i][0] = 1; // primeiro elemento sempre é 1
            
            for (int j = 1; j < n; j++) {
                pascal[i][j] = pascal[i-1][j] + pascal[i-1][j-1];
            }
            
            pascal[i][i] = 1; // último elemento sempre é 1
        }
        
        // imprime o Triângulo de Pascal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}

