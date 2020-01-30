/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Producto {
    Scanner sc = new Scanner(System.in);
    int cantidad=0;
    int centinela=6;
    int pro = 0;
     float producto1= (float) 2.98f;
     float producto2= (float) 4.50f;
     float producto3= (float) 9.98f;
     float producto4= (float) 4.49f;
     float producto5= (float) 6.87f;
     float acum=0f;
     float tparcial=0f;
             
    public Producto() {
    }

    public Producto(float pro1, float pro2, float pro3, float pro4, float pro5) {
        this.producto1=pro1;
        this.producto2=pro2;
        this.producto3=pro3;
        this.producto4=pro4;
        this.producto5=pro5;
    }
             
     public void mostrar()
     {
        
         while(pro!=centinela){
             System.out.println("Ingrese el numero del producto o 6 para finalizar y presentar ");
             pro=sc.nextInt();
             System.out.println("Ingrese cantidad a vender  o 6 para finalizar y presentar ");
             cantidad=sc.nextInt();
             switch(pro){
             case 1:
                 tparcial=producto1*cantidad;
                 System.out.println("Valor producto 1 "+tparcial);
                 
                 acum=(acum+tparcial);
                    break;
             case 2:
                 tparcial=producto2*cantidad;
                 System.out.println("Valor producto 2 "+tparcial);
                  
                  acum=(acum+tparcial);
                    break;
             case 3:
                 tparcial=producto3*cantidad;
                 System.out.println("Valor producto 3 "+tparcial);
                  
                 acum=(acum+tparcial);
                    break; 
             case 4:
                  tparcial=producto4*cantidad;
                 System.out.println("Valor producto 4 "+tparcial);
                 
                 acum= (acum+tparcial);
                    break;
             case 5:
                 tparcial=producto5*cantidad;
                 System.out.println("Valor producto 5 "+tparcial);
                 
                 acum= (acum+tparcial);
                    break;
             default:
                   
                 System.out.println("Estamos calculando su compra "+acum);
       
      
                   // operacion1=(int) (producto1*cantidad);
                   // operacion2=(int) (producto2*cantidad);
                    //operacion3=(int) (producto3*cantidad);
                   // operacion4=(int) (producto4*cantidad);
                   // operacion5=(int) (producto5*cantidad);
          
         // System.out.println("El valor total de la compra es "+ operacion1+operacion2+operacion3+operacion4+operacion5);
                  
      }
                 
         }
              }
           }

    
 
    
     
     
     

