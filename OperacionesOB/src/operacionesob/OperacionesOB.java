/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesob;

import java.util.Scanner;

/**
 *
 * @author COMPU.CHEX
 */
public class OperacionesOB {

    int numero1,numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    public void leernumeros(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite el primer numero:");
        numero1=entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2=entrada.nextInt();
    }
    public void sumar(){
        suma= numero1 + numero2;
        System.out.println("La suma es:"+suma);
    }
    public void resta(){
        resta=numero1 - numero2;
        System.out.println("La resta es:"+resta);
    }
    public void multiplicacion(){
        multiplicacion=numero1*numero2;
        System.out.println("La multiplicacion es:"+multiplicacion);
    }
    public void division(){
        division=numero1/numero2;
        System.out.println("La division es:"+division);
    }
    public static void main(String[] args) {
        OperacionesOB calculadora=new OperacionesOB();
        calculadora.leernumeros();
        calculadora.sumar();
        calculadora.resta();
        calculadora.multiplicacion();
        calculadora.division();
    }
    
}
