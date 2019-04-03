package com.Blackjack.main;

public class Kaardid {
    private Mastid mast;
    private Nimetused nimetus;
    private int punktid;

    public Kaardid(Mastid mast, Nimetused nimetus, int punktid) {
        this.mast = mast;
        this.nimetus = nimetus;
        this.punktid = punktid;
    }

    @Override
    public String toString() {
        return mast+" "+nimetus;
    }
}
