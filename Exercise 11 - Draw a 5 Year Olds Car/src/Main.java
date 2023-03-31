import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private JPanel mainPanel;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main frame = new Main();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 800, 600);
        mainPanel = new JPanel();
        mainPanel.setBounds(0, 0, 800, 600);
        setContentPane(mainPanel);
        mainPanel.setLayout(new CardLayout(0, 0));

        DrawingBoard drawingBoard = new DrawingBoard();
        mainPanel.add(drawingBoard, "my car");
        drawingBoard.setLayout(null);

    }
}