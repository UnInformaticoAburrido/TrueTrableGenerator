/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Windows.PreGen;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author dimit
 */
public class InitialFrame extends JFrame {
    public InitialFrame(){
        JFrame initial = new JFrame("Inicial");
        initial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        initial.add(panel);
        initial.setSize(200, 300);
        initial.setVisible(true);
    }
}
