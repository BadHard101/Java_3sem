package kuznetsov.lab05.task04;

import javax.swing.*;
import java.awt.*;

public class Animation extends JFrame {

    private JLabel imgLabel;
    private int imgNum = 1;

    private Animation(){
        this.setSize(310, 540);

        ImageIcon imageIcon = new ImageIcon(getClass().getResource("pics/1.jpg")); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(304, 532,  Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newimg);

        imgLabel = new JLabel("", imageIcon, SwingConstants.CENTER);


        getContentPane().add(imgLabel);

        Timer timer = new Timer(100, w -> nextImg());
        timer.start();
    }
    private void nextImg(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("pics/" + (++imgNum) + ".jpg")); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(304, 532,  Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newimg);

        imgLabel.setIcon(imageIcon);
        if(imgNum == 8) imgNum = 0;

    }

    public static void main(String[] args) {
        Animation mf = new Animation();
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mf.setVisible(true);

    }
}
