package com.godwill.jeu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//****Cette classe a pour fonction de faire déplacer le personnage de mario
//à droite et à gauche via les touches fléchées du clavier et de donner
//l'impression de mouvement****//
public class Clavier implements KeyListener {

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            if(Main.scene.getxPosition() == -1 ){
                Main.scene.setxPosition(0);
                Main.scene.setxFond1(-50);
                Main.scene.setxFond2(750);
            }
            Main.scene.mario.setMarche(true);
            Main.scene.mario.setVersDroite(true);
            ///Déplacement du font vers la gauche lors de l'appui sur la touche "flèche droite"
            Main.scene.setDx(1);
        }
        else if(e.getKeyCode() == KeyEvent. VK_LEFT){
            Main.scene.mario.setMarche(true);
            Main.scene.mario.setVersDroite(false);
            ///Déplacement du font vers la droite lors de l'appui sur la touche "flèche gauche"
            Main.scene.setDx(-1);
        }
        //Mario saute
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            Main.scene.mario.setSaut(true);
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        Main.scene.mario.setMarche(false);
        Main.scene.setDx(0);//remise à 0 de la variable dx de l'ogjet scene lorsque la touche est relaché
    }

    @Override
    public void keyTyped(KeyEvent e) {}
}

