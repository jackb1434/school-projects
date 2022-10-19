import java.awt.Color;
import java.util.Random;

public class ColorSwitcher {

    public Color randomColor(){
        Random random = new Random();
        int index = random.nextInt(0, 8);

        switch(index){
            case 0:
                return Color.cyan;
            case 1:
                return Color.magenta;
            case 3:
                return Color.pink;
            case 4:
                return Color.yellow;
            case 5:
                return Color.green;
            case 6:
                return Color.orange;
            case 7:
                return Color.red;
            case 8:
                return Color.blue;
        }
        return null;
    }
}
