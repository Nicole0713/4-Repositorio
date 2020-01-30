
package puerta;


  public class  Puerta{
             String modelo= "Y";
             String color= "Cafe";
             String forma = "Rectangular";
             String porte ="Grande";
			 
	 public Puerta(){
	 
	 }		 
	 public Puerta (String mod,String col,String form,String tam){
	     this.modelo=mod;
	     this.color=col;
	     this.forma=form;
	     this.porte=tam;
	 }
	 public void presentar(){
	  System.out.println("El modelo es :"+this.modelo);
	  System.out.println("El color es :"+this.color);
	  System.out.println("La forma es :"+this.forma);
	  System.out.println("El tamaño es :"+this.porte);
	  }

  public static void main(String[] args) {
    
			Puerta puer = new Puerta();	
			puer.presentar();
				
				
				
			}
	}