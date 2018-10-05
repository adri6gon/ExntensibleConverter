/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converterapp.dagss;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author adri
 */
public class ConverterAPPDAGSS {

    /**
     * @args
     * 1) InputFile
     * 2) OutPutFile
     * 3) Method
     */
    
    public static void main(String[] args) throws FileNotFoundException {
        //Leemos ruta de inputFile, outputFile y el método de conversión
        //String input = args[0];
        String input = "./pruebaConverter.txt";
        String output = "./salidaconverter.xml";
        //String output = args[1];
        //String method = args[2];
        //Obtenemos archivo de entrada
        //FilesUI file = new FilesUI();
        //File inputFile = file.getFile(input);
        //Instanciamos lectura
        //Reader fileReader = new FileReader(inputFile);
        Reader consoleReader = new ConsoleReader();
        //Instanciamos escritura
        File out = new File(output);
        //Writer fileWriter = new FileWriter(out);
        Writer consoleWriter = new ConsoleWriter();
        //Instanciamos conversion
        Transform conv = new TABtoXML();
        Transform convJson = new TABtoJSon();
        //Instanciamos clase conversion y lanzamos la conversión
        Converter conversion = new Converter(consoleReader,consoleWriter,convJson);
        conversion.convert();
        
        
    }
    
}
