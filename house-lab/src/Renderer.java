import javax.swing.JComponent;
import java.awt.*;


public class Renderer extends JComponent{
    // main render component
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        Stars star = new Stars(5, 10, 2, 5, 250);
        star.draw(g2);
        Foreground ground = new Foreground(500, 750, 5000);
        ground.draw(g2);
        House myHouse = new House(200, 450, 75, 100, 5);
        myHouse.draw(g2);
        Road myRoad = new Road(160, 550, 1000, 50, 10);
        myRoad.draw(g2);
        int h = getHeight();
        int w = getWidth();
    }
}
