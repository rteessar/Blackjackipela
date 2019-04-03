package com.Blackjack.main;

import java.util.ArrayList;

public interface Tegevused {
    void hit(ArrayList<Kaardid> pakk);
    void punkteOn();
    void saaKaardid();
}
