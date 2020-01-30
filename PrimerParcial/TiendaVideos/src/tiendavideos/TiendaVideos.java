/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendavideos;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class TiendaVideos {
    
    public static void main(String[] args) {
       Pelicula peli= new Pelicula();
       Serie serie = new Serie();
        
       Scanner menu= new Scanner(System.in);
       
       int centinela;
      
       do{
           System.out.println("BIENVENIDOS A LA TIENDA DE VIDEOS");
           System.out.println("---------------------------------");
           System.out.println("--------------MENU---------------");
           System.out.println("LA OPCION 1 ES PARA PELICULAS");
           System.out.println("LA OPCION 2 ES PARA SERIES");
           System.out.println("LA OPOCION 3 ES PARA SALIR");
           centinela=menu.nextInt();
            
                    switch(centinela)
                    {
                        case 1:
                            peli.ingresarDatos();
                            peli.mostrarDatos();
                            peli.calcularPrecio();
                            break;
                        case 2:
                            serie.ingresarDatos();
                            serie.mostrarDatos();
                            serie.calcularPrecio();
                            break;
                        case 3:
                        default:
                            System.out.println("VUELVA PRONTO");
                    }
       }while(centinela<3);
    }
    
}
