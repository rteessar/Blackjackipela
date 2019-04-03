package com.Blackjack.main;

import java.util.ArrayList;
import java.util.List;

public class Mängija implements Tegevused {
    private int raha;
    private int punktid;
    private List<Kaardid> mKaardid=new ArrayList<>();

    public Mängija(int raha, int punktid) {
        this.raha = raha;
        this.punktid = punktid;
    }
    public int getRaha() { return raha; }
    public int getPunktid() {
        return punktid;
    }



    public void setRaha(int raha) {
        this.raha = raha;
    }
    public void setPunktid(int punktid) {
        this.punktid = punktid;
    }
    public void võidab(int panus){
        this.raha=this.raha+panus;
    }
    public void kaotab(int panus){
        this.raha=this.raha-panus;
    }

    public void hit(ArrayList<Kaardid> pakk){
        int kaardiKoht=(int) Math.round(Math.random()*(pakk.size()));
            this.mKaardid.add(pakk.get(kaardiKoht));
            pakk.remove(kaardiKoht);
    }
    public void punkteOn(){
        int punkt=0;
        for (Kaardid kaart : this.mKaardid) {
            punkt=punkt+kaart.getPunktid();
        }
        setPunktid(punkt);
        System.out.println("Sul on kokku "+getPunktid());
    }

    public int compareTo(Diiler o){
        if (this.punktid < o.getPunktid())
            return -1;
        if (this.punktid> o.getPunktid())
            return 1;
        return 0;
    }
    public void saaKaardid(){
        System.out.println("Mängijal on: ");
        for (Kaardid kaart : this.mKaardid) {
            System.out.println(kaart);
        }
    }

    @Override
    public String toString() {
        return "Mängijal on  alles "+raha+"€";
    }

}
