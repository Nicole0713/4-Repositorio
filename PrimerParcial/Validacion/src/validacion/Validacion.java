/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacion;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Validacion {
    
       static int num1;
       static  int num2;
        static int num3;
        static  int num4;
        static  int num5;
         static  int num6;
        
        public void pedirnum(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el numero 1");
            num1=sc.nextInt();
             System.out.println("Ingrese el numero 2");
            num2=sc.nextInt();
             System.out.println("Ingrese el numero 3");
            num3=sc.nextInt();
             System.out.println("Ingrese el numero 4");
            num4=sc.nextInt();
             System.out.println("Ingrese el numero 5");
            num5=sc.nextInt();
             System.out.println("Ingrese el numero 6");
            num6=sc.nextInt();
            
        } 
        
         
        public void calculo(){
               
        if((num1>num2)&&(num1>num3)&&(num1>num4)&&(num1>num5)&&(num1>num6)){
            System.out.println("El numero "+num1+" es mayor que el resto");
        }
         if((num2>num1)&&(num2>num3)&&(num2>num4)&&(num2>num5)&&(num2>num6)){
            System.out.println("El numero "+num2+" es mayor que el resto");
        }
          if((num3>num1)&&(num3>num1)&&(num3>num4)&&(num3>num5)&&(num3>num6)){
            System.out.println("El numero "+num3+" es mayor que el resto");
        }
           if((num4>num1)&&(num4>num2)&&(num4>num3)&&(num4>num5)&&(num4>num6)){
            System.out.println("El numero "+num4+" es mayor que el resto");
        }
            if((num5>num1)&&(num5>num2)&&(num5>num3)&&(num5>num4)&&(num5>num6)){
            System.out.println("El numero "+num5+" es mayor que el resto");
        }
             if((num6>num1)&&(num6>num2)&&(num6>num3)&&(num6>num4)&&(num6>num5)){
            System.out.println("El numero "+num6+" es mayor que el resto");
        }
         }
        
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Validacion ventas = new Validacion();
        ventas.pedirnum();
        ventas.calculo();
    }
    
}
