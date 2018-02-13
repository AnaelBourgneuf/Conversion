package SuperConversions;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.json.JSONException;




public class InterfaceGraphique extends JFrame {
    public static JComboBox comboaccueil = new JComboBox();
    public static JComboBox comboentreetemp = new JComboBox();
    public static JComboBox combosortietemp = new JComboBox();
    public static JComboBox comboentreedev = new JComboBox();
    public static JComboBox combosortiedev = new JComboBox();
    public static JComboBox comboentreedist = new JComboBox();
    public static JComboBox combosortiedist = new JComboBox();
    public static JComboBox comboentreevol = new JComboBox();
    public static JComboBox combosortievol = new JComboBox();
    public static JLabel labelaccueil = new JLabel("Que voulez vous convertir ?");
    public static JPanel container = new JPanel();
    public static JPanel temp = new JPanel();
    public static JPanel dev = new JPanel();
    public static JPanel dist = new JPanel();
    public static JPanel vol = new JPanel();
    public static JButton bouton = new JButton("Valider");
    public static JButton retourTemp = new JButton ("Retour");
    public static JButton retourDist = new JButton ("Retour");
    public static JButton retourVol = new JButton ("Retour");
    public static JButton retourDev = new JButton ("Retour");
    public static JButton validtemp =new JButton("Valider");
    public static JButton validdev =new JButton("Valider");
    public static JButton validdist =new JButton("Valider");
    public static JButton validvol =new JButton("Valider");
    JTextField textentreetemp = new JTextField(20);
    JTextField textsortietemp = new JTextField(85);
    JTextField textentreedev = new JTextField(20);
    JTextField textsortiedev = new JTextField(85);
    JTextField textentreedist = new JTextField(20);
    JTextField textsortiedist = new JTextField(85);
    JTextField textentreevol = new JTextField(20);
    JTextField textsortievol = new JTextField(85);
    
    
    
    public void setMainContainer() throws IOException{
        setTitle("Conversion");
        setSize(800,600);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        container.setBackground(Color.white);
        container.setLayout(new BorderLayout());
        comboaccueil.setPreferredSize(new Dimension(100, 20));
        comboaccueil.addItem("Températures");
        comboaccueil.addItem("Distances");
        comboaccueil.addItem("Volumes");
        comboaccueil.addItem("Devises");
        //Top de la 1ere page
        JPanel top = new JPanel();
        top.add(labelaccueil);
        top.add(comboaccueil);
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
    }
    
    public void setTempContainer() throws IOException{
        //JPanel des Temperatures
        //preparation image de fond
        ImageIcon icoTemps = new ImageIcon(ImageIO.read(this.getClass().getResource("temps.png")));
        JLabel temperature = new JLabel(icoTemps);
        //ajout des choix dans les combobox definies au debut du programme
        comboentreetemp.addItem("Celsius");
        comboentreetemp.addItem("Fahrenheit");
        comboentreetemp.addItem("Kelvin");
        comboentreetemp.setSize(new Dimension(0,0));
        combosortietemp.addItem("Fahrenheit");
        combosortietemp.addItem("Celsius");
        combosortietemp.addItem("Kelvin");
        // ???
        temp.setLayout(new BoxLayout(temp, BoxLayout.Y_AXIS));
        //preparation container pour le bouton de retour à l'accueil
        JPanel butRetour = new JPanel();
        //ajout du bouton de retour en haut de la fenetre
        butRetour.add(retourTemp, BorderLayout.NORTH);
        temp.add(Box.createVerticalStrut(20));
        temp.add(butRetour);
        temperature.setSize(100,100);
        JPanel panetemps = new JPanel();
        JLabel lab1 = new JLabel("unité entrée");
        JLabel lab2 = new JLabel("unitée sortie");
        temp.add(lab1);
        temp.add(comboentreetemp);
        temp.add(lab2);
        temp.add(combosortietemp);
        panetemps.add(temperature, BorderLayout.CENTER);
        temp.add(panetemps);
        JLabel labvalueentree = new JLabel("entrée");
        temp.add(labvalueentree);
        temp.add(textentreetemp);
        temp.add(validtemp);
       
        JLabel labvaluesortie = new JLabel("Résultat");
        temp.add(labvaluesortie);
        temp.add(textsortietemp);
        
        validtemp.addActionListener(((ActionEvent ae) -> {try {
                calculTemp();
            } catch (Throwable ex) {
                Logger.getLogger(InterfaceGraphique.class.getName()).log(Level.SEVERE, null, ex);
            }
        }));
        validate();
    }
    
