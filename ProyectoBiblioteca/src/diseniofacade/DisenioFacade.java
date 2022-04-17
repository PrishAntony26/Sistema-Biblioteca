/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diseniofacade;

import java.util.Scanner;
import GUI.*;
/**
 *
 * @author ok
 */
public class DisenioFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc;
        Biblioteca.agregarAdmin();
        Scanner entrada = new Scanner(System.in);
        new Login().setVisible(true);
    }
    
}
