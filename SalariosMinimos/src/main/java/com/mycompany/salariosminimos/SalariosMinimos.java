/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salariosminimos;

import java.util.Scanner;

/**
 *
 * @author Mêitti
 */
public class SalariosMinimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor do salário mínimo: R$ ");
        double salarioMinimo = sc.nextDouble();
        
        System.out.print("Digite o valor do salário do usuário: R$ ");
        double salarioUsuario = sc.nextDouble();
        
        double qtdSalariosMinimos = salarioUsuario / salarioMinimo;
        
        System.out.printf("O usuário ganha %.2f salários mínimos", qtdSalariosMinimos);
        
        sc.close();
    }
}
