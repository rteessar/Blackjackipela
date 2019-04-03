package com.Blackjack.main;

import javax.swing.*;
import java.awt.*;

public class Aken extends Canvas {
    private static final long serialVersionUID = -1168249762006326698L;

    public Aken(int kõrgus,int laius,String pealdis,Mäng mäng){
        JFrame raam = new JFrame(pealdis);

        raam.setPreferredSize(new Dimension(laius,kõrgus));
        raam.setMaximumSize(new Dimension(laius,kõrgus));
        raam.setMinimumSize(new Dimension(laius,kõrgus));

        raam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        raam.setResizable(false);
        raam.setLocationRelativeTo(null);
        raam.add(mäng);
        raam.setVisible(true);
        mäng.start();
    }
}
