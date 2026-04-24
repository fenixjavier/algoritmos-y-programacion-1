/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Window;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author UNSAdA
 */
public class Main {
    // Constructor
    public Main() {
        JFrame frame = new JFrame("Window");
        JButton button = new JButton("Botón");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
