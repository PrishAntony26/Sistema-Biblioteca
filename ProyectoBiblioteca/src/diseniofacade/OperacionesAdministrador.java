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
public class OperacionesAdministrador {
    
    public static boolean RegistrarNuevoAlumno(Alumno al){
        //Verificamos el codigo 
        for(int i=0;i<Biblioteca.alumnos.size();i++){
            if(al.getCodigo().equals(Biblioteca.alumnos.get(i).getCodigo())&&(al.getUsuario().equals(Biblioteca.alumnos.get(i).getUsuario()))){
                JOptionPane.showMessageDialog(null,"Cambie de credenciales...");
                return false;
            }
        }
        Biblioteca.alumnos.add(al);
        Archivos.escribirEnArchivoAlumno();
        return true;
    }
    
    public static boolean RegistrarNuevoLibro(Libro lib){
        //Verificamos el codigo 
        for(int i=0;i<Biblioteca.libros.size();i++){
            if(lib.getCodigoL().equals(Biblioteca.libros.get(i).getCodigoL())){
                JOptionPane.showMessageDialog(null,"Cambie de credenciales...");
                return false;
            }
        }
        Biblioteca.libros.add(lib);
        Archivos.escribirEnArchivoLibro();
        return true;
    }
    
    public static void CambiarAMoroso(Alumno al){
        if(al.isMoroso()){
            al.setMoroso(false);
        }else{
            al.setMoroso(true);
        }         
        //Editamos 
        Biblioteca.editarAlumno(al);
    }
    
    public static void ServicioPrestamo(Alumno al, Libro lib){
        //Actualizar cantidad de libros prestados
        al.setCantidadPrestada(al.getCantidadPrestada()+1);
        al.agregarLibroAlumno(lib.getCodigoL(),lib.getTitulo(),lib.getEditorial(),lib.getGenerolit(),lib.getAutor());
        //Actualizar stock de copias
        lib.setCopiaDisponible(lib.getCopiaDisponible()-1);
        //Guardamos los cambios en el archivo alumno y libro
        Biblioteca.editarAlumno(al);
        Biblioteca.editarLibro(lib);
        //Actualizar estado de solicitud
    }
}
