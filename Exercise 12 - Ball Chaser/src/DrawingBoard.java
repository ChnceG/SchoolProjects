import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawingBoard extends JPanel {
    private Timer timer = new Timer(10, new TimerAction());
    Ball ball = new Ball(50, 350, 250, 3, Color.RED);

    public DrawingBoard() {
        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                startGame(e, ball);
            }
        });

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ball.drawBall(g);
    }

    public void startGame(MouseEvent e, Ball ball) {
        if (!timer.isRunning()) {
            timer.start();
        }
        if (timer.isRunning()) {
            ball.setxSpeed(ball.getxSpeed() * -1);
            if(ball.getxSpeed() < 0) {
                ball.setxSpeed(ball.getxSpeed() - 2);
            }
            else {
                ball.setxSpeed(ball.getxSpeed() + 2);
            }
        }
    }
    public void ballMovement() {
        ball.moveBall();
        gameOver(ball);
        repaint();
    }
    public void gameOver(Ball ball) {
        if ((ball.getxPosition() + ball.getSize()) > 800 || ball.getxPosition() < 0) {
            JOptionPane.showMessageDialog(null, "Game Over");
            ball.setxPosition(350);
            ball.setxSpeed(3);
            timer.stop();
        }
    }
    private class TimerAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ballMovement();
        }
    }
}