package com.arson.j.input;

import com.arson.j.Player;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

    Player p;

    public KeyInput(Player p){

        this.p = p;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);

        p.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        super.keyReleased(e);

        p.keyReleased(e);
    }
}
