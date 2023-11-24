package com.godwill.jeu;

import javax.swing.*;
import java.awt.*;

public class Personnage {

    /////////VARIABLES//////////
    private int largeur, hauteur;
    private int x, y;
    private boolean marche;
    private boolean versDroite;
    public int compteur;


    ///////CONSTRUCTEURS/////////
    public Personnage(int x, int y, int largeur, int hauteur) {
        this.x = x;
        this.y = y;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.compteur = 0;
        this.marche = false;
        this.versDroite = true;
    }

    //*****GETTERS******//
    public int getLargeur() {return largeur;}
    public int getHauteur() {return hauteur;}
    public int getX() {return x;}
    public int getY() {return y;}
    public boolean isMarche() {return marche;}
    public int getCompteur() {return compteur;}
    public boolean isVersDroite() {return versDroite;}

    //******SETTERS*****//
    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}
    public void setMarche(boolean marche) {this.marche = marche;}
    public void setVersDroite(boolean versDroite) {this.versDroite = versDroite;}
    public void setCompteur(int compteur) {this.compteur = compteur;}


    //*****METHODES*****//
    public Image marche(String nom, int frequence) {
        String str;
        ImageIcon ico;
        Image img;

        if (this.marche == false || Main.scene.getxPosition() <= 0) {
            if (this.versDroite == true) {str = "/image/" + nom + "ArretDroite.png";}
            else {str = "/image/" + nom + "ArretGauche.png";}
        }
        else{
            this.compteur++;
            //si le compteur divisé par la fréquence est égale à 0//
            if(this.compteur / frequence == 0) {
                if (this.versDroite == true) {str = "/image/" + nom + "ArretDroite.png";}
                else {str = "/image/" + nom + "ArretGauche.png";}
            }
            else {
                if (this.versDroite == true) {str = "/image/" + nom + "MarcheDroite.png";}
                else {str = "/image/" + nom + "MarcheGauche.png";}
            }
            if(this.compteur == 2 * frequence) {this.compteur = 0;}
        }
        ////******AFFICHAGE DE L'IMAGE DU PERSONNAGE*****/////
        ico = new ImageIcon(getClass().getResource(str));
        img = ico.getImage();
        return img;
    }

    //Detection contact à droite de Mario
    protected boolean contactAvant (Objet objet){
            if (this.x + this.largeur < objet.getX() || this.x + this.largeur > objet.getX() + 5 || this.y + this.hauteur <= objet.getY() ||
                this.y >= objet.getY() + objet.getHauteur()){return false;}
            else{return true;}
        }

    //Detection contact à gauche de Mario
    protected boolean contactArriere(Objet objet) {
        if (this.x > objet.getX() + objet.getLargeur() || this.x + this.largeur < objet.getX() + objet.getLargeur() - 5 ||
                this.y + this.hauteur <= objet.getY() || this.y >= objet.getY() + objet.getHauteur()) {
            return false;
        } else {return true;}
    }

    //Detection contact en dessous de Mario
    protected boolean contactDessous(Objet objet) {
        if (this.x + this.largeur < objet.getX() + 5 || this.x > objet.getX() + objet.getLargeur() - 5 ||
                this.y + this.hauteur < objet.getY() || this.y + this.hauteur > objet.getY() + 5){return false;}
        else{return true;}
    }

    //Detection contact en dessus de Mario
    protected boolean contactDessus(Objet objet) {
        if (this.x + this.largeur < objet.getX() + 5 || this.x > objet.getX() + objet.getLargeur() - 5 ||
                this.y < objet.getY() + objet.getHauteur() || this.y > objet.getY() + objet.getHauteur() + 5){return false;}
        else{return true;}
    }

    //Test si le personnage est proche de l'objet
    public boolean proche(Objet objet){
        if ((this.x > objet.getX() - 10 && this.x < objet.getX() + objet.getLargeur() + 10)
                || (this.x + this.largeur > objet.getX() - 10 && this.x + this.largeur < objet.getX() + objet.getLargeur() + 10)) {return true;}
        else {return false;}

    }




}