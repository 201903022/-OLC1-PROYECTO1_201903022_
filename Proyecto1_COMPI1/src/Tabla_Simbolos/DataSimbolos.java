/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tabla_Simbolos;

import java.util.LinkedList;

/**
 *
 * @author PC
 */
public class DataSimbolos {
    public static LinkedList<Simbolo> Simbolos = new LinkedList<>();
    
    public static void addSimbolo(int fila, int columna, String token, String lexema) {
                System.out.println("Fila: " + fila);
                System.out.println("Columna: " + columna);
                System.out.println("Token: " + token);
                System.out.println("Lexema: " + lexema);
                System.out.println("--------------------");         
        Simbolo simbolo = new Simbolo(fila, columna, token, lexema);
        Simbolos.add(simbolo);
    }
        public static void show() {
           System.out.println("Símbolos:");

            for (Simbolo simbolo : Simbolos) {
                System.out.println("Fila: " + simbolo.getFila());
                System.out.println("Columna: " + simbolo.getColumna());
                System.out.println("Token: " + simbolo.getToken());
                System.out.println("Lexema: " + simbolo.getLexema());
                System.out.println("--------------------");
        }
            
           
    }
        
        public static String table (){ 
          String codigo = "<!doctype html>\n"
                + "<html lang=\"en\">\n"
                + "  <head>\n"
                + "    <!-- Required meta tags -->\n"
                + "    <meta charset=\"utf-8\">\n"
                + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n"
                + "\n"
                + "    <!-- Bootstrap CSS -->\n"
                + "    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n"
                + "\n"
                + "    <title>Hello, world!</title>\n"
                + "  </head>\n"
                + "  <body>\n"
                + "<table class=\"table table-hover table-dark\">\n"
                + "  <thead>\n"
                + "    <tr>\n"
                + "      <th scope=\"col\">Token</th>\n"
                + "      <th scope=\"col\">Lexema</th>\n"
                + "      <th scope=\"col\">LÃ­nea</th>\n"
                + "      <th scope=\"col\">Columna</th>\n"
                + "    </tr>\n"
                + "  </thead>\n"
                + "  <tbody>\n"  ;
                              for (Simbolo simbolo : Simbolos) {
                 codigo  +=  "<tr><td>\""+simbolo.getToken()+"\"</td><td>\""+simbolo.getLexema()+"\"</td><td>"+(simbolo.getFila()) +"</td><td>"+(simbolo.getColumna())+"</td></tr>\n";;
        }
              codigo  += "</tbody>\n"
                + "</table>\n"
                + "    <!-- Optional JavaScript -->\n"
                + "    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n"
                + "    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n"
                + "    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n"
                + "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n"
                + "  </body>\n"
                + "</html>";
            
            return codigo;
            
        }
}
