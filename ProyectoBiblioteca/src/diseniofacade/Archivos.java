/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diseniofacade;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ok
 */
public class Archivos {
    
    private static File archUsuario = new File("Registros\\Usuarios.txt");
    private static File archAlumno = new File("Registros\\Alumnos.txt");
    private static File archLibros = new File("Registros\\Libros.txt");
    private static File archAdministrador = new File("Registros\\Administrador.txt");
    private static File archSolicitud = new File("Registros\\Solicitud.txt");
    
    public static Object lecturaDeArchivoUsuario() {
        ArrayList<Usuario> user;
        if(archUsuario.exists()){
           try{
               ObjectInputStream recArchUsuario = new ObjectInputStream(new FileInputStream(archUsuario));
               user =  (ArrayList<Usuario>)recArchUsuario.readObject();
               recArchUsuario.close();
           }catch(Exception ex){
               System.out.println("Ha ocurrido un error");
               System.out.println(ex);
               user = new ArrayList<Usuario>();
           }
        }else{
            //System.out.println("No existe el Archivo Usuario");
            user = new ArrayList<Usuario>();
        }
        return user;
    }
    
    public static void escribirEnArchivoUsuario() {
        archUsuario.delete();
        try{
            archUsuario.createNewFile();
            ObjectOutputStream recArchUsuario = new ObjectOutputStream(new FileOutputStream(archUsuario));
            recArchUsuario.writeObject(Biblioteca.usuarios);
            recArchUsuario.close();
        }catch(Exception ex){
            System.out.println("Ha ocurrido un error");
        }     
    }
    
    public static Object lecturaDeArchivoAlumno() {
        ArrayList<Alumno> alumno;
        if(archAlumno.exists()){
           try{
               ObjectInputStream recArchAlumno = new ObjectInputStream(new FileInputStream(archAlumno));
               alumno =  (ArrayList<Alumno>)recArchAlumno.readObject();
               recArchAlumno.close();
           }catch(Exception ex){
               System.out.println("Ha ocurrido un error");
               System.out.println(ex);
               alumno = new ArrayList<Alumno>();
           }
        }else{
            //System.out.println("No existe el Archivo Usuario");
            alumno = new ArrayList<Alumno>();
        }
        return alumno;
    }
    
    public static void escribirEnArchivoAlumno() {
        archAlumno.delete();
        try{
            archAlumno.createNewFile();
            ObjectOutputStream recArchAlumno = new ObjectOutputStream(new FileOutputStream(archAlumno));
            recArchAlumno.writeObject(Biblioteca.alumnos);
            recArchAlumno.close();
        }catch(Exception ex){
            System.out.println("Ha ocurrido un error");
        }     
    }
    
    public static Object lecturaDeArchivoLibro() {
        ArrayList<Libro> libro;
        if(archLibros.exists()){
           try{
               ObjectInputStream recArchLibro = new ObjectInputStream(new FileInputStream(archLibros));
               libro =  (ArrayList<Libro>)recArchLibro.readObject();
               recArchLibro.close();
           }catch(Exception ex){
               System.out.println("Ha ocurrido un error");
               System.out.println(ex);
               libro = new ArrayList<Libro>();
           }
        }else{
            //System.out.println("No existe el Archivo Libro");
            libro = new ArrayList<Libro>();
        }
        return libro;
    }
    
    public static void escribirEnArchivoLibro() {
        archLibros.delete();
        try{
            archLibros.createNewFile();
            ObjectOutputStream recArchLibro = new ObjectOutputStream(new FileOutputStream(archLibros));
            recArchLibro.writeObject(Biblioteca.libros);
            recArchLibro.close();
        }catch(Exception ex){
            System.out.println("Ha ocurrido un error");
        }     
    }
    
    public static Object lecturaDeArchivoAdministrador() {
        ArrayList<Administrador> admin;
        if(archAdministrador.exists()){
           try{
               ObjectInputStream recArchAdministrador = new ObjectInputStream(new FileInputStream(archAdministrador));
               admin =  (ArrayList<Administrador>)recArchAdministrador.readObject();
               recArchAdministrador.close();
           }catch(Exception ex){
               System.out.println("Ha ocurrido un error");
               System.out.println(ex);
               admin = new ArrayList<Administrador>();
           }
        }else{
            //System.out.println("No existe el Archivo Libro");
            admin = new ArrayList<Administrador>();
        }
        return admin;
    }
    
    public static void escribirEnArchivoAdministrador() {
        if(archAdministrador!=null){
            archAdministrador.delete();
        }
        try{
            archAdministrador.createNewFile();
            ObjectOutputStream recArchAdministrador = new ObjectOutputStream(new FileOutputStream(archAdministrador));
            recArchAdministrador.writeObject(Biblioteca.administradores);
            recArchAdministrador.close();
        }catch(Exception ex){
            System.out.println("Ha ocurrido un error");
        }     
    }
    
    public static void escribirEnArchivoSolicitud() {
        archSolicitud.delete();
        try{
            archSolicitud.createNewFile();
            ObjectOutputStream recArchSolicitud = new ObjectOutputStream(new FileOutputStream(archSolicitud));
            recArchSolicitud.writeObject(Biblioteca.solicitudes);
            recArchSolicitud.close();
        }catch(Exception ex){
            System.out.println("Ha ocurrido un error");
        }     
    }
    
    public static Object lecturaDeArchivoSolicitud() {
        ArrayList<Solicitud> soli;
        if(archSolicitud.exists()){
           try{
               ObjectInputStream recArchSolicitud = new ObjectInputStream(new FileInputStream(archSolicitud));
               soli=  (ArrayList<Solicitud>)recArchSolicitud.readObject();
               recArchSolicitud.close();
           }catch(Exception ex){
               System.out.println("Ha ocurrido un error");
               System.out.println(ex);
               soli = new ArrayList<Solicitud>();
           }
        }else{
            //System.out.println("No existe el Archivo Libro");
            soli = new ArrayList<Solicitud>();
        }
        return soli;
    }
    
}
