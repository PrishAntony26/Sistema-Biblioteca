/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diseniofacade;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ok
 */
public class Biblioteca {
    static Scanner entrada = new Scanner(System.in);
    public static ArrayList<Usuario> usuarios = (ArrayList<Usuario>)Archivos.lecturaDeArchivoUsuario();
    public static ArrayList<Libro> libros = (ArrayList<Libro>)Archivos.lecturaDeArchivoLibro();
    public static ArrayList<Alumno> alumnos = (ArrayList<Alumno>)Archivos.lecturaDeArchivoAlumno();
    public static ArrayList<Administrador> administradores = (ArrayList<Administrador>)Archivos.lecturaDeArchivoAdministrador();
    public static ArrayList<Solicitud> solicitudes = (ArrayList<Solicitud>)Archivos.lecturaDeArchivoSolicitud();
    
    public static void agregarAlumno(String usuario, String codigo, String nombre, String apellidoPat, String apellidoMat, int celular, String correo){
        Alumno al = new Alumno(usuario, codigo, nombre, apellidoPat, apellidoMat, celular, correo);
        alumnos.add(al);
        Archivos.escribirEnArchivoAlumno();//Registramos nuevo alumno
    }
    
    public static void agregarSolicitud(String codLibro, String nombreLibro, String codAlumno, String nombreAlumno, String editorial, String autor){
        Solicitud soli = new Solicitud(codLibro, nombreLibro, codAlumno, nombreAlumno, editorial, autor);
        solicitudes.add(soli);
        System.out.println("si");
        Archivos.escribirEnArchivoSolicitud();
    }
    
    public static void leerUsuarios(){
        ArrayList<Usuario> usuarios = (ArrayList<Usuario>)Archivos.lecturaDeArchivoUsuario();
        
        for(int i=0;i<usuarios.size();i++){
            System.out.println("Usuario : "+usuarios.get(i).getUsuario());
            System.out.println("Codigo : "+usuarios.get(i).getCodigo());
            System.out.println("Nombre: "+usuarios.get(i).getNombre());
            System.out.println("Apellido Paterno: "+usuarios.get(i).getApellidoP());
            System.out.println("Celular: "+usuarios.get(i).getCelular());
            System.out.println("Correo: "+usuarios.get(i).getCorreo());
            System.out.println("Moroso: "+usuarios.get(i).isMoroso());
            System.out.println("===========================================");
        }
    }
    
    public static void leerLibros(){
        ArrayList<Libro> libros = (ArrayList<Libro>) Archivos.lecturaDeArchivoLibro();
        for(int i=0;i<libros.size();i++){
            System.out.println("Codigo de Libro: "+libros.get(i).getCodigoL());
            System.out.println("Titulo: "+libros.get(i).getTitulo());
            System.out.println("Editorial: "+libros.get(i).getEditorial());
            System.out.println("Copias disponibles: "+libros.get(i).getCopiaDisponible());
            System.out.println("Genero literareo: "+libros.get(i).getGenerolit());
            System.out.println("Autor: "+libros.get(i).getAutor());
            System.out.println("===========================================");
        }
    }
    
    public static void agregarAdmin(){
        Administrador admin01 = new Administrador("Admin01","User01","","","");
        Administrador admin02 = new Administrador("Admin02","User02","","","");
        Administrador admin03 = new Administrador("Admin03","User03","","","");
        Administrador admin04 = new Administrador("Admin04","User04","","","");
        Administrador admin05 = new Administrador("Admin05","User05","","","");
        administradores.add(admin01);
        administradores.add(admin02);
        administradores.add(admin03);
        administradores.add(admin04);
        administradores.add(admin05);
        Archivos.escribirEnArchivoAdministrador();
    }
    
    public static void editarAlumno(Alumno al){
        String cod = al.getCodigo();
        for(int i=0;i<alumnos.size();i++){
            //Bucamos al alumno
            if(cod.equals(alumnos.get(i).getCodigo())){
                alumnos.set(i, al);//Hacemos los cambios
                System.out.println("cambio "+alumnos.get(i).isMoroso());
                Archivos.escribirEnArchivoAlumno();
            }
        }
    }
    
    public static void editarLibro(Libro lib){
        String cod = lib.getCodigoL();
        for(int i=0;i<libros.size();i++){
            //Bucamos al alumno
            if(cod.equals(libros.get(i).getCodigoL())){
                libros.set(i, lib);//Hacemos los cambios 
                Archivos.escribirEnArchivoLibro();
            }
        }
    }
    
    public static Alumno loginAlumno(String codigo, String usuario){
        Alumno alumno;
        for(int i=0;i<alumnos.size();i++){
            if(codigo.equals(alumnos.get(i).getCodigo())&&(usuario.equals(alumnos.get(i).getUsuario()))){
                alumno = alumnos.get(i);
                return alumno;
            }
        }
        return null;
    }
    
    public static Administrador loginAdministrador(String codigo, String usuario){
        Administrador admin;
        for(int i=0;i<administradores.size();i++){
            if(codigo.equals(administradores.get(i).getCodAdmin())&&(usuario.equals(administradores.get(i).getUsuario()))){
                admin = administradores.get(i);
                return admin;
            }
        }
        return null;
    }
    
    
}
