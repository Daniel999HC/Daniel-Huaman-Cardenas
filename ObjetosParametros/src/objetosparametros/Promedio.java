/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetosparametros;

import java.util.Scanner;

/**
 *
 * @author COMPU.CHEX
 */
public class Promedio {
    float promedio;
    /**
     * @param args the command line arguments
     */
    public void sacarP(int nota1,int nota2,int nota3,int nota4){
        promedio=(nota1+nota2+nota3+nota4)/4;
        System.out.println("El promedio es: "+promedio);
    }
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int nota1,nota2,nota3,nota4;
        System.out.println("Ingrese las notas: ");
        System.out.print("Primera nota: ");
        nota1=entrada.nextInt();
        System.out.print("Segunda nota: ");
        nota2=entrada.nextInt();
        System.out.print("Tercera nota: ");
        nota3=entrada.nextInt();
        System.out.print("Cuarta nota: ");
        nota4=entrada.nextInt();
        Promedio luis=new Promedio();
        luis.sacarP(nota1, nota2, nota3, nota4);
    }
    
}
