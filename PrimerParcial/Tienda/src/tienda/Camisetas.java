/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Camisetas {
    
    String CategoriaA;
    String CategoriaB;
    String CategoriaC;
    int precio=0;
    int numero=0;
    
    
    
        public Camisetas(){
            
        }
        
        public Camisetas(String catA, String catB, String catC, int pre, int num ){
            this.CategoriaA=catA;
            this.CategoriaB=catB;
            this.CategoriaC=catC;
            this.precio=pre;
            this.numero=num;
        } 

    public String getCategoriaA() {
        return this.CategoriaA;
    }

    public void setCategoriaA(String CategoriaA) {
        this.CategoriaA = CategoriaA;
    }

    public String getCategoriaB() {
        return this.CategoriaB;
    }

    public void setCategoriaB(String CategoriaB) {
        this.CategoriaB = CategoriaB;
    }

    public String getCategoriaC() {
        return this.CategoriaC;
    }

    public void setCategoriaC(String CategoriaC) {
        this.CategoriaC = CategoriaC;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
        public void CalcularTotal(){
            
                 }
     
     public void IngresarDatos(){
                    
        Scanner input = new Scanner(System.in);
         System.out.println("INGRESE LA CATEGORIA DE LA CAMISETA ");
         System.out.println("1 -- Categoria A");
         System.out.println("2 -- Categoria B");
         System.out.println("3 -- Categoria C");
         this.CategoriaA=input.nextLine();
         
         
    }
               
     
                public void MostrarDatos(){
                    System.out.println("----- BIENVENIDOS A LA TIENDA -----");
                    int CATEGORIAS = 0;
                    while(CATEGORIAS!=4){
            switch(CATEGORIAS){
                        case 1: 
                            
                            System.out.println("----- LA CATEGORIA DE LA CAMISETA ES -----"+CategoriaA);
                            break;
                        case 2:
                            System.out.println("----- LA CATEGORIA DE LA CAMISETA ES -----"+CategoriaB);
                            break;
                        case 3:
                            System.out.println("----- LA CATEGORIA DE LA CAMISETA ES -----"+CategoriaC);
                            break;
                          
                        
                    }
        }

                    
      
                    }
                   
                    
                    
                    
}



    
    
            
    
    

