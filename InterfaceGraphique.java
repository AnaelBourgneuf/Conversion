package SuperConversions;

import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class InterfaceGraphique extends JFrame {
    public static JComboBox combo = new JComboBox();
    public static JLabel label = new JLabel("Que voulez vous convertir ?");
    public static JPanel container = new JPanel();
    public static JButton bouton = new JButton("Valider");
    public static JPanel temps = new JPanel();
    
    
    
    
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
        
        JPanel top = new JPanel();
        top.add(label);
        top.add(combo);
        container.add(top, BorderLayout.NORTH);
        
        JPanel bot = new JPanel();
        bot.add(bouton);
        container.add(bot, BorderLayout.SOUTH);
        
       
        
        ImageIcon icoFond = new ImageIcon(ImageIO.read(this.getClass().getResource("convert.jpg"))); 
        JLabel center = new JLabel(icoFond);
        center.setSize(100,100);
        container.add(center, BorderLayout.CENTER);
        setContentPane(container);
        validate();
        setVisible(true);
        repaint();
        
        bouton.addActionListener(((ActionEvent ae) -> {try {
            validation();
            } catch (IOException ex) {
                Logger.getLogger(InterfaceGraphique.class.getName()).log(Level.SEVERE, null, ex);
            }
}));
                 
        
    }
    
    
    
    
    public static void main(String[] args) throws IOException {
        new InterfaceGraphique();
    }

    private static void validation() throws IOException{
        //jFrame.setcontentpane()
        //JLabel icoTemps = new JLabel(ImageIO.read(this.getClass().getResource("temps.png")));
        //temps.add(icoTemps);
        //System.out.println("click valider");
         
    }
    
    
    
}
