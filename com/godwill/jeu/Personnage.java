package com.godwill.jeu;

public class Personnage {

    //******VARIABLES*****//
    private int largeur, hauteur;
    private int x, y;
    private  boolean marche;
    private boolean versDroite;
    public int compteur;

    public  Personnage(int x, int y, int largeur, int hauteur){
        this.x = x;
        this.y = y;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.compteur = 0;
        this.marche = false;
        this.versDroite = true;
    }

    //*****Getters******//

    public int getLargeur() {return largeur;}
    public int getHauteur() {return hauteur;}
    public int getX() {return x;}
    public int getY() {return y;}
    public boolean isMarche() {return marche;}
    public int getCompteur() {return compteur;}
    public boolean isVersDroite() {return versDroite;}

    //******setters*****//

    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}
    public void setMarche(boolean marche) {this.marche = marche;}
    public void setVersDroite(boolean versDroite) {this.versDroite = versDroite;}
    public void setCompteur(int compteur) {this.compteur = compteur;}
}

//*****METHODES*****//

