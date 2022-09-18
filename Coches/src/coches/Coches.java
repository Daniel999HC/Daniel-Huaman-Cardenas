/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coches;

/**
 *
 * @author COMPU.CHEX
 */
public class Coches {
String color;
String marca;
int km;
    public static void main(String[] args) {
        Coches coche1=new Coches();
        
        coche1.color="negro";
        coche1.km=25;
        coche1.marca="asus";
        System.out.println("El color de coche es: "+coche1.color);
        System.out.println("La marca del cohce es: "+coche1.marca);
        System.out.println("Los kilometros del coche son: "+coche1.km);
        
    }
    
}
