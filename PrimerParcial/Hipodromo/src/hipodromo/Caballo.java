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
public class Caballo extends Animal{  
      
    private int numeroCompetencia;
    private String nombreJinete;

    public Caballo()
    {
        
    }
    
    public Caballo(String nombre, int numeroCompetencia, String nombreJinete)
    {
        super(nombre);
        this.numeroCompetencia=numeroCompetencia;
        this.nombreJinete=nombreJinete;
                
    }
    
    @Override
    public void correr()
    {
        System.out.println("Caballo corre en carrera");
    }
    
    
}  
