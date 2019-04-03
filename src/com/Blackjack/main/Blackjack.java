package com.Blackjack.main;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Blackjack {

    public static void main(String[] args) {

        ArrayList<Kaardid> kaardiPakk = new ArrayList<>();


        for (Mastid mast : Mastid.values()) {
            for (Nimetused nimetus : Nimetused.values()) {
                String nimi = nimetus.toString();
                if (nimi.equals("kaks")) { Kaardid c = new Kaardid(mast, nimetus, 2);kaardiPakk.add(c); }
                if (nimi.equals("kolm")) { Kaardid c = new Kaardid(mast, nimetus, 3);kaardiPakk.add(c); }
                if (nimi.equals("neli")) { Kaardid c = new Kaardid(mast, nimetus, 4);kaardiPakk.add(c); }
                if (nimi.equals("viis")) { Kaardid c = new Kaardid(mast, nimetus, 5);kaardiPakk.add(c); }
                if (nimi.equals("kuus")) {Kaardid c = new Kaardid(mast, nimetus, 6);kaardiPakk.add(c); }
                if (nimi.equals("seitse")) { Kaardid c = new Kaardid(mast, nimetus, 7);kaardiPakk.add(c); }
                if (nimi.equals("kaheksa")) { Kaardid c = new Kaardid(mast, nimetus, 8);kaardiPakk.add(c); }
                if (nimi.equals("üheksa")) { Kaardid c = new Kaardid(mast, nimetus, 9);kaardiPakk.add(c); }
                if (nimi.equals("kümme")) { Kaardid c = new Kaardid(mast, nimetus, 10);kaardiPakk.add(c); }
                if (nimi.equals("poiss")) { Kaardid c = new Kaardid(mast, nimetus, 10);kaardiPakk.add(c); }
                if (nimi.equals("emand")) { Kaardid c = new Kaardid(mast, nimetus, 10);kaardiPakk.add(c); }
                if (nimi.equals("kuningas")) { Kaardid c = new Kaardid(mast, nimetus, 10);kaardiPakk.add(c); }
                if (nimi.equals("äss")) { Kaardid c = new Kaardid(mast, nimetus, 11);kaardiPakk.add(c); }
            }
        }
        String tegevus2 = "ja";
        System.out.println("Tere tulemast meie blackjacki kasiinosse");
        System.out.println("Siin sinu ainsad võimalikud tegevused on hit ja pass");
        System.out.println("Kokku sul käes võib olla vaid 4 kaarti");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Mitme euroga soovid lauda istuda");
        int sisestusRaha = keyboard.nextInt();
        int alles = sisestusRaha;

        System.out.println("Mäng algab!");
        do {
            Mängija mängija = new Mängija(alles, 0);
            Diiler diiler = new Diiler(0);
            System.out.println("Mitu eurot panustad?");
            int panus = keyboard.nextInt();
            mängija.hit(kaardiPakk);
            diiler.hit(kaardiPakk);
            mängija.hit(kaardiPakk);
            diiler.hit(kaardiPakk);
            mängija.saaKaardid();
            System.out.println(mängija.punkteOn());

            diiler.saaKaardid();
            diiler.punkteOn();
            if (mängija.getPunktid() == 21 && diiler.getPunktid() != 21) {
                System.out.println("Sina võitsid! " + diiler.punkteOn());
                mängija.võidab(panus);
            } else if (mängija.getPunktid() != 21 && diiler.getPunktid() == 21) {
                System.out.println("Diiler võitis! " + diiler.punkteOn());
                mängija.kaotab(panus);
            } else if (mängija.getPunktid() == 21 && diiler.getPunktid() == 21) {
                System.out.println("Tuli viik! Saad raha tagasi");
            } else {

                Scanner edasi = new Scanner(System.in);
                System.out.println("Mis on sinu edasine tegevus? hit/pass");
                String tegevus = edasi.nextLine();
                if (tegevus.equals("hit")) {
                    mängija.hit(kaardiPakk);
                    mängija.punkteOn();
                    if (mängija.getPunktid() > 21) {
                        System.out.println(mängija.punkteOn());
                        System.out.println("Diiler võitis! " + diiler.punkteOn());
                        mängija.kaotab(panus);
                    } else {
                        System.out.println(mängija.punkteOn());
                        System.out.println("Mis on sinu edasine tegevus? hit/pass");
                        tegevus = edasi.nextLine();
                        if (tegevus.equals("hit")) {
                            mängija.hit(kaardiPakk);
                            mängija.punkteOn();
                            if (mängija.getPunktid() > 21) {
                                System.out.println("Diiler võitis! " + diiler.punkteOn());
                                mängija.kaotab(panus);
                            }
                        } else if (tegevus.equals("pass") && diiler.getPunktid() < mängija.getPunktid()) {
                            diiler.saaKaardid2();
                            do {
                                System.out.println("Diiler tõmbab kaardi");
                                diiler.hit(kaardiPakk);
                                diiler.punkteOn();
                                System.out.println(diiler.punkteOn());
                                if (diiler.getPunktid() > mängija.getPunktid() && diiler.getPunktid() <= 21) {

                                    System.out.println("Diiler võitis! " + diiler.punkteOn());
                                    mängija.kaotab(panus);

                                    break;
                                } else if (diiler.getPunktid() > 21) {
                                    System.out.println("Mängija võitis! " + diiler.punkteOn());
                                    mängija.võidab(panus);
                                    break;
                                } else if (diiler.getPunktid() == mängija.getPunktid()) {
                                    System.out.println("Tuli viik, saad raha tagasi");

                                }


                            }

                            while (diiler.getPunktid() < mängija.getPunktid());


                        }
                    }
                }


                else if (tegevus.equals("pass") && diiler.getPunktid() > mängija.getPunktid()) {
                    diiler.saaKaardid2();
                    System.out.println("Diiler võitis! " + diiler.punkteOn());
                    mängija.kaotab(panus);

                } else if (tegevus.equals("pass") && diiler.getPunktid() < mängija.getPunktid()) {
                    diiler.saaKaardid2();
                    do {
                        System.out.println("Diiler tõmbab kaardi");
                        diiler.hit(kaardiPakk);
                        diiler.punkteOn();
                        System.out.println(diiler.punkteOn());
                        if (diiler.getPunktid() > mängija.getPunktid() && diiler.getPunktid() <= 21) {

                            System.out.println("Diiler võitis! " + diiler.punkteOn());
                            mängija.kaotab(panus);

                            break;
                        } else if (diiler.getPunktid() > 21) {
                            System.out.println("Mängija võitis! " + diiler.punkteOn());
                            mängija.võidab(panus);
                            break;
                        } else if (diiler.getPunktid() == mängija.getPunktid()) {
                            System.out.println("Tuli viik, saad raha tagasi");

                        }


                    }

                    while (diiler.getPunktid() < mängija.getPunktid());


                }
            }
                Scanner edasi2 = new Scanner(System.in);
                System.out.println("Kas jätkad? ja/ei");
                tegevus2 = edasi2.nextLine();
                alles = mängija.getRaha();
                if (tegevus2.equals("ei")) {
                    System.out.println("Lahkusid lauast ja alles jäi " + mängija.getRaha() + "€");
                }


    } while(tegevus2.equals("ja"));
}




}




