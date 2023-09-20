/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author PC
 */
public class dataJson {
    public static String current_FileName ;
    public static HashMap variables = new HashMap();
    public static HashMap  archivos = new HashMap();
    
    
    public static void agregar (){ 
        
        System.out.println("Agrgando variables: " + current_FileName + " variables");
        archivos.put(String.valueOf(current_FileName), variables.clone());
        variables.clear();        
    }
        
        public static void Sho () {
           System.out.println("Variables en el archivo " + current_FileName + ":");

           archivos.forEach((key, value) -> {
            System.out.println("Clave: " + key + ", Valor: " + value);

        // Si el valor es otro HashMap, también muestra sus claves y valores
        if (value instanceof HashMap) {
            HashMap<String, String> innerMap = (HashMap<String, String>) value;
            System.out.println("  -- Valores internos --");
            innerMap.forEach((innerKey, innerValue) -> {
                System.out.println("  Clave interna: " + innerKey + ", Valor interno: " + innerValue);
            });
        }
    });
 
        }
        
        public static Object getVariable(String fileName,String id){ 
            fileName = fileName.toLowerCase();
            System.out.println("A buscar FileName: "+fileName+ " id " + id);
            Object value = null ;
            System.out.println("   archivos: " +archivos);
            System.out.println(" Archivos "+archivos.get(fileName));
                HashMap<String, String> innerMap = (HashMap<String, String>) archivos.get(fileName);
                            System.out.println("  -- Valores internos --");
                                    if (innerMap != null) {
                                        for (Map.Entry<String, String> entry : innerMap.entrySet()) {
                                            Object clave = entry.getKey();
                                            Object valor = entry.getValue();
                                            System.out.println("Clave " +clave + " id " + id);
                                            System.out.println("valor " +valor);
                                            if (clave.toString().equals(id.toString())) {
                                                System.out.println("equals");
                                                value = valor;
                                                System.out.println("Valor  de "+" "+ id + " " +value);
                                                return value;
                                            }
                                        }
                                    } else {
                                        System.out.println("El archivo " + fileName + "' no existe en el HashMap 'archivos'");
                                    }
                return value;
        }

}
