/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Analizadores;

/**
 *
 * @author PC
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic heretring[] args) {
        // TODO code applicati
        try{
            String ruta = "src/Analizadores/";
            String opcFlex[ ] = {ruta + "lexico.jflex","-d",ruta};
            jflex.Main.generate(opcFlex);
            System.out.println("Lexico Listo");
            String opcCUP[ ] = {"-destdir",ruta,"-parser","Parser",ruta+"sintactico.cup"};
            System.out.println("Cup: ");
            java_cup.Main.main(opcCUP);
        } catch (Exception e){
            System.out.println("No se ha podido generar los analizadores");
            e.printStackTrace();
        }      
    }
    
}
