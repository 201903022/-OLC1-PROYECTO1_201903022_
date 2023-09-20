/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class ErrorTable {
   public static  List<Error> listaDeErrores = new ArrayList<>();
    
    public static void addError(Error error){ 
        
        listaDeErrores.add(error);
    }
    
    public static void ShowErrores () { 
             for (Error error : listaDeErrores) {
            System.out.println("------");
        }
    }
}
