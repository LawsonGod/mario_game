package com.godwill.jeu;

import javax.swing.*;
import java.awt.*;

public class Mario extends Personnage {

    //****VARIABLES****//
    private Image imgMario;
    private ImageIcon icoMario;
    private boolean saut; // cette variable si mario saute
    private int compteurSaut; // pour indiquer la durée et la hauteur du saut

    //*****CONSTRUCTEUR****//
    public Mario(int x, int y) {
        super(x, y, 28, 50);
        this.icoMario = new ImageIcon(getClass().getResource("/image/marioMarcheDroite.png"));
        this.imgMario = this.icoMario.getImage();
        this.saut = false;
        this.compteurSaut = 0;

    }

    //*****GETTERS*****//
    public Image getImgMario() {
        return imgMario;
    }

    public boolean isSaut() {
        return saut;
    }


    //*******SETTERS******//
    public void setSaut(boolean saut) {
        this.saut = saut;
    }

    //*******METHODES******//
    public Image saute() {

        ImageIcon ico;
        Image img;
        String str;

        this.compteurSaut++;

        //Montée du saut
        if (this.compteurSaut <= 35) {
            if (this.getY() > Main.scene.getHautPlafond()) {
                this.setY(this.getY() - 4);
            } else {
                this.compteurSaut = 36;
            }
            if (this.isVersDroite() == true) {
                str = "/image/marioSautDroite.png";
            } else {
                str = "/image/marioSautGauche.png";
            }
        }
        //Retombée du saut
        else if (this.getY() + this.getHauteur() < Main.scene.getySol()) {
            this.setY(this.getY() + 1);
            if (this.isVersDroite() == true) {
                str = "/image/marioSautDroite.png";
            } else {
                str = "/image/marioSautGauche.png";
            }
        }

        //Saut terminé
        else {
            if (this.isVersDroite() == true) {
                str = "/image/marioArretDroite.png";
            } else {
                str = "/image/marioArretGauche.png";
            }
            this.saut = false;
            this.compteurSaut = 0;
        }
        //Affichage de l'image de marion
        ico = new ImageIcon(getClass().getResource(str));
        img = ico.getImage();
        return img;
    }
    public void contact(Objet objet) {
        //contact horizontal
        if ((super.contactAvant(objet) == true && this.isVersDroite() == true) || (super.contactArriere(objet) == true && this.isVersDroite() == false )){
            Main.scene.setDx(0);
            this.setMarche(false);
        }
        //contact avec un objet en dessous
        if (super.contactDessous(objet) == true && this.saut == true) { //Mario saute sur un objet
            Main.scene.setySol(objet.getY());
            this.setMarche(false);
        }else if (super.contactDessous(objet) == false){  //Mario tombe sur le sol initial
            Main.scene.setySol(293); //attitude du sol initial
            if(this.saut == false) {this.setY(243);} //attitude initiale de Mario
        }
        //contact avec un objet au-dessus
        if(super.contactDessus (objet) == true) {
            Main.scene.setHautPlafond(objet.getY() + objet.getHauteur()); // Le plafond devient le dessous de l'objet
        }else if(super.contactDessus(objet) == false && this.saut == false){
            Main.scene.setHautPlafond(0);//altitude du plafond initial (ciel)
        }
    }



}