    public void setDevContainer() throws IOException{
        //JPanel des Devises
        //preparation image de fond
        ImageIcon icoDev = new ImageIcon(ImageIO.read(this.getClass().getResource("bourse.png")));
        JLabel devise = new JLabel(icoDev);
        //ajout des choix dans les combobox definies au debut du programme
        comboentreedev.addItem("Euro");
        comboentreedev.addItem("Dollard des Etats Unis");
        comboentreedev.addItem("Livre Britanique");
        comboentreedev.addItem("Roupie Indienne");
        comboentreedev.addItem("Dollard Australien");
        comboentreedev.addItem("Dollard Canadien");
        comboentreedev.addItem("Dollard de Singapour");
        comboentreedev.addItem("Yen Japonais");
        comboentreedev.addItem("Yuan ou renminbi chinois");
        comboentreedev.setSize(new Dimension(0,0));
        combosortiedev.addItem("Dollard des Etats Unis");
        combosortiedev.addItem("Euro");
        combosortiedev.addItem("Livre Britanique");
        combosortiedev.addItem("Roupie Indienne");
        combosortiedev.addItem("Dollard Australien");
        combosortiedev.addItem("Dollard Canadien");
        combosortiedev.addItem("Dollard de Singapour");
        combosortiedev.addItem("Yen Japonais");
        combosortiedev.addItem("Yuan ou renminbi chinois");
        // ???
        dev.setLayout(new BoxLayout(dev, BoxLayout.Y_AXIS));
        //preparation container pour le bouton de retour à l'accueil
        JPanel butRetour = new JPanel();
        //ajout du bouton de retour en haut de la fenetre
        butRetour.add(retourDev, BorderLayout.NORTH);
        dev.add(Box.createVerticalStrut(20));
        dev.add(butRetour);
        devise.setSize(100,100);
        JPanel panedev = new JPanel();
        JLabel labunitentree = new JLabel("unité entrée");
        JLabel labunitsortie = new JLabel("unitée sortie");
        dev.add(labunitentree);
        dev.add(comboentreedev);
        dev.add(labunitsortie);
        dev.add(combosortiedev);
        panedev.add(devise, BorderLayout.CENTER);
        dev.add(panedev);
        JLabel labvalueentree = new JLabel("entrée");
        dev.add(labvalueentree);
        dev.add(textentreedev);
        dev.add(validdev);
       
        JLabel labvaluesortie = new JLabel("Résultat");
        dev.add(labvaluesortie);
        dev.add(textsortiedev);
        
        validdev.addActionListener(((ActionEvent ae) -> {try {
                calculDev();
            } catch (Throwable ex) {
                Logger.getLogger(InterfaceGraphique.class.getName()).log(Level.SEVERE, null, ex);
            }
        }));
        validate();
    }
    
