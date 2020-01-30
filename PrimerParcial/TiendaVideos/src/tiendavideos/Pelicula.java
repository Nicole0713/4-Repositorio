/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendavideos;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Pelicula extends Video {
    
    private boolean esOriginal=false;
    private int año;
    
    public Pelicula()
    {
        
    }
    
    public Pelicula(String Codigo, String titulo, String genero, float precio, boolean esOriginal, int año)
    {
        super(Codigo, titulo, genero, precio);
        this.esOriginal=esOriginal;
        this.año=año;
    }

    public boolean isEsOriginal() {
        return esOriginal;
    }

    public void setEsOriginal(boolean esOriginal) {
        this.esOriginal = esOriginal;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public void ingresarDatos(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese el codigo de la Pelicula ");
        Codigo=sc.nextLine();
        System.out.println("Ingrese el titulo de la Pelicula ");
        titulo=sc.nextLine();
        System.out.println("Ingrese el genero de la Pelicula ");
        genero=sc.nextLine();
        System.out.println("Ingrese el año de la Pelicula ");
        año=sc.nextInt();
    }
    
    public void mostrarDatos(){
        System.out.println("El codigo de la Pelicula es " + Codigo);
        System.out.println("El titulo de la Pelicula es " + titulo);
        System.out.println("El genero de la Pelicula es " + genero);
        System.out.println("El año de la Pelicula es " + año);
    }
    
    @Override
    public double calcularPrecio() {
       float total =0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Su pelicula es original? ");
       esOriginal=sc.nextBoolean();
       
       if(esOriginal==true)
       {
            precio=(float) (precio+1.90);
            total=precio;
           System.out.println("Es original "+ esOriginal); 
           System.out.println("El precio es "+ total);
       }
       else if (esOriginal==false){
            precio=(float) (precio+0.50);
            total=precio;
             System.out.println("Es original "+ esOriginal); 
             System.out.println("El precio es "+ total);
           
    }
       
       return precio;
    }
    
    
}
