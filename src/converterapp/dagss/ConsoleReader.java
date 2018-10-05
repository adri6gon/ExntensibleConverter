/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converterapp.dagss;

import java.util.Scanner;

/**
 *
 * @author adri
 */
public class ConsoleReader implements Reader{
    //Para "parar" la entrada de datos por consola dejar linea vacia
    @Override
    public String read() {
        String toret = "";
            System.out.println("Escribe una linea: ");
            Scanner sc = new Scanner(System.in);
           toret = sc.nextLine();
          

        return toret;
    }    
} 
