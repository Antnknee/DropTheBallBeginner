package com.arson.j;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //this sets up the window with JFrame. 12 creates 13 sets size 14 stops resizing 15 makes the x button work
        //16 is so u can see it and 17 is so it opens in the middle of the screen not the top left
        JFrame frame = new JFrame();
        frame.setSize(1000, 720);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        //calls the game into existence
        frame.add(new Game());



        //this needs to be after frame.add(new Game());  im not sure why
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);






    }
}
