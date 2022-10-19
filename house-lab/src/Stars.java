import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;


public class Stars {

    private int x;
    private int y;
    private int sizeMin;
    private int sizeMax;
    private int amount;


    public Stars(int xPos, int yPos, int starSizeMin, int starSizeMax, int starCount){
        x = xPos;
        y = yPos;
        sizeMin = starSizeMin;
        sizeMax = starSizeMax;
        amount = starCount;
    }

    public void draw(Graphics2D g2){
        Random rand = new Random();

        // Generate star clusters and randomly size and place them around the canvas
        for (int i = 0; i < amount; i++) {
            int randomX = rand.nextInt(x, 1280);
            int randomY = rand.nextInt(y, 720);
            int finalSize = rand.nextInt(sizeMin, sizeMax);

            Ellipse2D.Double star = new Ellipse2D.Double(randomX, randomY, finalSize, finalSize);

            g2.fill(star);
            g2.setColor(Color.white);

            // debug
            System.out.println("Created new star at: " + x + " " + y + " with a size of: " + finalSize);
        }
    }
}