import javax.swing.*;
import java.awt.*;

public class DrawingBoard extends JPanel {
    Car zoom = new Car(Color.BLUE, 200, 300, 100, 100);

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        zoom.drawVehicle(g);
    }
}
