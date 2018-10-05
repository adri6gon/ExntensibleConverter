/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converterapp.dagss;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *
 * @author adri
 */

/*public class FileWriter implements Writer{
    private File f;
    private PrintStream out;
    
    public FileWriter(File f) throws FileNotFoundException {
        this.f = f;
        this.out= new PrintStream(new FileOutputStream(this.f));
    }
        
    @Override
    public void write(String line) {
         //System.out.println("Linea: "+line);
        this.out.println(line);
        out.close();
    }
    
    
}*/

public class FileWriter implements Writer {

    public File f;

    public FileWriter(File f) {
        this.f = f;
    }

    @Override
    public void write(String line) {
        PrintStream out = null;
        try {
            out = new PrintStream(f);
        } catch (FileNotFoundException e1) {
            System.err.println("the file " + f.getAbsolutePath()
                    + " does cannot be created: " + e1.getMessage());
            System.exit(1);
        }
        out.println(line);
        out.close();
    }

}

