/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author PC
 */
public class Data {
    public static HashMap variables = new HashMap();
    public static void agregarV (String clave,Object valor){ 
        System.out.println("Agregando a data.data.variables: " + clave +  " valor " +valor);
                    variables.put(clave, valor);
    }
    public static Object obtenerV(String clave){ 
        Object valor = null;
        System.out.println("Variables: " + variables);
        System.out.println("Clave "+ clave + " "+ variables.get(clave));
        if (variables.get(clave) != null){
            valor = variables.get(clave);
        }              
        System.out.println("Valor: " + valor);
        return valor;
    }
    public static void showVariables (){ 
        variables.forEach((key, value) -> System.out.println(key + ": " + value + " tipo: "));
    }
    
}
