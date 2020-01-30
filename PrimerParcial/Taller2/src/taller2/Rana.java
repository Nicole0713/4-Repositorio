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
public class Rana extends Animal{
    
    private double longitudSalto;
    
    //constructor vacio
    public Rana(){
        
    }
    //contructor parametrizado
    public Rana(String codigo, String alimentos, double longitudSalto){
        super(codigo,alimentos);
        this.longitudSalto=longitudSalto;
    }
    
    //getters and setters

    public double getLongitudSalto() {
        return longitudSalto;
    }

    public void setLongitudSalto(double longitudSalto) {
        this.longitudSalto = longitudSalto;
    }
    
    //metodo propio de la clase
    
    public void saltar(){
        
    }
    
    
    //metodos heredados

    @Override
    public void comer() {
        
        }

    @Override
    public void mostrar() {
        System.out.println("El codigo es "+ getCodigo()+ "El alimento es "+ getAlimentos()
        + "Longitud Salto "+ getLongitudSalto());
    }
    
      //metodo de la interfaz
    @Override
    public void ubicacion(){
        System.out.println("UBICACION----PANATANO EN AREA SUR");
    }
    
}
