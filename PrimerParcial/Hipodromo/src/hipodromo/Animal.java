/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipodromo;

/**
 *
 * @author Alex
 */
public abstract class Animal { 
    
private String nombre;
    
    public Animal()
    {
        
    }
    
    public Animal(String nombre)
    {
        this.nombre=nombre;
    }
    
    public void alimentar(){
        System.out.println("EL ANIMAL ESTA SIENDO ALIMENTADO ANTES DE LA CARRERA");
    }
    public void correr(){
        System.out.println("Caballo corre en carrera");
    }
   
}


