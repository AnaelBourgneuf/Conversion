package SuperConversions;

import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.Panel;
import static java.awt.SystemColor.text;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;




public class InterfaceGraphique extends JFrame {
    public static JComboBox combo = new JComboBox();
    public static JComboBox combo2 = new JComboBox();
    public static JComboBox combo3 = new JComboBox();
    public static JLabel label = new JLabel("Que voulez vous convertir ?");
    public static JPanel container = new JPanel();
    public static JPanel temps = new JPanel();
    public static JPanel heures = new JPanel();
    public static JPanel devises = new JPanel();
    public static JButton bouton = new JButton("Valider");
    public static JButton retour = new JButton ("Retour");
    public static JButton validtemp =new JButton("Valider");
    JTextField textentree = new JTextField(20);
    JTextField textsortie = new JTextField(85);
    
    
    
    
    
    public InterfaceGraphique() throws IOException{
        setTitle("Conversion");
        setSize(800,600);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        container.setBackground(Color.white);
        container.setLayout(new BorderLayout());
        combo.setPreferredSize(new Dimension(100, 20));
        combo.addItem("Heure");
        combo.addItem("Température");
        combo.addItem("Devises");
        //Top de la 1ere page
        JPanel top = new JPanel();
        top.add(label);
        top.add(combo);
        container.add(top, BorderLayout.NORTH);
        //bot de la 1ere page
        JPanel bot = new JPanel();
        bot.add(bouton);
        container.add(bot, BorderLayout.SOUTH);
        //image au centre 1ere page
        ImageIcon icoFond = new ImageIcon(ImageIO.read(this.getClass().getResource("convert.jpg"))); 
        JLabel center = new JLabel(icoFond);
        center.setSize(100,100);
        container.add(center, BorderLayout.CENTER);
        setContentPane(container);
        validate();
        setVisible(true);
        repaint();
        System.out.println("test");
        
        
        
        //JPanel des Temperatures
        ImageIcon icoTemps = new ImageIcon(ImageIO.read(this.getClass().getResource("temps.png")));
        JLabel temperature = new JLabel(icoTemps);
        JPanel butRetour = new JPanel();
        combo2.addItem("Fahrenheit");
        combo2.addItem("Celsius");
        combo2.addItem("Kelvin");
        combo2.setSize(new Dimension(0,0));
        combo3.addItem("Fahrenheit");
        combo3.addItem("Celsius");
        combo3.addItem("Kelvin");
        temps.setLayout(new BoxLayout(temps, BoxLayout.Y_AXIS));
        butRetour.add(retour, BorderLayout.NORTH);
        temps.add(Box.createVerticalStrut(20));
        temps.add(butRetour);
        temperature.setSize(100,100);
        JPanel panetemps = new JPanel();
        JLabel lab1 = new JLabel("unité entrée");
        JLabel lab2 = new JLabel("unitée sortie");
        temps.add(lab1);
        temps.add(combo2);
        temps.add(lab2);
        temps.add(combo3);
        panetemps.add(temperature, BorderLayout.CENTER);
        temps.add(panetemps);
        JLabel lab3 = new JLabel("entrée");
        temps.add(textentree);
        temps.add(validtemp);
       
        JLabel lab4 = new JLabel("Résultat");
        temps.add(textsortie);
        
        validtemp.addActionListener(((ActionEvent ae) -> {try {
            calculTemp();
        } catch (Throwable ex) {
            Logger.getLogger(InterfaceGraphique.class.getName()).log(Level.SEVERE, null, ex);
        }
}));
        
        //setContentPane(temps);
        validate();
        //
        //repaint();
        
        
        
        bouton.addActionListener(((ActionEvent ae) -> {try {
            validation();
        } catch (Throwable ex) {
            Logger.getLogger(InterfaceGraphique.class.getName()).log(Level.SEVERE, null, ex);
        }
}));
        retour.addActionListener(((ActionEvent ae) -> {try {
            ActionRetour();
        } catch (Throwable ex) {
            Logger.getLogger(InterfaceGraphique.class.getName()).log(Level.SEVERE, null, ex);
        }
}));
    }
    
    
    
    public static void main(String[] args) throws IOException {
        new InterfaceGraphique();
    }

    private void validation() throws IOException, Throwable{
        if (combo.getSelectedItem().toString().equals("Température")){
            this.remove(container);
            this.setContentPane(temps);
            System.out.println("click valider");
            setVisible(true);
            this.repaint();
        }
        //new InterfaceGraphique();
        
         
    }
    
    private void ActionRetour() {
        this.setContentPane(container);
        this.revalidate();
        this.repaint();
        
    }

    private void calculTemp() {
        String from = combo2.getSelectedItem().toString();
        String to = combo3.getSelectedItem().toString();
        String value =  textentree.getText();
        float fval = (float) value.;
        float newvalue = fval*Temperature.ratioTemp(from, to);
    }
    
    
}
