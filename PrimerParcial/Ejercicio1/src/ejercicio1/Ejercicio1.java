/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Ejercicio1 {
        String Marca;
        String Modelo;
        String Color;
        String Procesador;
        
        public Ejercicio1(){
        
        }
        
        public Ejercicio1(String mar, String mod, String col, String pro){
            this.Marca=mar;
            this.Modelo=mod;
            this.Color=col;
            this.Procesador=pro;
        }
        
        public void Mostraralgo(){
            System.out.println("Bienvenidos a la tienda de computadoras, escoga su PC? ");
            System.out.println("¿Que marca desea? ");
            System.out.println("¿Que modelo desea? ");
            System.out.println("¿Que color de PC desea? ");
            System.out.println("¿Que procesador desea? ");
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc  = new Scanner(System.in);
        Ejercicio1 pc = new Ejercicio1 ();
        pc.Mostraralgo();
        
    }
    
}
