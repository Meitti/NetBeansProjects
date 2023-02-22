/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.temperaturas;

/**
 *
 * @author Mêitti
 */
import java.util.Scanner;

public class Temperaturas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cont = 0;
        double temp, soma = 0, menor = Double.MAX_VALUE, maior = Double.MIN_VALUE;

        System.out.println("Digite as temperaturas (digite 0 para sair):");

        do {
            System.out.print("Temperatura " + (cont + 1) + ": ");
            temp = input.nextDouble();

            if (temp != 0) {
                cont++;
                soma += temp;
                if (temp < menor) {
                    menor = temp;
                }
                if (temp > maior) {
                    maior = temp;
                }
            }
        } while (temp != 0);

        if (cont > 0) {
            double media = soma / cont;
            System.out.println("\nMenor temperatura: " + menor);
            System.out.println("Maior temperatura: " + maior);
            System.out.printf("Média das temperaturas: %.2f", media);
        } else {
            System.out.println("Nenhuma temperatura foi informada.");
        }
    }
}
