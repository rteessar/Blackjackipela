package com.Blackjack.main;

import java.util.ArrayList;
import java.util.List;

public class Diiler implements Tegevused{
    private int punktid;
    private List<Kaardid> dKaardid= new ArrayList<>();

    public Diiler(int punktid) {
        this.punktid = punktid;
    }

    public int getPunktid() {
        return punktid;
    }

    public void setPunktid(int punktid) {
        this.punktid = punktid;
    }

    @Override
    public void hit(ArrayList<Kaardid> pakk) {
        int kaardiKoht=(int) Math.round(Math.random()*(pakk.size()));
        this.dKaardid.add(pakk.get(kaardiKoht));
        pakk.remove(kaardiKoht);
    }
}



