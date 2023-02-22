/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemploidadepeso;

import java.util.Scanner;

/**
 *
 * @author Mêitti
 */

public class ExemploIdadePeso {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int idade, totalPessoasMais90Kg = 0;
        double peso, somaIdades = 0, mediaIdades;
        
        for (int i = 1; i <= 7; i++) {
            System.out.println("Digite a idade da " + i + "a pessoa:");
            idade = entrada.nextInt();
            System.out.println("Digite o peso da " + i + "a pessoa:");
            peso = entrada.nextDouble();
            somaIdades += idade;
            if (peso > 90) {
                totalPessoasMais90Kg++;
            }
        }
        
        mediaIdades = somaIdades / 7;
        
        System.out.println("Quantidade de pessoas com mais de 90 quilos: " + totalPessoasMais90Kg);
        System.out.println("Média das idades: " + mediaIdades);
    }

}
