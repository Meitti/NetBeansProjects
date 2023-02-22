/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacci;

/**
 *
 * @author Mêitti
 */
public class Fibonacci {

    public static void main(String[] args) {
        int termo1 = 0, termo2 = 1, proximo = 0;

        System.out.print(termo1 + " " + termo2 + " ");

        while (proximo <= 500) {
            proximo = termo1 + termo2;
            if (proximo > 500) {
                break;
            }
            System.out.print(proximo + " ");
            termo1 = termo2;
            termo2 = proximo;
        }
    }
}
