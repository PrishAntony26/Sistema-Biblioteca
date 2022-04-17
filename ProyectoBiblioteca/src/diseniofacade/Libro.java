/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diseniofacade;

import java.io.Serializable;

/**
 *
 * @author ok
 */
public class Libro implements Serializable{
    private String codigoL;
    private String titulo;
    private String editorial;
    private int copiaDisponible;
    private String generolit;
    private String autor;
    
    public Libro(String codigoL, String titulo, String editorial, int copiaDisponible, String generolit, String autor) {
        this.codigoL = codigoL;
        this.titulo = titulo;
        this.editorial = editorial;
        this.copiaDisponible = copiaDisponible;
        this.generolit = generolit;
        this.autor = autor;
    }

    public String getCodigoL() {
        return codigoL;
    }

    public void setCodigoL(String codigoL) {
        this.codigoL = codigoL;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getCopiaDisponible() {
        return copiaDisponible;
    }

    public void setCopiaDisponible(int copiaDisponible) {
        this.copiaDisponible = copiaDisponible;
    }

    public String getGenerolit() {
        return generolit;
    }

    public void setGenerolit(String generolit) {
        this.generolit = generolit;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
