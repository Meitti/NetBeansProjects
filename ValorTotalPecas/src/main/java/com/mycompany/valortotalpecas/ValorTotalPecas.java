/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valortotalpecas;
import java.util.Scanner;

/**
 *
 * @author Mêitti
 */
public class ValorTotalPecas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a porcentagem do IPI: ");
        double ipi = sc.nextDouble();
        
        System.out.println("Digite os dados da peça 1:");
        int codigo1 = sc.nextInt();
        double valor1 = sc.nextDouble();
        int quantidade1 = sc.nextInt();
        
        System.out.println("Digite os dados da peça 2:");
        int codigo2 = sc.nextInt();
        double valor2 = sc.nextDouble();
        int quantidade2 = sc.nextInt();
        
        double valorTotal = (valor1 * quantidade1 + valor2 * quantidade2) * (ipi / 100 + 1);
        
        System.out.printf("Valor total a ser pago: R$ %.2f", valorTotal);
        
        sc.close();
    }
}
