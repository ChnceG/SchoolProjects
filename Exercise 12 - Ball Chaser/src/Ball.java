import java.awt.Color;
import java.awt.Graphics;

public class Ball {
    private int size;
    private int xPosition;
    private int yPosition;
    private int xSpeed;
    private Color ballColor;

    public Ball(int size, int xPosition, int yPosition, int xSpeed, Color ballColor) {
        this.setSize(size);
        this.setxPosition(xPosition);
        this.setyPosition(yPosition);
        this.setxSpeed(xSpeed);
        this.setBallColor(ballColor);
    }

    public void drawBall(Graphics g) {
        g.setColor(this.getBallColor());
        g.fillOval(this.getxPosition(), this.getyPosition(), this.getSize(), this.getSize());
    }
    public void moveBall() {
        this.setxPosition(this.getxPosition() + this.getxSpeed());
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }
    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }
    public void setBallColor(Color ballColor) {
        this.ballColor = ballColor;
    }

    public int getSize() {
        return size;
    }
    public int getxPosition() {
        return xPosition;
    }
    public int getyPosition() {
        return yPosition;
    }
    public int getxSpeed() {
        return xSpeed;
    }
    public Color getBallColor() {
        return ballColor;
    }
}
