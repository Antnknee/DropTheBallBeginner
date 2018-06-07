package com.arson.j;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.arson.j.input.KeyInput;
import com.arson.j.objects.Enemy;


public class Game extends JPanel implements ActionListener {

    Timer gamelooptimer;
    Player p;
    Enemy enemyOne;

    private String background = "/images/backgroundimage.png";
    public Game(){

        //this is so u can do stuff right away when the screen opens...k cool
        setFocusable(true);

        //gameloop reads what the player does every 'n' frames/seconds/however long
        //this delay is 10ms
        gamelooptimer = new Timer(10, this);
        gamelooptimer.start();

        // x and y coordinates
        p = new Player(450,50);
        addKeyListener(new KeyInput(p));


        Enemy enemyOne = new Enemy(0,500);


    }

    //so this makes a g graphics variable only to convert it to graphics2d...i don't get it (shrug)
    public void paint(Graphics g){

        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(getBackgroundImage(),0,0,this);


        //draws our image
        p.draw(g2d); /*only if in Main frame.setVisible is after after frame.add(new Game())*/


        enemyOne.draw(g2d);

    }

        public Image getBackgroundImage(){
            ImageIcon i = new ImageIcon(getClass().getResource(background));
            return i.getImage();


        }



    @Override
    public void actionPerformed(ActionEvent e) {
        p.update();
        repaint();


    }



}
