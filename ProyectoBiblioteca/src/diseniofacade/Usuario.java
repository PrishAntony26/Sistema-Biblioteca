/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diseniofacade;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ok
 */
public class Usuario implements Serializable{
    private String usuario;
    private String codigo;
    private String nombre;
    private String apellidoPat;
    private String apellidoMat;
    private int celular;
    private String correo;
    private boolean moroso = false;
    private ArrayList<Libro> librosPrestados = new ArrayList<Libro>();
    
    public Usuario(String usuario, String codigo, String nombre, String apellidoP, int celular, String correo) {
        this.usuario = usuario;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidoPat = apellidoP;
        this.celular = celular;
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoPat;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoPat = apellidoP;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isMoroso() {
        return moroso;
    }

    public void setMoroso(boolean moroso) {
        this.moroso = moroso;
    }
    
    public void agregarLibroAlumno(String codigoL, String titulo, String editorial, String generolit, String autor){
        Libro lib = new Libro(codigoL, titulo, editorial, 0, generolit, autor);
        librosPrestados.add(lib);
    }
    
}
