/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menoresprimos;

/**
 *
 * @author Mêitti
 */
public class MenoresPrimos {

    // função para verificar se um número é primo
    public static boolean ehPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] primos = new int[20]; // cria um vetor com 20 posições para os números primos
        int n = 2; // começa a busca pelos primos a partir do número 2
        int cont = 0; // contador para controlar o número de primos encontrados

        while (cont < 20) { // enquanto não encontramos os 20 primos
            if (ehPrimo(n)) { // verifica se o número atual é primo
                primos[cont] = n; // adiciona o número primo no vetor
                cont++; // incrementa o contador
            }
            n++; // passa para o próximo número
        }

        // imprime os 20 menores números primos positivos
        System.out.println("Os 20 menores números primos positivos são:");
        for (int i = 0; i < primos.length; i++) {
            System.out.print(primos[i] + " ");
        }
    }
}
