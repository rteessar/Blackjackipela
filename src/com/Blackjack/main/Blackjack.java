package com.Blackjack.main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Blackjack {

    public static void main(String[] args) {

        List<Kaardid> kaardiPakk = new ArrayList<>();


        for(Mastid mast:Mastid.values()){
            for(Nimetused nimetus:Nimetused.values()){
                String nimi=nimetus.toString();
                if(nimi.equals("kaks")) {Kaardid c=new Kaardid(mast,nimetus,2); kaardiPakk.add(c);}
                if(nimi.equals("kolm")) {Kaardid c=new Kaardid(mast,nimetus,3);kaardiPakk.add(c);}
                if(nimi.equals("neli")) {Kaardid c=new Kaardid(mast,nimetus,4);kaardiPakk.add(c);}
                if(nimi.equals("viis")) {Kaardid c=new Kaardid(mast,nimetus,5);kaardiPakk.add(c);}
                if(nimi.equals("kuus")) {Kaardid c=new Kaardid(mast,nimetus,6);kaardiPakk.add(c);}
                if(nimi.equals("seitse")) {Kaardid c=new Kaardid(mast,nimetus,7);kaardiPakk.add(c);}
                if(nimi.equals("kaheksa")) {Kaardid c=new Kaardid(mast,nimetus,8);kaardiPakk.add(c);}
                if(nimi.equals("üheksa")) {Kaardid c=new Kaardid(mast,nimetus,9);kaardiPakk.add(c);}
                if(nimi.equals("kümme")) {Kaardid c=new Kaardid(mast,nimetus,10);kaardiPakk.add(c);}
                if(nimi.equals("poiss")) {Kaardid c=new Kaardid(mast,nimetus,10);kaardiPakk.add(c);}
                if(nimi.equals("kuningas")) {Kaardid c=new Kaardid(mast,nimetus,10);kaardiPakk.add(c);}
                if(nimi.equals("äss")) {Kaardid c=new Kaardid(mast,nimetus,11);kaardiPakk.add(c);}
            }

            }
        System.out.println(kaardiPakk);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Mitme euroga soovid lauda istuda");
        int sisestusRaha = keyboard.nextInt();
        Mängija mängija =new Mängija(sisestusRaha,0);
        Diiler diiler= new Diiler(0);









    }

}
