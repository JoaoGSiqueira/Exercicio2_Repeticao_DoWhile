/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2_repeticao_dowhile;

import java.util.Scanner;

/**
 *
 * @author João Gabriel
 */
public class Exercicio2_Repeticao_DOWHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
        int i;
        System.out.println("valores pares na faixa de 1000 a 1500.");
         i = 1000;
            do
            {
                System.out.println(i);
                i+=2;
                
            } while (i <= 1500);
    }
    
}
