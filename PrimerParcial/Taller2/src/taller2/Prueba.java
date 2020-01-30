/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

//INTEGRANTES
//RAMIREZ ABARCA ALEX
//JORDY SANCHEZ
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Administracion ana = new Administracion();
        
        Animal an= new Lobo();
        an= new Lobo("6445","Carne",10);
        an.mostrar();
        an.ubicacion();
        ana.animales.add(an);
        
        an= new Lobo("5454","Pollo-Apanado",5);
        an.mostrar();
        an.ubicacion();
        ana.animales.add(an);
        
        
        Animal an2= new Rana();
        
        an2=new Rana("541","Mosca",22);
        an2.mostrar();
        an2.ubicacion();
        ana.animales.add(an2);
        an2=new Rana("500","Planta",522);
        an2.mostrar();
        an2.ubicacion();
        ana.animales.add(an2);
        
        
       ana.OperacionContar();
    }
    
}
