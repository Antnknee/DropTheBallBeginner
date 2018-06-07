package com.arson.j;


//this pulls our positioning from the class with the extends
import com.arson.j.GlobalPosition;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Player extends GlobalPosition {

    private String playerimage = "/images/Player.png";


    int velX = 0;
    int velY = 0;


//click the light bulb to auto-create a constructor

    public Player(int x, int y) {
        super(x, y);
    }

    public void update() {

        x += velX;
        y += velY;

        if(x<0){
            x=0;
        }
        if (y<0){
            y=0;
        }
        if (x>930){
            x=930;
        }
        if (y>595){
            y=595;
        }


    }


    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_RIGHT) {

            velX = 5;
        }


            else if (key == KeyEvent.VK_LEFT){

                    velX = -5;
                }
            else if (key == KeyEvent.VK_UP){

                    velY = -5;
                }
            else if (key == KeyEvent.VK_DOWN){

                    velY = 5;
        }
    }

        public void keyReleased (KeyEvent e){

            int key = e.getKeyCode();

            if (key == KeyEvent.VK_RIGHT) {

                velX = 0;
            }

            else if (key == KeyEvent.VK_LEFT) {

                velX = 0;
            }

            else if (key == KeyEvent.VK_UP) {

                velY = 0;
            }

            else if (key == KeyEvent.VK_DOWN) ;
            {

                velY = 0;
            }

        }

        public void draw (Graphics2D g2d){

            g2d.drawImage(getPlayerImage(), x, y, null);

        }

        public Image getPlayerImage () {

            ImageIcon i = new ImageIcon(getClass().getResource(playerimage));
            return i.getImage();

    }
}

