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
public abstract class Animal implements Zoologico {
    
    public String codigo;
    public String alimentos;
    
   public Animal(){
       
   }
   
   public Animal ( String codigo,String alimentos){
       this.codigo=codigo;
       this.alimentos=alimentos;
   }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(String alimentos) {
        this.alimentos = alimentos;
    }
   
    
    public abstract void comer ();
    
    public abstract void mostrar();
   
    @Override
    public void ubicacion(){
        
    }
}
