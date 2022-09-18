/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones2;

import java.util.Scanner;

/**
 *
 * @author COMPU.CHEX
 */
public class Operaciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //RAIZ: 
        double raiz= Math.sqrt(16);
        System.out.println(raiz);
        //ELEVACION 2 NUMEROS:
        Scanner entrada=new Scanner(System.in);
        double base,exponente;
        System.out.println("Digite la base:");
        base = entrada.nextDouble();
        System.out.println("Digite el exponente:");
        exponente = entrada.nextDouble();
        double resultado=Math.pow(base, exponente);
        System.out.println("El resultado de la elevacion es: "+resultado);
        //REDONDEO DE NUMERO
        double numero = 7.63;
        long redondeo= Math.round(numero);
        System.out.println("El numero redondeado es: "+redondeo);
        
        
        
    }
    
}
