/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipodromo;

import hipodromo.Animal;
import hipodromo.Caballo;


/**
 *
 * @author Alex
 */
public class Hipodromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Animal ani;        
    ani = new Caballo("Afortunado",57,"Diego Vera");
    ani.alimentar();
    Caballo caballo=(Caballo)ani;
    caballo.correr();
    }
}

