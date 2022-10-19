import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

public class Foreground {
    private int y;
    private int height;
    private int width;

    public Foreground(int yPos, int h, int w){
        y = yPos;
        height = h;
        width = w;
    }

    public void draw(Graphics2D g2){
        // Landscape
        Ellipse2D.Double fg = new Ellipse2D.Double(-1800, y, width, height);

        g2.setColor(new Color(7, 120, 0));
        g2.fill(fg);
    }
}