/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aumentoproduto;

import java.util.Scanner;

/**
 *
 * @author Mêitti
 */


public class AumentoProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor do produto: ");
        double valor = sc.nextDouble();
        
        System.out.print("Digite a porcentagem de aumento: ");
        double percentual = sc.nextDouble();
        
        double aumento = valor * (percentual / 100);
        double novoValor = valor + aumento;
        
        System.out.printf("Valor do aumento: R$ %.2f%n", aumento);
        System.out.printf("Novo valor do produto: R$ %.2f", novoValor);
        
        sc.close();
    }
}
