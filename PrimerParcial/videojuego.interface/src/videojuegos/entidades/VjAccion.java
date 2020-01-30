/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuegos.entidades;
import videojuegos.interfaces.Armable;
/**
 *
 * @author Alex
 */
public class VjAccion extends VideoJuego implements Armable {
    
    private boolean tieneArmasEspeciales;
    
    //Constructores
     public VjAccion(){
         
     }
     
     public VjAccion(String nombre,int puntos,boolean tieneArmasEspeciales){
         super(nombre,puntos);
         this.tieneArmasEspeciales=tieneArmasEspeciales;
     }
    
    
    //Metodos
    public void luchar(String estrategia){
        
    }
    @Override
    public void armar(String armas){
        
    }
    @Override
    public boolean cambiarPuntaje(){
    return true ;
    }
     @Override
    public void mostrar(){
        System.out.println("Nombres" + nombre + "Puntos" + puntos +"Armas" + tieneArmasEspeciales);
    }
    
    @Override
    public void jugar(){
        System.out.println("Jugando xd");  
    }
    
   
}
