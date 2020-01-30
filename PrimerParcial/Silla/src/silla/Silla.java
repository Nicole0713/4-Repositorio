/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silla;

/**
 *
 * @author Alex
 */
public class Silla {
    
     String modelo="X";
     int npatas=5;
     String Color="Amarillo";
     String Forma="Cuadrada";
     
                public Silla()
                {
			npatas=5;			
		}
					
		public Silla(String mod, int patas, String col, String form)
			{
				this.modelo=mod;
				this.npatas=patas;
				this.Color=col;
				this.Forma=form;	
			}
					
					
                public void mostrar()
                        {
						
						
				System.out.println("Los atributos son los siguientes ");
				System.out.println("El modelo es "+this.modelo);
				System.out.println("El Numero de patas es "+this.npatas);
				System.out.println("El color es "+this.Color);
				System.out.println("La forma es "+this.Forma);
								
			}
    
    public static void main(String[] args) {
    
			Silla silla = new Silla();	
			silla.mostrar();
				
				
				
			}
	}
