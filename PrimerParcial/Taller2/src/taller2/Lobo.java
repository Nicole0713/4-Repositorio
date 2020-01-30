/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

/**
 *
 * @author Alex
 */
public class Lobo extends Animal{
    
    private double velocidad;
    
    public Lobo(){
        
    }
    
    public Lobo(String codigo, String alimentos, double velocidad){
        super(codigo,alimentos);
        this.velocidad=velocidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
    //METODO PROPIO DE LA CASA
    
    public void trotar(){
        
    }
    
    
    //METODOS HEREDADOS DE LA CLASE PADRE ANIMAL
    @Override
    public void comer() {
     
    }

    @Override
    public void mostrar() {
        System.out.println("El codigo es "+ getCodigo()+"El alimento es "+ getAlimentos()
        +"La velocidad es "+ getVelocidad());
    }
    
    //metodo de la interfaz
    @Override
    public void ubicacion(){
        System.out.println("UBICACION----AREA NORTE");
    }
    
    
}
