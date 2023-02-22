/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.paresimpares;
import java.util.Scanner;
/**
 *
 * @author Mêitti
 */

public class ParesImpares {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, pares = 0, impares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            num = input.nextInt();

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}

