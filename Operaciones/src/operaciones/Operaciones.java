/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones;


import java.util.Scanner;
/**
 *
 * @author COMPU.CHEX
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        OPERACIONES:
        Scanner entrada = new Scanner(System.in);
        float num1,num2;
        float suma,resta,multi,div,resto;
        System.out.println("Digite el primer numero ");
        num1=entrada.nextFloat();
        System.out.println("Digite el segundo numero ");
        num2=entrada.nextFloat();
        //SUMA:
        suma= num1 + num2;
        //RESTA:
        resta= num1 - num2;
        //MULTIPLICACION:
        multi= num1 * num2;
        //DIVISION:
        div= num1/num2;
        //RESTO:
        resto= num1%num2;
        
        //MOSTRAR
        System.out.println("La suma es:"+suma);
        System.out.println("La resta es:"+resta);
        System.out.println("La multiplicacion es:"+multi);
        System.out.println("La division es:"+div);
        System.out.println("El resto es:"+resto);
    }


}
