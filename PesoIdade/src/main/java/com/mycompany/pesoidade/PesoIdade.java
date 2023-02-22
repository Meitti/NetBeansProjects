/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pesoidade;

/**
 *
 * @author Mêitti
 */
import java.util.Scanner;

public class PesoIdade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, nomeMaisVelho = "", nomeMaisNovo = "";
        int idade;
        double peso, altura, mediaPeso = 0.0, mediaAltura = 0.0;
        int countPessoasMaisDe25Anos = 0, countPessoasMenosDe10Anos = 0;

        // loop para ler as informações das 20 pessoas
        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite as informações da pessoa " + i + ":");
            System.out.print("Nome: ");
            nome = input.nextLine();
            System.out.print("Idade: ");
            idade = input.nextInt();
            System.out.print("Peso: ");
            peso = input.nextDouble();
            System.out.print("Altura: ");
            altura = input.nextDouble();
            input.nextLine(); // limpa o buffer de entrada

            // Verifica o nome da pessoa mais velha
            if (i == 1 || idade > Integer.parseInt(nomeMaisVelho.split(":")[1])) {
                nomeMaisVelho = nome + ":" + idade;
            }

            // Verifica o nome da pessoa mais nova
            if (i == 1 || idade < Integer.parseInt(nomeMaisNovo.split(":")[1])) {
                nomeMaisNovo = nome + ":" + idade;
            }

            // Calcula a média de peso das pessoas com mais de 25 anos
            if (idade > 25) {
                mediaPeso += peso;
                countPessoasMaisDe25Anos++;
            }

            // Calcula a média de altura das pessoas com menos de 10 anos
            if (idade < 10) {
                mediaAltura += altura;
                countPessoasMenosDe10Anos++;
            }
        }

        // Exibe os resultados
        System.out.println("Pessoa mais velha: " + nomeMaisVelho.split(":")[0]);
        System.out.println("Pessoa mais nova: " + nomeMaisNovo.split(":")[0]);
        if (countPessoasMaisDe25Anos > 0) {
            System.out.println("Média de peso das pessoas com mais de 25 anos: " + (mediaPeso / countPessoasMaisDe25Anos));
        } else {
            System.out.println("Não há pessoas com mais de 25 anos");
        }
        if (countPessoasMenosDe10Anos > 0) {
            System.out.println("Altura média das pessoas com menos de 10 anos: " + (mediaAltura / countPessoasMenosDe10Anos));
        } else {
            System.out.println("Não há pessoas com menos de 10 anos");
        }
    }
}

