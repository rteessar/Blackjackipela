package com.Blackjack.main;

import java.util.ArrayList;
import java.util.List;

public interface Tegevused {
    void hit(ArrayList<Kaardid> pakk);
    String punkteOn();
    void saaKaardid();
}
