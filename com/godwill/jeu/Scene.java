package com.godwill.jeu;

import java.awt.*;
import javax.swing.*;


public class Scene extends JPanel{

    private ImageIcon icoFond;
    private Image imgFond1;
    private ImageIcon icoMario;
    private Image imgMario;
    private int xFond1;
    private int dx;

    //*****CRÉATION DES CONSTRUCTEURS*****//
    public Scene() {
        super();
        this.xFond1 = -50;
        this.dx = 0;

        icoFond = new ImageIcon(getClass().getResource("/image/fondEcran.png"));
        this.imgFond1 = this.icoFond.getImage();
        icoMario = new ImageIcon(getClass().getResource("/image/marioMarcheDroite.png"));
        this.imgMario = this.icoMario.getImage();

        this.setFocusable(true);
        this.requestFocusInWindow();
        this.addKeyListener(new Clavier());


        Thread chronoEcran = new Thread(new Chrono());
        chronoEcran.start();

    }
    //*****LES GETTERS & SETTERS****//
    //Les getters et les setters sont des methodes me permettent dans un premier temps de
    //lire la valeur d'un attribut privé d'un classe avec le getters et
    // ensuite de modifier la valeur avec les setters


    public int getDx() {return dx;}
    public void setDx(int dx) {this.dx = dx;}


    //*****LES METHODES****//

    public void deplacementFond(){this.xFond1 = this.xFond1 - this.dx;}
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics g2 = (Graphics2D)g;

        this.deplacementFond();

        g2.drawImage(this.imgFond1, this.xFond1, 0, null); //pour dessiner l'image de fond
        g2.drawImage(imgMario, 300, 245, null);

    }

}
