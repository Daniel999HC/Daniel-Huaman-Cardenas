/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Scanner;

/**
 *
 * @author COMPU.CHEX
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float calf1,calf2,calf3;
        float suma;
        System.out.println("Digite las 3 notas:");
        calf1=entrada.nextFloat();
        calf2=entrada.nextFloat();
        calf3=entrada.nextFloat();
        suma= calf1 + calf2 + calf3;
        System.out.println("La suma es:"+suma);
    }
    
}
