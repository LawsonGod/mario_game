package com.godwill.jeu;

import javax.swing.*;
import java.awt.*;

public class Block extends Objet{

    ///////VARIABLES///////
    private Image imgBlock;
    private ImageIcon icoBlock;


    ////////CONSTRUCTEUR////////
    public Block(int x, int y) {

        super (x, y, 43, 65);
        this.icoBlock = new ImageIcon(getClass().getResource("/image/bloc.png"));
        this.imgBlock = this.icoBlock.getImage();
    }

    /////////////GETTERS////////////
    public Image getImgBlock() {return imgBlock;}

    /////////////SETTERS////////////




    /////////////METHODES////////////


}
