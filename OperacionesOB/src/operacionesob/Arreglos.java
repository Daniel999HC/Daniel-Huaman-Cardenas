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
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int[] Array1=new int[10];
        int[] Array2=new int[10];
        int[] Array3=new int[20];
        
        System.out.println("Digite el Primer Arreglo:");
        for(int i=0;i<10;i++){
            System.out.print((i+1)+". Digite numero: ");
            Array1[i]=entrada.nextInt();
        }
        System.out.println("\nDigite el Segundo Arreglo:");
        for(int i=0;i<10;i++){
            System.out.print((i+1)+". Digite numero: ");
            Array2[i]=entrada.nextInt();
        }
        //MESCLAR ARREGLOS EN EL ARREGLO 3
        int j=0;
        for(int i=0;i<10;i++){
            Array3[j]=Array1[i];
            j++;
            Array3[j]=Array2[i];
            j++;
        }
        System.out.println("El Tercer Arreglo es:");
        for(int i=0;i<20;i++){
            System.out.println(Array3[i]+" ");
        }
        System.out.println(" ");
        // SUBIR UNA POCISION
        int ultimo;
        ultimo=Array1[9];
        for(int i=8;i>=0;i--){
            Array1[i+1]=Array1[i];
        }
        Array1[0]=ultimo;
        System.out.println("El numero arreglo es:");
        for(int i=0;i<10;i++){
            System.out.println(Array1[i]+" ");
        }
    }
    
}
