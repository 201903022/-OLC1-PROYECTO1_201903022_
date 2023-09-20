/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graficas;
/**
 *
 * @author PC
 */

import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
public class Graficar {

    public static void barras(
            String Titulo, 
            String TituloX,
            String TituloY,
            LinkedList<Double> valores1,
            LinkedList <String> ejex1
    )
    {
        //Ingreso de datos
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    
        //dataset.addValue(2.0, "Valor", "EjeX");
        if(valores1.size() == ejex1.size()){
                    for(int i = 0; i < valores1.size(); i++){
                            dataset.addValue(valores1.get(i), "Valor", ejex1.get(i));
                        }
                        // Creación de gráfica
                        JFreeChart grafica = 
                            ChartFactory.createBarChart(
                                Titulo, //TITULO
                                TituloX, TituloY, 
                                dataset, 
                                PlotOrientation.VERTICAL,
                                true, true, true);
                        // Mostrar
                        ChartFrame frame = new ChartFrame("Ejemplo", grafica);
                        frame.pack();
                        frame.setVisible(true);            
         }else {
                    JOptionPane.showMessageDialog(
                null, // Componente padre (null para ventana principal)
                "Error los datos no coinciden con su tama;o en la grafica de barras", // Mensaje de error
                "Error", // Título de la ventana
                JOptionPane.ERROR_MESSAGE // Tipo de mensaje (error)
            );
    }

    }
        public static void linea(
            String Titulo, 
            String TituloX,
            String TituloY,
            double valores[],
            String ejex []
    )
    {
        //Ingreso de datos
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    
        
        for(int i = 0; i < 5; i++){
            dataset.addValue(valores[i], "Valor", ejex[i]);
        }
        
        // Creación de gráfica
        JFreeChart grafica = 
            ChartFactory.createLineChart(
                    Titulo, 
                    TituloX,
                    TituloY, 
                    dataset);
        
        
        // Mostrar
        ChartFrame frame = new ChartFrame("Ejemplo", grafica);
        frame.pack();
        frame.setVisible(true);
    }
            public static void Pie(
            String Titulo, 
            String TituloX,
            String TituloY,
            LinkedList<Double> valores1,
            LinkedList <String> ejex1
    )
    {
        DefaultPieDataset dataset = new DefaultPieDataset( );
              if(valores1.size() == ejex1.size()){
                    for(int i = 0; i < valores1.size(); i++){
                            dataset.setValue(ejex1.get(i),  valores1.get(i));
                        }
                        // Creación de gráfica
                        JFreeChart grafica = 
                        ChartFactory.createPieChart(Titulo, dataset);
                        // Mostrar
                        ChartFrame frame = new ChartFrame("Ejemplo", grafica);
                        frame.pack();
                        frame.setVisible(true);      
         }else {
                    JOptionPane.showMessageDialog(
                null, // Componente padre (null para ventana principal)
                "Error los datos no coinciden con su tama;o en la grafica de Pie", // Mensaje de error
                "Error", // Título de la ventana
                JOptionPane.ERROR_MESSAGE // Tipo de mensaje (error)
            );
    }
        
        

    }
        
}
