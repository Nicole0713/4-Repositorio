/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class Administracion {
    
    public ArrayList<Animal> animales = new ArrayList();
    
    //constructror
    public Administracion(){
        
        animales=new ArrayList();
    }
    
    //metodo de retorno
    
    public int OperacionContar(){
        int rango=0;
        
       for (Animal ani : animales){
           if(ani instanceof Lobo ){
               if(((Lobo)ani).getVelocidad()>3){
                System.out.println(" Codigo " + ani.getCodigo()+ " Alimentos "+ ani.getAlimentos()+" Velocidad "+ ((Lobo)ani).getVelocidad());               
                rango++;
               
               
           }
           
           
       }
        
       } 
        
        System.out.println("El numero de lobos son " + rango);
        return rango;
    }
}
        
        
        
        
        
 