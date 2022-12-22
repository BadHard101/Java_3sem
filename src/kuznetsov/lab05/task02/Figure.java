package kuznetsov.lab05.task02;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Figure extends JFrame{
    public Figure()  {
        setSize(1920, 1080);
        JFrame myWindow = new JFrame("Painting rectangles");
        myWindow.setPreferredSize(new Dimension(200,100));
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JButton button = new JButton("Start painting");
        button.addActionListener((ActionEvent e) -> {
            repaint();
            setVisible(true);
        });

        myWindow.add(button);
        myWindow.pack();
        myWindow.setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        while (true) {
            try {
                repaint();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }


    @Override
    public void paint ( Graphics g ) {
        Graphics2D graph = (Graphics2D) g;
        graph.setPaint(new Color(30, 30, 30));
        graph.fillRect(0, 0, 1920, 1080);



        int border_space = 50;
        int x_space = 300;
        int y_space = 200;
        int near_border = 40;
        int far_border = near_border*3;
        int difference = far_border - near_border;
        for (int k = 0; k < 4; k++) {
            for (int i = 0; i < 5; i++) {

                Color color = new Color(
                        (int) (Math.random() * 255),
                        (int) (Math.random() * 255),
                        (int) (Math.random() * 255)
                );
                int[] arrayx = {
                        (int) ((Math.random() * near_border) + border_space) + x_space * i, // top-left x
                        (int) ((Math.random() * near_border) + border_space) + x_space * i, // bottom-left x
                        (int) ((Math.random() * far_border) + difference + border_space) + x_space * i, // bottom-right x
                        (int) ((Math.random() * far_border) + difference + border_space) + x_space * i // top-right x
                };
                int[] arrayy = {
                        (int) ((Math.random() * near_border) + border_space) + y_space * k, // top-left y
                        (int) ((Math.random() * far_border) + difference + border_space) + y_space * k, // bottom-left y
                        (int) ((Math.random() * far_border) + difference + border_space) + y_space * k, // bottom-right y
                        (int) ((Math.random() * near_border) + border_space) + y_space * k // top-right y

                };

                g.setColor(color);
                Polygon poly = new Polygon(arrayx, arrayy, 4);
                graph.drawPolygon(poly);
                graph.fillPolygon(poly);

            }
        }

    }


    public static void main(String args[]) {
        Figure app = new Figure();
    }

}