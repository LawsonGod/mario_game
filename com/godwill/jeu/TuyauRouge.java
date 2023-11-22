package com.godwill.jeu;

import javax.swing.*;
import java.awt.*;

public class TuyauRouge extends Objet{

    ///////VARIABLES///////
    private Image imgTuyauRouge;
    private ImageIcon icoTuyauRouge;


    ////////CONSTRUCTEUR////////
    public TuyauRouge(int x, int y) {

        super (x, y, 43, 65);
        this.icoTuyauRouge = new ImageIcon(getClass().getResource("/image/tuyauRouge.png"));
        this.imgTuyauRouge = this.icoTuyauRouge.getImage();

    }

    /////////////GETTERS////////////
    public Image getImgTuyauRouge() {return imgTuyauRouge;}

    /////////////SETTERS////////////




    /////////////METHODES////////////







}
