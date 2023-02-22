/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.distribuicaonotas;

import java.util.Scanner;

/**
 *
 * @author Mêitti
 */
public class DistribuicaoNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor do saque: R$ ");
        int valorSaque = sc.nextInt();
        
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        int[] quantidadeNotas = new int[notas.length];
        
        for (int i = 0; i < notas.length; i++) {
            quantidadeNotas[i] = valorSaque / notas[i];
            valorSaque = valorSaque % notas[i];
        }
        
        System.out.println("Distribuição das notas:");
        for (int i = 0; i < notas.length; i++) {
            if (quantidadeNotas[i] > 0) {
                System.out.printf("%d notas de R$ %d,00\n", quantidadeNotas[i], notas[i]);
            }
        }
        
        sc.close();
    }
}