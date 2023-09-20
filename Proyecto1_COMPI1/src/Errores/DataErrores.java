/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Errores;

import java.util.LinkedList;

/**
 *
 * @author PC
 */
public class DataErrores {
        public static LinkedList<Error> errores = new LinkedList<>();
    
public static void addError(String tipo, int fila, int columna, String valor) {
    Error error = new Error(tipo, fila, columna, valor);
    errores.add(error);
}
    
    public static void showErrores() {
        System.out.println("Lista de Errores:");
        for (Error error : errores) {
            System.out.println("Tipo: " + error.getTipo());
            System.out.println("Fila: " + error.getFila());
            System.out.println("Columna: " + error.getColumna());
            System.out.println("Valor: " + error.getValor());
            System.out.println("-------------------------");
        }
    }
    
    
    
}
