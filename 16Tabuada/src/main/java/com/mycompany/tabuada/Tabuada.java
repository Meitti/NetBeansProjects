/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuada;

/**
 *
 * @author Mêitti
 */
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        System.out.print("Digite o valor inicial da tabuada: ");
        int inicio = input.nextInt();

        System.out.print("Digite o valor final da tabuada: ");
        int fim = input.nextInt();

        System.out.println("Tabuada do " + num + " de " + inicio + " a " + fim + ":");
        for (int i = inicio; i <= fim; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
