package com.godwill.jeu;

import java.awt.*;
import javax.swing.*;


public class Scene extends JPanel{

    private ImageIcon icoFond;
    private Image imgFond1;
    private ImageIcon icoMario;
    private Image imgMario;
    private int xFond1;

    //création du constructeur//
    public Scene() {
        super();
        this.xFond1 = -50;

        icoFond = new ImageIcon(getClass().getResource("/image/fondEcran.png"));
        this.imgFond1 = this.icoFond.getImage();
        icoMario = new ImageIcon(getClass().getResource("/image/marioMarcheDroite.png"));
        this.imgMario = this.icoMario.getImage();

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics g2 = (Graphics2D)g;

        g2.drawImage(this.imgFond1, this.xFond1, 0, null); //pour dessiner l'image de fond
        g2.drawImage(imgMario, 300, 245, null);

    }

}
