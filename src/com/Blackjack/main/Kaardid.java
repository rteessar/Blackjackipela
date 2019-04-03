package com.Blackjack.main;

public class Kaardid {
    private String mast;
    private String nimetus;
    private int punktid;

    public Kaardid(String mast, String nimetus, int punktid) {
        this.mast = mast;
        this.nimetus = nimetus;
        this.punktid = punktid;
    }

    @Override
    public String toString() {
        return mast+nimetus;
    }
}
