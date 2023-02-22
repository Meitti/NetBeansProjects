/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.intervalonumerico;

import java.util.Scanner;

/**
 *
 * @author Mêitti
 */
public class App {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.print("Digite o primeiro número inteiro: ");
        num1 = input.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        num2 = input.nextInt();

        // verifica qual o menor e o maior número
        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        // gera todos os números inteiros entre o menor e o maior número
        for (int i = menor; i <= maior; i++) {
            System.out.print(i + " ");
        }
    }
}