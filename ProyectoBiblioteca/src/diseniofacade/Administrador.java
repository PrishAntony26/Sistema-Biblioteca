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
public class Administrador implements Serializable{
    private String codAdmin;
    private String Usuario;
    private String Nombre;
    private String ApellidoPat;
    private String ApellidoMat;

    public Administrador(String codAdmin, String Usuario, String Nombre, String ApellidoPat, String ApellidoMat) {
        this.codAdmin = codAdmin;
        this.Usuario = Usuario;
        this.Nombre = Nombre;
        this.ApellidoPat = ApellidoPat;
        this.ApellidoMat = ApellidoMat;
    }

    public String getCodAdmin() {
        return codAdmin;
    }

    public void setCodAdmin(String codAdmin) {
        this.codAdmin = codAdmin;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoPat() {
        return ApellidoPat;
    }

    public void setApellidoPat(String ApellidoPat) {
        this.ApellidoPat = ApellidoPat;
    }

    public String getApellidoMat() {
        return ApellidoMat;
    }

    public void setApellidoMat(String ApellidoMat) {
        this.ApellidoMat = ApellidoMat;
    }
    
    
}
