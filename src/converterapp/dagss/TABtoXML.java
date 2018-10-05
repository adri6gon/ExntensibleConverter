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
public class TABtoXML implements Transform {

    @Override
    public String getHeader() {
        return "<products>";
    }

    @Override
    public String transform(String line) {
        //System.out.println("line: "+line);
        String[] tokens = line.split("\t");
        System.out.println("token1:"+tokens[0]+" token2: "+tokens[1]);
		if (tokens.length != 2) {
			throw new IllegalArgumentException(
					"the line does not contain 3 tokens");
		}

		return "\n<product>\n\t<name>" + tokens[0] + "</name>\n\t<price>"
				+ tokens[1] + "</price>\n</product>\n";
    }

    @Override
    public String getFooter() {
        return "</products>";
    }
    
}
