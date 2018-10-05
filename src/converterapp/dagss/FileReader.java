/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converterapp.dagss;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author adri
 */
public class FileReader implements Reader {

    private File f;
    private Scanner sc;
    
    public FileReader(File f) throws FileNotFoundException {
        this.f = f;
        sc = new Scanner(f);
    }
    
    @Override
    public String read(){
        String toret = "";
        if(sc.hasNext()){
            toret = sc.nextLine();
        }
          return toret;
    }

}
