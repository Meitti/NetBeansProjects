
package com.mycompany.calculoidadedias;

import java.util.Scanner;


/**
 *
 * @author Mêitti
 */
public class Calculoidadedias {
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("quantos anis tu tem: ");
        int anos = entrada.nextInt();
        
        System.out.print("qual seu mes de aniversario: ");
        int meses = entrada.nextInt();
        
        System.out.print("qual dia do seu aniversario ");
        int dias = entrada.nextInt();
        
        int idadeEmDias = anos * 365 + meses * 30 + dias;
        
        System.out.println("A idade em dias é: " + idadeEmDias);
  
    }
}
