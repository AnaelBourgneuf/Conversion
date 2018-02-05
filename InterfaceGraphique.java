/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperConversions;

import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Anael
 */
public class InterfaceGraphique extends JFrame {
    public static JComboBox combo = new JComboBox();
    public static JLabel label = new JLabel("Que voulez vous convertir ?");
    public static JPanel container = new JPanel();
    public static JButton bouton = new JButton("Valider");


    public InterfaceGraphique(){
        setTitle("Conversion");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
       
        container.setBackground(Color.white);
        container.setLayout(new BorderLayout());
   
        
        combo.setPreferredSize(new Dimension(100, 20));
        combo.addItem("Heure");
        combo.addItem("Température");
        combo.addItem("Devises");
        
        JPanel top = new JPanel();
        top.add(label);
        top.add(combo);
        container.add(top, BorderLayout.NORTH);
        
        JPanel bot = new JPanel();
        bot.add(bouton);
        container.add(bot, BorderLayout.SOUTH);
        
        setContentPane(container);
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new InterfaceGraphique();
    }

    
}
