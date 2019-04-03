package com.Blackjack.main;

import java.awt.*;
import java.awt.image.BufferStrategy;


public class Mäng extends Canvas implements Runnable{

    private static final long serialVersionUID = 3868409874312625692L;

    public static final int WIDTH = 640,HEIGHT = WIDTH / 12*9;

    private Thread thread;
    private boolean töötab = false;

    public Mäng(){
        new Aken(HEIGHT, WIDTH,"Tujurikkuja",this);
    }

    public synchronized void start(){
        thread = new Thread(this);
        thread.start();
        töötab = true;
    }

    public synchronized void stop() {
        try {
            thread.join();
            töötab = false;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        long lastTime = System.nanoTime();
        double TickideArv = 60.0;
        double ns = 1000000000 / TickideArv;
        double delta = 0;
        long taimer = System.currentTimeMillis();
        int frames = 0;
        while (töötab) {
            long nüüd = System.nanoTime();
            delta += (nüüd - lastTime) / ns;
            lastTime = nüüd;
            while (delta >= 1) {
                tick();
                delta--;
            }
            if (töötab) render();
            frames++;

            if (System.currentTimeMillis() - taimer > 1000) {
                taimer += 1000;
                System.out.println("FPS: " + frames);
                frames = 0;
            }
        }
        stop();
    }

    private void tick(){

    }

    private void render(){
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null){
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();

        g.setColor(Color.black);
        g.fillRect(0,0,WIDTH,HEIGHT);

        g.dispose();
        bs.show();
    }

    public static void main(String[] args) {
        new Mäng();
    }
}

