/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Traductor;

/**
 *
 * @author PC
 */

import java.util.HashMap;
import java.util.LinkedList;

public class Traduc {
        public static HashMap variables = new HashMap();
        public static int contador = 0; 
        public static LinkedList<String> traduccion = new LinkedList<>();
        
    public static LinkedList<String>  tabulaciones(LinkedList<String> lista){
        String tabs = "";
        for (int i = 0; i < contador; i++) {
            tabs = "\t"+tabs;
        }
        
        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, tabs+lista.get(i));
        }
        
        return lista;
    }      
       public static String mostrar (){
        System.out.println("Contenido de la LinkedList:");
        String texto = "";
        for (String elemento : traduccion) {
            texto += elemento + "\n";
            //System.out.println(texto);
        }
        
           return texto;
    }     
        public static LinkedList<String>  elif (LinkedList<String> lista){
                if (!lista.isEmpty()) {
                    String primerElemento = lista.get(0);
                    String nuevoPrimerElemento = primerElemento.replaceFirst("if", "elif ");
                    lista.set(0, nuevoPrimerElemento);
                }        
        return lista;
    }    
}
