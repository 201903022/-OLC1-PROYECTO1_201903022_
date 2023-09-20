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
public class Valorees {
         public static String TituloBarras = ""; 
         public static String TituloX = ""; 
         public static String TituloY = ""; 
         public static String TituloPie= "";
         public static LinkedList<String> ejex = new LinkedList<>();
         public static LinkedList<Double> valores = new LinkedList<>();
         public static LinkedList<String> ejexP= new LinkedList<>();
      public static LinkedList<Double> valoresP = new LinkedList<>();
    public static void addEjex (String a ) { 
        System.out.println("Agregando "+a);
        ejex.add(a);

    }
   
    
    
        public static void addValores (String a ) { 
           Double valor = Double.parseDouble(a);
           System.out.println("Agregando "+valor);
         valores.add(valor);
    }
     public static void addEjexP (String a ) { 
        System.out.println("Agregando "+a);
        ejexP.add(a);
    }
    
        public static void addValoresP (String a ) { 
           Double valor = Double.parseDouble(a);
           System.out.println("Agregando "+valor);
         valoresP.add(valor);
    }
        public static void show(){ 
            System.out.println("--------------------------------------------Valorees-----------------------------------------------------------------------");
                    System.out.println("Titulo Barras "+ TituloBarras);
                    System.out.println("TituloX  "+ TituloX);
                    System.out.println("TituloY  "+ TituloY);
                    System.out.println("Lista de ejex:");
                    for (String item : ejex) {
                        
                        System.out.println(item);
                    }

                    System.out.println("\nLista de valores:");
                    for (Double item : valores) {
                        System.out.println(item);
                    }
                    System.out.println("Lista de ejex Pie:");
                    for (String item : ejexP) {
                        System.out.println(item);
                    }

                    System.out.println("\nLista de valores Pie:");
                    for (Double item : valoresP) {
                        System.out.println(item);
                    }
            
        }
    
        public static void graficar () {
            double[] valoresArray = new double[valores.size()];
            for (int i = 0; i < valores.size(); i++) {
                valoresArray[i] = valores.get(i);
            }
            String [] ejexA = new String[ejex.size()];
            for (int i = 0; i < ejex.size(); i++) {
                ejexA[i] = ejex.get(i);
            }           
            
            double[] valoresArrayP = new double[valoresP.size()];
            for (int i = 0; i < valoresP.size(); i++) {
                valoresArrayP[i] = valoresP.get(i);
            }
            String [] ejexAP = new String[ejexP.size()];
            for (int i = 0; i < ejexP.size(); i++) {
                ejexAP[i] = ejexP.get(i);
            }                 
       }
   
}
