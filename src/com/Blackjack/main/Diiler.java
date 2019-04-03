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
    public void punkteOn(){
        int punkt=0;
        for (Kaardid kaart : this.dKaardid) {
            punkt=punkt+kaart.getPunktid();
        }
        setPunktid(punkt);
        System.out.println("Sul on kokku "+getPunktid());
    }

    @Override
    public void saaKaardid() {
        System.out.println("Diileril on:");
        System.out.println(dKaardid.get(0));
        System.out.println("Üks peidetud kaart");

    }


    @Override
    public void hit(ArrayList<Kaardid> pakk) {
        int kaardiKoht=(int) Math.round(Math.random()*(pakk.size()));
        this.dKaardid.add(pakk.get(kaardiKoht));
        pakk.remove(kaardiKoht);
    }
}



