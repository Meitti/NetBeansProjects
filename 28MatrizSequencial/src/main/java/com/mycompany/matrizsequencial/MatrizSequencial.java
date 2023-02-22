/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrizsequencial;

/**
 *
 * @author Mêitti
 */
public class MatrizSequencial {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        int count = 1;
        
        //Preenchimento da matriz com números sequenciais
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = count;
                count++;
            }
        }
        
        //Imprime a matriz
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
