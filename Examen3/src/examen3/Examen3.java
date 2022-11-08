/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen3;

/**
 *
 * @author COMPU.CHEX
 */

    class Automotriz{
    String marca;
    int precio;
    String ruedas;
    String color;
    public Automotriz(String n,int p,String r,String c){
        this.marca=n;
        this.precio=p;
        this.ruedas=r;
        this.color=c;
    }
    String informacionAuto(){
        return this.marca+this.precio+this.ruedas+this.color;
    }
}
class nodo{
    Automotriz dato;
    nodo sgte;
    nodo ant;
    public nodo(String n,int p,String r,String c){
        dato=new Automotriz(n,p,r,c);
        this.sgte=null;
    }
}
class metodo{
    nodo origen=null;
    void ingresar(String n,int p,String r,String c){
        nodo newnodo=new nodo(n,p,r,c);
        if(origen==null){
            origen=newnodo;
        }else{
            newnodo.sgte=origen;
            origen=newnodo;
        }
    }
    void mostrarsimple(){
        nodo temp=origen;
        while(temp!=null){
            System.out.print(temp.dato.informacionAuto()+"--->");
            temp=temp.sgte;
        }
    }
}
class metodo2{
    nodo origen, fin;
    public metodo2(){
        this.origen=null;
        this.fin=null;
    }
    void ingresar(String n,int p,String r,String c){
        nodo newnodo=new nodo(n,p,r,c);
        if(origen==null){
            fin=origen=new nodo(n,p,r,c);
        }else{
            newnodo.sgte=origen;
            origen.ant=newnodo;
            origen=newnodo;
        }
    }
    void mostrarp(){
        nodo temp=origen;
        while(temp!=null){
            System.out.print(temp.dato.informacionAuto()+" --> ");
            temp=temp.sgte;
        }
    }
    void mostrarc(){
        nodo temp=fin;
        while(temp!=null){
            System.out.print(temp.dato.informacionAuto()+" --> ");
            temp=temp.ant;
        }
    }
}
    /**
     * 
     */
    public class Examen3 {
    public static void main(String[] args) {
        metodo Auto=new metodo();
        metodo2 Auto2=new metodo2();
        System.out.println("Lista Simple");
        Auto.ingresar("Mercedez\t",10500,"\t4","negro");
        Auto.ingresar("Audi\t",5700,"\t4","blanco");
        Auto.ingresar("Ford\t",8300,"\t4","azul");
        Auto.ingresar("Honda\t",7500,"\t4","amarillo");
        Auto.ingresar("Tesla\t",12000,"\t4","dorado");
        Auto.mostrarsimple();
        System.out.println("\nLista Doble");
        Auto2.ingresar("Toyota\t", 9200, "\t4","verde");
        Auto2.ingresar("Chevrolet\t", 8600, "\t4","anaranja");
        Auto2.ingresar("BWM\t", 15200, "\t4","celeste");
        Auto2.ingresar("Nissan\t", 9500, "\t4","plata");
        Auto2.ingresar("Subaru\t", 7000, "\t4","morado");
        System.out.println("\nPor Pila");
        Auto2.mostrarp();
        System.out.println("\nPor Cola");
        Auto2.mostrarc();
        System.out.println("\n");
        
    }
}
    

