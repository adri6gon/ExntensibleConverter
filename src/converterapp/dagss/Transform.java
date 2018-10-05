/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converterapp.dagss;

/**
 *
 * @author adri
 */
public interface Transform {
    public String getHeader();
    public String transform(String line);
    public String getFooter();    
}
