package kuznetsov.lab05.task03;
import java.awt.*;
import java.util.Scanner;
import javax.swing.*;
public class OpenPic {
    public static void main (String[] args) {
        JFrame frame = new JFrame ("Your Picture");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        System.out.print("Enter the path of your picture: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ImageIcon icon = new ImageIcon(path);
        JLabel label3;
        label3 = new JLabel ("Picture by path: " + path, icon, SwingConstants.CENTER);
        label3.setHorizontalTextPosition (SwingConstants.CENTER);
        label3.setVerticalTextPosition (SwingConstants.TOP);
        JPanel panel = new JPanel();
        panel.setBackground (Color.GRAY);
        panel.setPreferredSize (new Dimension (1900, 1060));
        panel.add (label3);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}