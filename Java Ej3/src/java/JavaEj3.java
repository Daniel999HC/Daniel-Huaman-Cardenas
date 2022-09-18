/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Java;

import java.util.Scanner;



/**
 *
 * @author COMPU.CHEX
 */

public class JavaEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola a todos mi nombre es daniel");
        System.out.println("buen comando");
        int numero = 10;
        String colegio = "Ricardo Palma";
        Scanner entrada = new Scanner(System.in);
        int numero2;
        System.out.print("digite numero: ");
        numero2 = entrada.nextInt();
        System.out.println("Numero entero: " + numero);
        System.out.println("Decir:" + colegio);
        System.out.println("El numero es: "+numero2);
    }
    
}