    public void setDistContainer() throws IOException{
        //JPanel des Devises
        //preparation image de fond
        ImageIcon icoDist = new ImageIcon(ImageIO.read(this.getClass().getResource("metre.png")));
        JLabel distance = new JLabel(icoDist);
        //ajout des choix dans les combobox definies au debut du programme
        comboentreedist.addItem("millimètre(s)");
        comboentreedist.addItem("centimètre(s)");
        comboentreedist.addItem("décimètre(s)");
        comboentreedist.addItem("mètre(s)");
        comboentreedist.addItem("kilomètre(s)");
        comboentreedist.addItem("foot(feet)");
        comboentreedist.addItem("inch(es)");
        comboentreedist.addItem("mile(s)");
        comboentreedist.addItem("yard(s)");
        comboentreedist.addItem("light year(s)");
        comboentreedist.addItem("light second(s)");
        comboentreedist.setSize(new Dimension(0,0));
        combosortiedist.addItem("foot(feet)");
        combosortiedist.addItem("inch(es)");
        combosortiedist.addItem("mile(s)");
        combosortiedist.addItem("yard(s)");
        combosortiedist.addItem("millimètre(s)");
        combosortiedist.addItem("centimètre(s)");
        combosortiedist.addItem("décimètre(s)");
        combosortiedist.addItem("mètre(s)");
        combosortiedist.addItem("kilomètre(s)");
        combosortiedist.addItem("light year");
        combosortiedist.addItem("light second");
        // ???
        dist.setLayout(new BoxLayout(dist, BoxLayout.Y_AXIS));
        //preparation container pour le bouton de retour à l'accueil
        JPanel butRetour = new JPanel();
        //ajout du bouton de retour en haut de la fenetre
        butRetour.add(retourDist, BorderLayout.NORTH);
        dist.add(Box.createVerticalStrut(20));
        dist.add(butRetour);
        distance.setSize(100,100);
        JPanel panedist = new JPanel();
        JLabel labunitentree = new JLabel("unité entrée");
        JLabel labunitsortie = new JLabel("unitée sortie");
        dist.add(labunitentree);
        dist.add(comboentreedist);
        dist.add(labunitsortie);
        dist.add(combosortiedist);
        panedist.add(distance, BorderLayout.CENTER);
        dist.add(panedist);
        JLabel labvalueentree = new JLabel("entrée");
        dist.add(labvalueentree);
        dist.add(textentreedist);
        dist.add(validdist);
       
        JLabel labvaluesortie = new JLabel("Résultat");
        dist.add(labvaluesortie);
        dist.add(textsortiedist);
        
        validdist.addActionListener(((ActionEvent ae) -> {try {
                calculDist();
            } catch (Throwable ex) {
                Logger.getLogger(InterfaceGraphique.class.getName()).log(Level.SEVERE, null, ex);
            }
        }));
        validate();
    }
    
    public void setVolContainer() throws IOException{
        //JPanel des Devises
        //preparation image de fond
        ImageIcon icoVol = new ImageIcon(ImageIO.read(this.getClass().getResource("bol.png")));
        JLabel volume = new JLabel(icoVol);
        //ajout des choix dans les combobox definies au debut du programme
        comboentreevol.addItem("millilitre(s)");
        comboentreevol.addItem("litre(s)");
        comboentreevol.addItem("m³");
        comboentreevol.addItem("foot³(feet³)");
        comboentreevol.addItem("inch(s)³");
        comboentreevol.addItem("mile(s)³");
        comboentreevol.addItem("yard(s)³");
        comboentreevol.addItem("cup(s)");
        comboentreevol.addItem("imperial gallon(s)");
        comboentreevol.addItem("us gallon(s)");
        comboentreevol.setSize(new Dimension(0,0));
        combosortievol.addItem("m³");
        combosortievol.addItem("millilitre(s)");
        combosortievol.addItem("litre(s)");
        combosortievol.addItem("foot³(feet³)");
        combosortievol.addItem("inch(s)³");
        combosortievol.addItem("mile(s)³");
        combosortievol.addItem("yard(s)³");
        combosortievol.addItem("cup(s)");
        combosortievol.addItem("imperial gallon(s)");
        combosortievol.addItem("us gallon(s)");
        // ???
        vol.setLayout(new BoxLayout(vol, BoxLayout.Y_AXIS));
        //preparation container pour le bouton de retour à l'accueil
        JPanel butRetour = new JPanel();
        //ajout du bouton de retour en haut de la fenetre
        butRetour.add(retourVol, BorderLayout.NORTH);
        vol.add(Box.createVerticalStrut(20));
        vol.add(butRetour);
        volume.setSize(100,100);
        JPanel panevol = new JPanel();
        JLabel labunitentree = new JLabel("unité entrée");
        JLabel labunitsortie = new JLabel("unitée sortie");
        vol.add(labunitentree);
        vol.add(comboentreevol);
        vol.add(labunitsortie);
        vol.add(combosortievol);
        panevol.add(volume, BorderLayout.CENTER);
        vol.add(panevol);
        JLabel labvalueentree = new JLabel("entrée");
        vol.add(labvalueentree);
        vol.add(textentreevol);
        vol.add(validvol);
       
        JLabel labvaluesortie = new JLabel("Résultat");
        vol.add(labvaluesortie);
        vol.add(textsortievol);
        
        validvol.addActionListener(((ActionEvent ae) -> {try {
                calculVol();
            } catch (Throwable ex) {
                Logger.getLogger(InterfaceGraphique.class.getName()).log(Level.SEVERE, null, ex);
            }
        }));
        validate();
    }
    
