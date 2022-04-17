/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diseniofacade;

import javax.swing.JOptionPane;

/**
 *
 * @author ok
 */
public class OperacionesAlumno {
    
    public static void PrestamoNuevoLibro(Alumno al, Libro lib) {
        if(al.isMoroso()){
            JOptionPane.showMessageDialog(null, "Es usuario moroso no puede realizar una solicitud de prestamo");
        }else{
            if(al.getCantidadPrestada()==3){
                JOptionPane.showMessageDialog(null, "No puede reservar libro por que tiene prestado 3 libros");
            }else{
                if(lib.getCopiaDisponible()==0){
                     JOptionPane.showMessageDialog(null, "No hay stock del libro por el momento, intentelo mas tarde");
                }else{
                    //GenerarPrestamo
                    Biblioteca.agregarSolicitud(lib.getCodigoL(), lib.getTitulo(), al.getCodigo(), al.getNombre(), lib.getEditorial(),lib.getAutor());
                    //Modificamos la cantidad de libros prestados al alumno
                    al.setCantidadPrestada(al.getCantidadPrestada()+1);
                    //Agregamos un nuevo libro prestado al registro del alumno
                    al.agregarLibroAlumno(lib.getCodigoL(), lib.getTitulo(), lib.getEditorial(), lib.getGenerolit(), lib.getAutor());
                    //Guardamos los cambios del archivo alumno
                    Biblioteca.editarAlumno(al);
                    //Modificamos la cantidad de copia disponible para el libro
                    lib.setCopiaDisponible(lib.getCopiaDisponible()-1);
                    //Guardamos los cambios en el archivo de libros
                    Biblioteca.editarLibro(lib);
                    JOptionPane.showMessageDialog(null, "Se ha realizado el prestamo del libro correctamente");
                }
            }
        }
    }
    
}
