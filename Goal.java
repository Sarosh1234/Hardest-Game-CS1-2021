/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardestgame;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author 808652
 */
public class Goal {
    private int x, y;
    private final int width, height;
    private final boolean isFinish;
    private final static Color COLOR = Color.RED;
    
    //3.a. constructor for Border
    public Goal(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
       
    }
    
    //3.b draws a rectangle
    public void draw(Graphics g) {
         g.setColor(color);
        g.fillRect(x, y, width, height);
    }
    //3.c getters

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isIsFinish() {
        return isFinish;
    }

    public static Color getCOLOR() {
        return COLOR;
    }
    
}