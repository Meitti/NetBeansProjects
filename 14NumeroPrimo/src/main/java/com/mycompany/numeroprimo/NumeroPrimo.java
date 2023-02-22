/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeroprimo;

/**
 *
 * @author Mêitti
 */
import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        boolean primo = true;

        System.out.print("Digite um número inteiro: ");
        num = input.nextInt();

        if (num < 2) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo.");
        }
    }
}
