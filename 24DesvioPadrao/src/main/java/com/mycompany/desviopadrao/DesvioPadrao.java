/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desviopadrao;

/**
 *
 * @author Mêitti
 */
import java.util.Scanner;

public class DesvioPadrao {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // cria o vetor de 10 elementos
        double[] vetor = new double[10];
        
        // preenche o vetor com os valores informados pelo usuário
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vetor[i] = entrada.nextDouble();
        }
        
        // calcula a média do vetor
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        double media = soma / vetor.length;
        
        // calcula a soma dos quadrados das diferenças entre cada elemento do vetor e a média
        double somaQuadradosDiferencas = 0;
        for (int i = 0; i < vetor.length; i++) {
            double diferenca = vetor[i] - media;
            somaQuadradosDiferencas += Math.pow(diferenca, 2);
        }
        
        // calcula o desvio padrão
        double desvioPadrao = Math.sqrt(somaQuadradosDiferencas / (vetor.length - 1));
        
        // exibe o resultado
        System.out.printf("O desvio padrão é: %.2f\n", desvioPadrao);
        
        entrada.close();
    }

}
