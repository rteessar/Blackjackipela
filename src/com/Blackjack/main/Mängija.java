package com.Blackjack.main;

public class Mängija  {
    private int raha;
    private int punktid;

    public Mängija(int raha, int punktid) {
        this.raha = raha;
        this.punktid = punktid;
    }
    public int getRaha() {
        return raha;
    }
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
        raha=raha+panus;

    }
    public void kaotab(int panus){
        raha=raha-panus;
    }

    public int compareTo(Diiler o){
        if (this.punktid < o.getPunktid())
            return -1;
        if (this.punktid> o.getPunktid())
            return 1;
        return 0;
    }



}
