/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converterapp.dagss;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author adri
 */
public class FilesUI {

    public FilesUI() {
    }

    public File getFile(String file) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("Escribe la ruta del archivo de entrada:");
        String name = in.nextLine();
        return new File(name);
    }
}
