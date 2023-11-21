package com.godwill.jeu;

import javax.swing.*;
import java.awt.*;

public class Mario extends Personnage{

    //****VARIABLES****//
    private Image imgMario;
    private ImageIcon icoMario;

    //*****CONSTRUCTEUR****//
    public Mario(int x, int y) {
    super(x, y, 28, 50);
    this.icoMario = new ImageIcon(getClass().getResource("/image/marioMarcheDroite.png"));
    this.imgMario = this.icoMario.getImage();

    }

    //*****getters*****//

    public Image getImgMario() {return imgMario;}
}



