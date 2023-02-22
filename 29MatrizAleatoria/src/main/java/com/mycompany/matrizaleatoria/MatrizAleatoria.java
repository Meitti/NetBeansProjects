/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrizaleatoria;

/**
 *
 * @author Mêitti
 */
import java.util.Random;

public class MatrizAleatoria {
    public static void main(String[] args) {
        int[][] matriz = new int[7][8];
        Random rand = new Random();

        // Preenchendo a matriz com números randômicos menores que 1000
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(1000);
            }
        }

        // Apresentando a matriz na tela
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
