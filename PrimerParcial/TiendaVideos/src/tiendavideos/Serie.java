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
public class Serie extends Video{
    
    private int num_cap;
    private int año;
    
    public Serie()
    {
        
    }
    
    public Serie(String Codigo, String titulo, String genero, float precio, int num_cap, int año)
    {
        super(Codigo, titulo, genero, precio);
        this.año=año;
        this.num_cap=num_cap;
    }

    public int getNum_cap() {
        return num_cap;
    }

    public void setNum_cap(int num_cap) {
        this.num_cap = num_cap;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public void ingresarDatos(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese el codigo de la Serie ");
        Codigo=sc.nextLine();
        System.out.println("Ingrese el titulo de la Serie ");
        titulo=sc.nextLine();
        System.out.println("Ingrese el genero de la Serie");
        genero=sc.nextLine();
        System.out.println("Ingrese el año de la Serie ");
        año=sc.nextInt();
    }
    
    public void mostrarDatos(){
        System.out.println("El codigo de la Serie es " + Codigo);
        System.out.println("El titulo de la Serie es " + titulo);
        System.out.println("El genero de la Serie es " + genero);
        System.out.println("El año de la Serie es "+ año);
    }
   
    @Override
    public double calcularPrecio() {
      float total =0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Cuantos capitulos tiene su serie? ");
       num_cap=sc.nextInt();
       
       if(num_cap>=1)
       {
            precio=(float) ((float) (precio)+(0.25*num_cap));
            total=precio;
           System.out.println("Su serie tiene " +num_cap+ " capitulos ");
           System.out.println("-El precio es "+ total);
       }
       else if (num_cap==0){
            total=precio;
             System.out.println("Su serie tiene " +num_cap+ " capitulos ");
             System.out.println("-El precio es "+ total);
           
    }
       
       return precio;
    }
}
