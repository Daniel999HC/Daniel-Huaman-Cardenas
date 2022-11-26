/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.algoritmos;

/**
 *
 * @author ACER NITRO 5
 */
public class ProyectoAlgoritmos {

 /*C.O*/        static void insercion(int [] vec, int n )
                {
                    int aux , k;
    /*2 2 2 */      for (int i = 0; i < n; i++) 
                        {
    /*2*/                   aux = vec[i];
    /*1*/                   k = i;
    /*5*/                   while(k > 0 && vec[k-1] > aux)
                                {
    /*4*/                           vec[k] = vec[k-1];
    /*1*/                           k--;
                                }
    /*2*/                   vec[k] = aux;
                        }
                }   
}
class main{
    public static void main(String[] args) {
        int n=0;
        int[] array =new int[n];
        ProyectoAlgoritmos.insercion(array, n);
    }
}
        