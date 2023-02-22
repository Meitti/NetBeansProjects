/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosdiferentes;

/**
 *
 * @author Mêitti
 */
import java.util.Scanner;

public class NumerosDiferentes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int posicao = 0;
        while (posicao < 10) {
            System.out.print("Digite um número inteiro: ");
            int numero = sc.nextInt();
            if (verificarNumero(numeros, posicao, numero)) {
                System.out.println("Número já digitado. Digite outro número.");
            } else {
                numeros[posicao] = numero;
                posicao++;
            }
        }
        System.out.print("Vetor final: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        sc.close();
    }
    
    public static boolean verificarNumero(int[] vetor, int posicao, int numero) {
        for (int i = 0; i < posicao; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }
}

