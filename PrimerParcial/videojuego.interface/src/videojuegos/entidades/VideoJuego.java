/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuegos.entidades;
import videojuegos.interfaces.ManejoPuntaje;
/**
 *
 * @author Alex
 */
public abstract class VideoJuego implements ManejoPuntaje {
    protected String nombre;
    protected int puntos;
    
    public VideoJuego(){
        
    }
    
    public VideoJuego(String nombre, int puntos ){
        this.nombre=nombre;
        this.puntos=puntos;
               
    }
    //Metodos
    public void mostrar(){
        System.out.println(nombre);
        System.out.println(puntos);
    }
    
    public abstract void jugar ();
}
