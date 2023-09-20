/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AnalizadoresJson;

/**
 *
 * @author PC
 */
public class Runner2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            String ruta = "src/AnalizadoresJson/";
            String opcFlex[ ] = {ruta + "LexicoJson.jflex","-d",ruta};
            jflex.Main.generate(opcFlex);
            System.out.println("Lexico Listo");
            String opcCUP[ ] = {"-destdir",ruta,"-parser","ParserJson",ruta+"SintacticoJson.cup"};
            System.out.println("Cup: ");
            java_cup.Main.main(opcCUP);
        } catch (Exception e){
            System.out.println("No se ha podido generar los analizadores");
            e.printStackTrace();
        }    
    }
    
}
