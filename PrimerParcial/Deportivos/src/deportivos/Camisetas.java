/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deportivos;

import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class Camisetas {
    
    String Categroria;
    int precio; 
    int numero;
    int numcamisetas=0;
    String [] Camisetas;
            
    public Camisetas()
    {
        
    }
    
    public Camisetas(String Categroria, int precio, int numero) {
        this.Categroria = Categroria;
        this.precio = precio;
        this.numero = numero;
    }

    public String getCategroria() {
        return Categroria;
    }

    public void setCategroria(String Categroria) {
        this.Categroria = Categroria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumcamisetas() {
        return numcamisetas;
    }

    public void setNumcamisetas(int numcamisetas) {
        this.numcamisetas = numcamisetas;
    }
    
    
}