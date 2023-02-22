/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacci;

/**
 *
 * @author Mêitti
 */
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, termo1 = 1, termo2 = 1;

        System.out.print("Digite o número de termos da série de Fibonacci: ");
        n = input.nextInt();

        System.out.print(termo1 + " " + termo2 + " ");

        for (int i = 3; i <= n; i++) {
            int proximo = termo1 + termo2;
            System.out.print(proximo + " ");
            termo1 = termo2;
            termo2 = proximo;
        }
    }
}
