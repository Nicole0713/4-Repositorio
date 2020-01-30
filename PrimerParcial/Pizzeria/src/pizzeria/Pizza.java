/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Pizza {
    
    Scanner sc = new Scanner(System.in);
    
    String nombre;
    String tamañop="Pequeña";
    String tamañom="Mediana";
    String tamañof="Familiar";
    String [] Ingredientes;
    
    int preciop=5;
    int preciom=8;
    int preciof=12;
    
    float acum=0f;
    float tparcial=0f;
    
    //centinela
    
    int centinela = 10;
    private int ning;
    
    public Pizza()
    {
        
    }
    
    public Pizza(String nom, String[] Ingredientes, String tamp, String tamm, String tamf, int prep, int prem, int pref) {
        this.nombre = nom;
        this.Ingredientes = Ingredientes;
        this.tamañop=tamp;
        this.tamañom=tamm;
        this.tamañof=tamf;
        this.preciop=prep;
        this.preciom=prem;
        this.preciof=pref;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamañop() {
        return this.tamañop;
    }

    public void setTamañop(String tamañop) {
        this.tamañop = tamañop;
    }

    public String getTamañom() {
        return this.tamañom;
    }

    public void setTamañom(String tamañom) {
        this.tamañom = tamañom;
    }

    public String getTamañof() {
        return this.tamañof;
    }

    public void setTamañof(String tamañof) {
        this.tamañof = tamañof;
    }

    public String[] getIngredientes() {
        return this.Ingredientes;
    }

    public void setIngredientes(String[] Ingredientes) {
        this.Ingredientes = Ingredientes;
    }

    public int getPreciop() {
        return this.preciop;
    }

    public void setPreciop(int preciop) {
        this.preciop = preciop;
    }

    public int getPreciom() {
        return this.preciom;
    }

    public void setPreciom(int preciom) {
        this.preciom = preciom;
    }

    public int getPreciof() {
        return this.preciof;
    }

    public void setPreciof(int preciof) {
        this.preciof = preciof;
    }
    
            
    
  //METODOS Y DESARROLLO
    
   public void mostrardatos()
    {
        System.out.println("BIENVENIDOS A LA PIZZERIA ALEX");
       System.out.println("-----Escoga su menu-----");
        
        int men = 0;
        int numingredientes=0;
        
        while(men!=centinela){
            System.out.println("Escoga tamaño de la pizza a pedir");
            System.out.println("1 -- Pizza Pequeña ");
            System.out.println("2 -- Pizza Mediana ");
            System.out.println("3 -- Pizza Familiar ");
            
            System.out.println("-----Cada PIZZA contiene 2 ingredientes de cortesia ");
            System.out.println("-----Cuantos ingredientes desea------- ");
            System.out.println("-----Si desea agregar mas ingredientes cuestan $1.50 C/U ");
            
            System.out.println("10 -- Digite 10 para calcular pedido");
            
            men=sc.nextInt();
            numingredientes=sc.nextInt();
            
            switch(men){
                
             case 1:
                 
                 System.out.println("Escogio la Pizza Pequeña ");
                 tparcial=preciop+(numingredientes*1.50f);
                 System.out.println("Valor Subtotal es "+tparcial);
                 acum=(acum+tparcial);
                
                    break;
             case 2:
                 
                 System.out.println("Escogio la Pizza Mediana ");
                 tparcial=preciom+(numingredientes*1.50f);
                 System.out.println("Valor Subtotal es "+tparcial);
                 acum=(acum+tparcial);
                 
                    break;
             case 3:
                 
                 System.out.println("Escogio la Pizza Familiar ");
                 tparcial=preciof+(numingredientes*1.50f);
                 System.out.println("Valor Subtotal es "+tparcial);
                 acum=(acum+tparcial);
                 
                    break; 
           
             default:
                    System.out.println("Su compra es de  "+  acum + "$");
                 break;
        }
    }
        
    }
    
  

}


   
