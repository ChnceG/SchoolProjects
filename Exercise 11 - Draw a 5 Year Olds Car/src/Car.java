import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;
public class Car {
    private Color bodyColor;
    private int height;
    private int width;
    private int xPosition;
    private int yPosition;

    public Car(Color bodyColor, int height, int width, int xPosition, int yPosition) {
        this.bodyColor = bodyColor;
        this.height = height;
        this.width = width;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public Color getBodyColor() {
        return bodyColor;
    }
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public int getxPosition() {
        return xPosition;
    }
    public int getyPosition() {
        return yPosition;
    }

    public void drawVehicle(Graphics g) {
        //body
        g.setColor(getBodyColor());
        g.fillRect(this.getxPosition(), this.getyPosition(), this.getWidth(), this.getHeight());
        g.fillRect((this.getxPosition() + this.getWidth()), (this.getyPosition() + this.getHeight()/2), (this.getWidth()/4), (this.getHeight()/2));
        g.setColor(Color.WHITE);
        g.fillRect((this.getxPosition()), (this.getyPosition() + this.getHeight()/2 + this.getHeight()/6), (this.getWidth() + this.getWidth()/4), (this.getHeight()/9));

        //window
        g.setColor(Color.WHITE);
        g.fillRect(((this.getxPosition() + this.getWidth()) - (getWidth()/3)), (this.getyPosition()), (this.getWidth()/3), (this.getHeight()/2));
        g.setColor(getBodyColor());
        g.drawRect(((this.getxPosition() + this.getWidth()) - (getWidth()/3)), (this.getyPosition()), (this.getWidth()/3), (this.getHeight()/2));

        //wheel
        int wheelSize = this.getWidth()/5;
        int wheel1 = this.getxPosition() + this.getWidth()/4;
        int wheel2 = wheel1 + this.getWidth()/2;
        int wheelY = (this.getyPosition() + this.getHeight()) - (wheelSize/2);
        g.setColor(Color.BLACK);
        g.fillOval(wheel1, wheelY, wheelSize, wheelSize);
        g.fillOval(wheel2, wheelY, wheelSize, wheelSize);
    }
}
