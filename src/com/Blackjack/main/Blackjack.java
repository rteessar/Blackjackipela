package com.Blackjack.main;
import java.util.Scanner;

public class Blackjack {

    public static void main(String[] args) {
        Kaardid ristiKaks=new Kaardid("Risti","kaks", 2);
        Kaardid ristiKolm=new Kaardid("Risti","kolm", 3);
        Kaardid ristiNeli=new Kaardid("Risti","neli", 4);
        Kaardid ristiViis=new Kaardid("Risti","viis", 5);
        Kaardid ristiKuus=new Kaardid("Risti","kuus", 6);
        Kaardid ristiSeitse=new Kaardid("Risti","seitse", 7);
        Kaardid ristiKaheksa=new Kaardid("Risti","kaheksa", 8);
        Kaardid ristiÜheksa=new Kaardid("Risti","üheksa", 9);
        Kaardid ristiKümme=new Kaardid("Risti","kümme", 10);
        Kaardid ristiPoiss=new Kaardid("Risti","poiss", 10);
        Kaardid ristiEmand=new Kaardid("Risti","emand", 10);
        Kaardid ristiKuningas=new Kaardid("Risti","kuningas", 10);
        Kaardid ristiÄss=new Kaardid("Risti","äss", 11);
        Kaardid potiKaks=new Kaardid("Poti","kaks", 2);
        Kaardid potiKolm=new Kaardid("Poti","kolm", 3);
        Kaardid potiNeli=new Kaardid("Poti","neli", 4);
        Kaardid potiViis=new Kaardid("Poti","viis", 5);
        Kaardid potiKuus=new Kaardid("Poti","kuus", 6);
        Kaardid potiSeitse=new Kaardid("Poti","seitse", 7);
        Kaardid potiKaheksa=new Kaardid("Poti","kaheksa", 8);
        Kaardid potiÜheksa=new Kaardid("Poti","üheksa", 9);
        Kaardid potiKümme=new Kaardid("Poti","kümme", 10);
        Kaardid potiPoiss=new Kaardid("Poti","poiss", 10);
        Kaardid potiEmand=new Kaardid("Poti","emand", 10);
        Kaardid potiKuningas=new Kaardid("Poti","kuningas", 10);
        Kaardid potiÄss=new Kaardid("Poti","äss", 11);
        Kaardid ruutuKaks=new Kaardid("Ruutu","kaks", 2);
        Kaardid ruutuKolm=new Kaardid("Ruutu","kolm", 3);
        Kaardid ruutuNeli=new Kaardid("Ruutu","neli", 4);
        Kaardid ruutuViis=new Kaardid("Ruutu","viis", 5);
        Kaardid ruutuKuus=new Kaardid("Ruutu","kuus", 6);
        Kaardid ruutuSeitse=new Kaardid("Ruutu","seitse", 7);
        Kaardid ruutuKaheksa=new Kaardid("Ruutu","kaheksa", 8);
        Kaardid ruutuÜheksa=new Kaardid("Ruutu","üheksa", 9);
        Kaardid ruutuKümme=new Kaardid("Ruutu","kümme", 10);
        Kaardid ruutuPoiss=new Kaardid("Ruutu","poiss", 10);
        Kaardid ruutuEmand=new Kaardid("Ruutu","emand", 10);
        Kaardid ruutuKuningas=new Kaardid("Ruutu","kuningas", 10);
        Kaardid ruutuÄss=new Kaardid("Ruutu","äss", 11);
        Kaardid ärtuKaks=new Kaardid("Ärtu","kaks", 2);
        Kaardid ärtuKolm=new Kaardid("Ärtu","kolm", 3);
        Kaardid ärtuNeli=new Kaardid("Ärtu","neli", 4);
        Kaardid ärtuViis=new Kaardid("Ärtu","viis", 5);
        Kaardid ärtuKuus=new Kaardid("Ärtu","kuus", 6);
        Kaardid ärtuSeitse=new Kaardid("Ärtu","seitse", 7);
        Kaardid ärtuKaheksa=new Kaardid("Ärtu","kaheksa", 8);
        Kaardid ärtuÜheksa=new Kaardid("Ärtu","üheksa", 9);
        Kaardid ärtuKümme=new Kaardid("Ärtu","kümme", 10);
        Kaardid ärtuPoiss=new Kaardid("Ärtu","poiss", 10);
        Kaardid ärtuEmand=new Kaardid("Ärtu","emand", 10);
        Kaardid ärtuKuningas=new Kaardid("Ärtu","kuningas", 10);
        Kaardid ärtuÄss=new Kaardid("Ärtu","äss", 11);


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Kui paljuga soovid mängu siseneda");
        int sisestusRaha = keyboard.nextInt();
        Mängija mängija =new Mängija(sisestusRaha,0);
        Diiler diiler= new Diiler(0);







    }

}
