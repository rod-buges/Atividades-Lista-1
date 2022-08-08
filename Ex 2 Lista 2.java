/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojetoensw;

import java.util.Scanner;

/**
 *
 * @author Rodrigo Buges
 */
public class atv1Lista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
      
        String nome, sexo, ec, solteira, anos;
        
        
        System.out.println("Informe o seu nome: ");
        nome = scanner.nextLine();
        
        System.out.println("Informe o seu sexo (f)feminino / (m)masculino: ");
        sexo = scanner.nextLine();
        
        System.out.println("Informe o seu estado civil casada/solteira: ");
        ec = scanner.nextLine();
        
        if (ec != "solteira"){
            System.out.println("Há quantos anos vc está casada? ");
            anos = scanner.nextLine();
            
        } else {
            System.out.println("programa encerrado");
        }
                           
    }
    
}