    public InterfaceGraphique() throws IOException{
        setMainContainer();
        setTempContainer();
        setDevContainer();
        setVolContainer();
        setDistContainer();
        bouton.addActionListener(((ActionEvent ae) -> {try {
                validation();
            } catch (Throwable ex) {
                Logger.getLogger(InterfaceGraphique.class.getName()).log(Level.SEVERE, null, ex);
            }
        }));
        retourTemp.addActionListener(((ActionEvent ae) -> {try {
                ActionRetour();
            } catch (Throwable ex) {
                Logger.getLogger(InterfaceGraphique.class.getName()).log(Level.SEVERE, null, ex);
            }
        }));
        retourDev.addActionListener(((ActionEvent ae) -> {try {
                ActionRetour();
            } catch (Throwable ex) {
                Logger.getLogger(InterfaceGraphique.class.getName()).log(Level.SEVERE, null, ex);
            }
        }));
        retourVol.addActionListener(((ActionEvent ae) -> {try {
                ActionRetour();
            } catch (Throwable ex) {
                Logger.getLogger(InterfaceGraphique.class.getName()).log(Level.SEVERE, null, ex);
            }
        }));
        retourDist.addActionListener(((ActionEvent ae) -> {try {
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
        if (comboaccueil.getSelectedItem().toString().equals("Températures")){
            this.remove(container);
            this.setContentPane(temp);
            System.out.println("valide temperatures");
            setVisible(true);
            this.repaint();
        }
        else if (comboaccueil.getSelectedItem().toString().equals("Devises")){
            this.remove(container);
            this.setContentPane(dev);
            System.out.println("valide devises");
            setVisible(true);
            this.repaint();
        }
        else if (comboaccueil.getSelectedItem().toString().equals("Distances")){
            this.remove(container);
            this.setContentPane(dist);
            System.out.println("valide distances");
            setVisible(true);
            this.repaint();
        }
        else if (comboaccueil.getSelectedItem().toString().equals("Volumes")){
            this.remove(container);
            this.setContentPane(vol);
            System.out.println("valide volumes");
            setVisible(true);
            this.repaint();
        }
    }
    
    private void ActionRetour() {
        this.setContentPane(container);
        this.revalidate();
        this.repaint();
        
    }

    private void calculTemp() {
        String from = comboentreetemp.getSelectedItem().toString();
        String to = combosortietemp.getSelectedItem().toString();
        String value =  textentreetemp.getText();
        float fval = Float.parseFloat(value);
        double newvalue = Temperature.convertTemp(from, to, fval);
        System.out.println(fval+" -> "+newvalue);
        textsortietemp.setText(""+newvalue+"");
    } 
    
    private void calculDev() {
        String from = comboentreedev.getSelectedItem().toString();
        String to = combosortiedev.getSelectedItem().toString();
        String value =  textentreedev.getText();
        float fval = Float.parseFloat(value);
        double newvalue = 0;
        try {
            newvalue = fval*Devise.loadRate(from, to);
        } catch (IOException | ParseException | JSONException ex) {
            Logger.getLogger(InterfaceGraphique.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(fval+" -> "+newvalue);
        textsortiedev.setText(""+newvalue+"");
    } 
    
    private void calculDist() {
        String from = comboentreedist.getSelectedItem().toString();
        String to = combosortiedist.getSelectedItem().toString();
        String value =  textentreedist.getText();
        float fval = Float.parseFloat(value);
        double newvalue = 0;
        newvalue = fval*Longueur.ratioDist(from, to);
        System.out.println(fval+" -> "+newvalue);
        textsortiedist.setText(""+newvalue+"");
    } 
    
    private void calculVol() {
        String from = comboentreevol.getSelectedItem().toString();
        String to = combosortievol.getSelectedItem().toString();
        String value =  textentreevol.getText();
        float fval = Float.parseFloat(value);
        double newvalue = 0;
        newvalue = fval*Volume.ratioVol(from, to);
        System.out.println(fval+" -> "+newvalue);
        textsortievol.setText(""+newvalue+"");
    } 
}
