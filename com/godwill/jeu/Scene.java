package com.godwill.jeu;

import java.awt.*;
import javax.swing.*;


public class Scene extends JPanel{

    private ImageIcon icoFond;
    private Image imgFond1;
    private Image imgFond2;


    private ImageIcon icoChateau1;
    private Image imgChateau1;
    private ImageIcon icoDepart;
    private Image imgDepart;


    private int xFond1;
    private int xFond2;
    private int dx;
    private int xPosition;

    public Mario mario;

    //*****CRÉATION DES CONSTRUCTEURS*****//
    public Scene() {

        super();

        this.xFond1 = -50;
        this.xFond2 = 750; // resutlat du calcul de la largeur de l'Image - de xFond1
        this.dx = 0;
        this.xPosition = -1;

        icoFond = new ImageIcon(getClass().getResource("/image/fondEcran.png"));
        this.imgFond1 = this.icoFond.getImage();
        this.imgFond2 = this.icoFond.getImage();

        this.icoChateau1 = new ImageIcon(getClass().getResource("/image/chateau1.png"));
        this.imgChateau1 = this.icoChateau1.getImage();
        this.icoDepart = new ImageIcon(getClass().getResource("/image/depart.png"));
        this.imgDepart = this.icoDepart.getImage();

        mario = new Mario(300, 245);

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
    public int getxPosition() {return xPosition;}


    public void setDx(int dx) {this.dx = dx;}
    public void setxPosition(int xPosition) {this.xPosition = xPosition;}
    public void setxFond1(int xFond1) {this.xFond1 = xFond1;}
    public void setxFond2(int xFond2) {this.xFond2 = xFond2;}
    //*****LES METHODES****//

    public void deplacementFond(){

        if(this.xPosition >= 0){
            this.xPosition = this.xPosition + this.dx;
            this.xFond1 = this.xFond1 - this.dx;
            this.xFond2 = this.xFond2 - this.dx;
        }

        if(this.xFond1 == -800){this.xFond1 = 800;}
        else if (this.xFond2 == -800){this.xFond2 = 800;}
        else if (this.xFond1 == 800){this.xFond1 = -800;}
        else if (this.xFond2 == 800){this.xFond2 = -800;}

    }
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics g2 = (Graphics2D)g;

        this.deplacementFond();

        g2.drawImage(this.imgFond1, this.xFond1, 0, null);//pour dessiner l'image de fond
        g2.drawImage(this.imgFond2, this.xFond2, 0, null);
        g2.drawImage(this.mario.getImgMario(), 300, 245, null);
        g2.drawImage(imgChateau1, 10 - this.xPosition, 95, null);
        g2.drawImage(imgDepart, 220 - this.xPosition, 234, null);
    }

}
