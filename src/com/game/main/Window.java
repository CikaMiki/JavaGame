
package com.game.main;


import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;


public class Window extends Canvas {
    
    private static final long serialVersionUID = 1L;
    
    public Window (int width, int height, String title, Game game) {
        JFrame frame = new JFrame(title);
        
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);  //so that it starts in the middle of the screen, not top left;
        frame.add(game);  //adding the game class into the frame;
        frame.setVisible(true);
        game.start();
    }
}
