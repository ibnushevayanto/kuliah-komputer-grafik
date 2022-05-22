/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafikjfreechart;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author traspac
 */
public class GrafikJFreeChart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DefaultCategoryDataset ipk = new DefaultCategoryDataset();
        ipk.setValue(28.40, "Smt 1", "2020");
        ipk.setValue(31.40, "Smt 2", "2020");
        ipk.setValue(29.40, "Smt 3", "2021");
        ipk.setValue(33.40, "Smt 4", "2021");
        ipk.setValue(25.40, "Smt 5", "2022");
        
        JFreeChart KomputerGrafik = ChartFactory.createBarChart(
                "IPK (191011402556 Ibnu Shevayanto)", 
                "Tahun", 
                "Indeks Prestasi Kumulatif", 
                ipk, 
                PlotOrientation.VERTICAL, 
                true, 
                true ,
                true
        );
        
        ChartFrame grafik = new ChartFrame("Komputer Grafik Ibnu Shevayanto 06TPLE023", KomputerGrafik);
        grafik.setSize(800, 600);
        grafik.setVisible(true);
        grafik.setLocationRelativeTo(null);
    }
    
}
