/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.LinkedList;

/**
 *
 * @author PC
 */
public class DataErrores {
    public static LinkedList<Error> errores = new LinkedList<>();
    
    public static void addErro( Error error){ 
        errores.add(error);
        
    }
    
}
