import javax.swing.JFrame;
import java.awt.Color;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(1280, 720);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("House");
        frame.setLocation(500, 250);
        frame.getContentPane().setBackground(Color.black);
        Renderer renderer = new Renderer();
        frame.add(renderer);

        // add stuff before this
        frame.setVisible(true);
    }
}