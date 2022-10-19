import java.awt.*;
import java.awt.Color;
import java.awt.Rectangle;


public class Road {

    private int x;
    private int y;

    private int sizeX;
    private int sizeY;

    private int amount;

    public Road(int xPos, int yPos, int hSizeX, int hSizeY, int dashAmount){
        x = xPos;
        y = yPos;
        sizeX = hSizeX;
        sizeY = hSizeY;
        amount = dashAmount;
    }

    public void draw(Graphics2D g2){
        Rectangle r = new Rectangle(x, y, sizeX, sizeY);
        g2.setColor(new Color(80, 80, 80));
        g2.fill(r);

        for(int i = 0; i < amount; i++){

            Rectangle dash = new Rectangle(x, y + 20, 30, 10);

            g2.fill(dash);
            g2.setColor(Color.yellow);
            x += 100;
        }

    }
}
