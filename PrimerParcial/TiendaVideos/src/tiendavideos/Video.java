/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendavideos;

/**
 *
 * @author Alex
 */
public abstract class Video {
    
    protected String Codigo;
    protected String titulo;
    protected String genero;
    protected float precio;
    
    public Video()
    {
        precio=3.00f;
    }
    
    public Video(String Codigo, String titulo, String genero, float precio)
    {
        this.Codigo=Codigo;
        this.titulo=titulo;
        this.genero=genero;
        this.precio=precio;
    }

    public String getCodigo() {
        return this.Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
        

    public abstract double calcularPrecio();
        
  
}
