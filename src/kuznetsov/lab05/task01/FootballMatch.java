package kuznetsov.lab05.task01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballMatch {
    static int milan_score = 0;
    static int madrid_score = 0;

    public static String setWinner(Label winner) {
        if (milan_score > madrid_score)
            return "Winner: AC Milan";
        else if (milan_score < madrid_score) {
            return "Winner: Real Madrid";
        }
        else return "Winner: Draw";
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Football match");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 100);

        JPanel panel = new JPanel();
        panel.setBackground(Color.ORANGE);
        panel.setPreferredSize(new Dimension(350, 100));

        JButton milan_button = new JButton("AC Milan");
        JButton madrid_button = new JButton("Real Madrid");
        JLabel score = new JLabel("Result: 0 X 0");
        JLabel last_scorer = new JLabel("Last Scorer: N/A");
        Label winner = new Label("Winner: N/A");

        panel.add(milan_button);
        panel.add(madrid_button);
        panel.add(score);
        panel.add(last_scorer);
        panel.add(winner);

        milan_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milan_score++;
                score.setText("Result: " + milan_score + " X " + madrid_score);
                last_scorer.setText("Last Scorer: Milan");
                winner.setText(setWinner(winner));
            }
        });

        madrid_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madrid_score++;
                score.setText("Result: " + milan_score + " X " + madrid_score);
                last_scorer.setText("Last Scorer: Madrid");
                winner.setText(setWinner(winner));
            }
        });

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}