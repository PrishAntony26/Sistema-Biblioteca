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
public class Solicitud implements Serializable{
    private String codLibro;
    private String nombreLibro;
    private String codAlumno;
    private String nombreAlumno;
    private String editorial;
    private String autor;
    private boolean estado=true;

    public Solicitud(String codLibro, String nombreLibro, String codAlumno, String nombreAlumno, String editorial, String autor) {
        this.codLibro = codLibro;
        this.nombreLibro = nombreLibro;
        this.codAlumno = codAlumno;
        this.nombreAlumno = nombreAlumno;
        this.editorial = editorial;
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    
    public String getCodLibro() {
        return codLibro;
    }

    public void setCodLibro(String codLibro) {
        this.codLibro = codLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getCodAlumno() {
        return codAlumno;
    }

    public void setCodAlumno(String codAlumno) {
        this.codAlumno = codAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
