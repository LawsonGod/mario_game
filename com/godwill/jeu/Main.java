package com.godwill.jeu;

import javax.swing.*;

public class Main {

    //ici nous créons l'instance de l'objet scene//
    //ici nous créons la variable scène//
    @SuppressWarnings("serial")//....
    public static Scene scene ;

    public static void main(String[] args) {

        //Création de la fenêtre du jeu
        JFrame fenetreMario = new JFrame("Jeu style Mario by God");
        fenetreMario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreMario.setSize(700, 360);
        fenetreMario.setLocationRelativeTo(null); //pour le centrer à l'écran
        fenetreMario.setResizable(false);
        fenetreMario.setAlwaysOnTop(true); //Pour que la fenetre du jeu soit toujours au-dessus des autres fenetres

        scene = new Scene();

        fenetreMario.setContentPane(scene);//pour que la scene soit le contenu principal de la fenetre
        fenetreMario.setVisible(true);//pour rendre la fenetre visible

      }

    }


//ce code permet de créer une fenetre pour le jeu avec la bibliothèque graphique Swing de Java.
// La scène associée à la fenetre permet d'y affiche le contenu du jeu.