/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojetoensw;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Rodrigo Buges
 */
public class atv1Lista {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
      
               long[] valor= new long[5]; 

        System.out.println("Digite um número inteiro:");
        valor[0]=teclado.nextLong();
        System.out.println("Digite mais um número inteiro:");
        valor[1]=teclado.nextLong();
        System.out.println("Digite outro número inteiro:");
        valor[2]=teclado.nextLong();
        System.out.println("Digite o ultimo número inteiro:");
        valor[3]=teclado.nextLong();
        System.out.println("Digite o ultimo número inteiro:");
        valor[4]=teclado.nextLong();
        
        teclado.close(); // Libera recursos de System.in

        boolean flag; // Flag será usada para indicar se foi feita uma troca

        do {
            // A cada iteração é marcado como se não houvesse ainda troca
            flag = false; 

            // Percorre por todos os elementos menos o ultimo, 
            //pois serão comparados o elemento com seu seguinte
            for(int i=0; i < valor.length - 1; i++) {

              // verifica se os elementos estão na ordem certa
              if (valor[i] > valor[i + 1]) {

                  // Se não estiverem ordenados os troca de lugar
                  long aux = valor[i]; // Variável para auxiliar para troca dos valores
                  valor[i] = valor[i + 1];
                  valor[i + 1] = aux;

                  flag = true;// Indica que hove uma troca
              }
            }
        } while (flag); // Se hove uma troca o algorítimo continua.

        System.out.println("Os números digitados na ordem crescente são: " + Arrays.toString(valor));

    }
}
                           
    
    

