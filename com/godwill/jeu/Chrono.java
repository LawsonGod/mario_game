package com.godwill.jeu;


//****** Cette classe gère le déplacement du fond d'écran********//
public class Chrono implements Runnable{
    private final int PAUSE = 3; // temps de pause entre 2 tours de boucles

    @Override
    public void run() {
        while(true){
            Main.scene.repaint();
            try {
                Thread.sleep(PAUSE);
            } catch (InterruptedException e) {}
        }

    }
}
