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
    public String punkteOn(){
        int punkt=0;
        for (Kaardid kaart : this.dKaardid) {
            punkt=punkt+kaart.getPunktid();
        }
        setPunktid(punkt);
        return "Diileril on kokku "+getPunktid();
    }

    @Override
    public void saaKaardid() {
        System.out.println("Diileril on:");
        System.out.println(dKaardid.get(0));
        System.out.println("Üks peidetud kaart");

    }
    public void saaKaardid2() {
        System.out.println("Diileri 2. kaart oli "+dKaardid.get(1));
    }


    @Override
    public void hit(ArrayList<Kaardid> pakk) {
        int kaardiKoht=(int) Math.round(Math.random()*(pakk.size()-1));
        this.dKaardid.add(pakk.get(kaardiKoht));
        pakk.remove(kaardiKoht);
    }
}



