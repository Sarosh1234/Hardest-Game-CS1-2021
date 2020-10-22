package hardestgame;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author 808652
 */
public class Player {
    private int x, y;
    //constants
    private final static int WIDTH = 50, HEIGHT = 50, SPEED = 4;
    private final static Color COLOR = Color.RED;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    //1. draw outline on shape
    public void draw(Graphics g) {        
        g.setColor(COLOR);
        g.fillRect(x, y, WIDTH, HEIGHT);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, WIDTH, HEIGHT);
    }
    
    //7. implement method playerVsEnemy
    /**
     * Checks if player collides with an enemy
     * and respawns player if it does
     * @param enemy the enemy to check for collision against
     * @param start the player respawns in middle of start if collides with enemy
     */
    public void playerVsEnemy(Enemy enemy, Goal start) {
        Rectangle playerBounds = new Rectangle(x, y, WIDTH, HEIGHT);
        Rectangle borderBounds = new Rectangle(border.getX(), border.getY(), border.getWidth(), border.getHeight());
        if (!borderBounds.contains(playerBounds)) {
            x = 0;
            y = 0;

    }
    }

    //8.a. implement method isInBounds
    /**
     * Determines if player is still in bounds
     * @param border boundaries of the room
     * @return isInBounds Whether the player is in bounds or not
     */
     private boolean isInBounds(Border border) {
          playerBounds = new Rectangle(x, y, WIDTH, HEIGHT);
        Rectangle borderBounds = new Rectangle(border.getX(), border.getY(), border.getWidth(), border.getHeight());
        if (!borderBounds.contains(playerBounds)) {
           return true;


     }

    //9. implement method playerVsGoal
    /**
     * Determines if player reaches a goal
     * @param finish goal player might have reached
     * @return didReachGoal Whether the player reached the goal or not
     */
     public boolean playerVsGoal(Goal finish) {

     }
    
    public void move(int dx, int dy) {
        x += dx * SPEED;
        y += dy * SPEED;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static int getWIDTH() {
        return WIDTH;
    }

    public static int getHEIGHT() {
        return HEIGHT;
    }    
    
}