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
public class Converter {

    private Reader r;
    private Writer w;
    private Transform t;

    public Converter(Reader r, Writer w, Transform t) {
        this.r = r;
        this.w = w;
        this.t = t;
    }

    public void convert() {
        String toWrite = "";
        toWrite += t.getHeader();
        String line = r.read();
        while (!line.equals("")) {
           toWrite +=t.transform(line);
            line = r.read();
        }
        toWrite +=t.getFooter();
        w.write(toWrite);
    }
}
