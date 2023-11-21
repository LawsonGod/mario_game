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
            Main.scene.setDx(1);
        }
        else if(e.getKeyCode() == KeyEvent. VK_LEFT){
            Main.scene.setDx(-1);
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {Main.scene.setDx(0);}

    @Override
    public void keyTyped(KeyEvent e) {}
}

