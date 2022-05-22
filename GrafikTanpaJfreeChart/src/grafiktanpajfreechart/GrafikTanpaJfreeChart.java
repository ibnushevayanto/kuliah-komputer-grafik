/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafiktanpajfreechart;

/**
 *
 * @author traspac
 */
public class GrafikTanpaJfreeChart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        PanelDoughnoutChart panel = new PanelDoughnoutChart();
        panel.setBounds(0, 0, 600, 400);
        frame.add(panel);
        frame.setVisible(true);
    }
    
}
