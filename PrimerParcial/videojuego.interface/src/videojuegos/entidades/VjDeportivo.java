/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuegos.entidades;

/**
 *
 * @author Alex
 */
public class VjDeportivo extends VideoJuego{
        private String deporte;
        
    
        public VjDeportivo(){
            
        }
        
         public VjDeportivo(String nombre, int puntos,  String deporte){
            super(nombre, puntos);
            this.deporte=deporte;
        }
        
        
   @Override
    public void mostrar(){
        //System.out.println("Nombres" + nombre + "Puntos" + puntos +"Deporte" + deporte);
    super.mostrar();
    System.out.println("Deporte "+ this.deporte);
        }
    @Override
    public boolean cambiarPuntaje(){
    return true ;
}
    @Override
    public void jugar(){
        System.out.println("Jugando VJ-Deportivos");  
    }
}
