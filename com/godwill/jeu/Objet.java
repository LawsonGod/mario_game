package com.godwill.jeu;

import com.godwill.jeu.Main;

public class Objet {

    ///Variables///
    private int largeur, hauteur; //dimension de l'objet
    private int x, y;// position de l'objet


    ///Constructeur////
    public Objet(int x, int y, int largeur, int hauteur) {
        this.x = x;
        this.y = y;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    ////GETTERS/////
    public int getLargeur() {return largeur;}
    public int getHauteur() {return hauteur;}
    public int getX() {return x;}
    public int getY() {return y;}

    /////SETTERS//////
    public void setLargeur(int largeur) {this.largeur = largeur;}
    public void setHauteur(int hauteur) {this.hauteur = hauteur;}
    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}

    /////METHODES////////
    public void deplacement(){
        if (Main.scene.getxPosition() >= 0){
            this.x = this.x - Main.scene.getDx();
        }
    }

}


