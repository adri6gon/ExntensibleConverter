/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converterapp.dagss;

import converterapp.dagss.Writer;

/**
 *
 * @author adri
 */
public class ConsoleWriter implements Writer {

    @Override
    public void write(String line) {
        System.out.println(line);
    }
    
}
