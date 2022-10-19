import java.awt.*;
import java.awt.Color;
import java.awt.Rectangle;
import javax.imageio.ImageIO;


public class House {

    private int x;
    private int y;

    private int sizeX;
    private int sizeY;

    private int amount;

    public House(int xPos, int yPos, int hSizeX, int hSizeY, int houseCount){
        x = xPos;
        y = yPos;
        sizeX = hSizeX;
        sizeY = hSizeY;
        amount = houseCount;
    }

    public void draw(Graphics2D g2){

        ColorSwitcher cs = new ColorSwitcher();

        for(int i = 0; i < amount; i++){
            int newX = x;

            // base of the house
            Rectangle base = new Rectangle(x, y, sizeX, sizeY);
            Rectangle door = new Rectangle(x + 30, y + 75, 20, 25);
            Rectangle window1 = new Rectangle(x + 10, y + 25, 20, 20);
            Rectangle window2 = new Rectangle(x + 45, y + 25, 20, 20);
            Rectangle roof = new Rectangle(x - 10, y - 10, 95, 25);
            x += 200;
            // draw base
            g2.setColor(cs.randomColor());
            g2.fill(base);

            // draw door
            g2.setColor(new Color(123, 74, 15));
            g2.fill(door);

            // draw window 1
            g2.setColor(new Color(168, 234, 255));
            g2.fill(window1);

            // draw window 2
            g2.setColor(new Color(168, 234, 255));
            g2.fill(window2);

            //draw roof
            g2.setColor(new Color(123, 74, 15));
            g2.fill(roof);
        }
    }
}
