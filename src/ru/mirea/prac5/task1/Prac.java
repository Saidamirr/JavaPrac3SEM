package ru.mirea.prac5.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Prac extends JFrame {
    JButton milanButton = new JButton("AC Milan");
    JButton madridButton = new JButton("Real Madrid");
    int milanScore = 0;
    int madridScore = 0;
    String lastScorerString = "N/A";
    String winnerString = "DRAW";
    JLabel resultLabel = new JLabel("Result: "+milanScore+" X "+madridScore);
    JLabel lastScorerLabel = new JLabel("Last Scorer: "+lastScorerString);
    Label winnerLabel = new Label("Winner: " + winnerString);
    private void checkScore() {
        if(milanScore > madridScore) {
            winnerString = "AC Milan";
        } else if(milanScore < madridScore) {
            winnerString = "Real Madrid";
        } else if(milanScore == madridScore) {
            winnerString = "DRAW";
        }
        winnerLabel.setText("Winner: " + winnerString);
    }
    public Prac() {
        super("Milan vs Madrid");
        setSize(500, 500);
        add(milanButton, BorderLayout.WEST);
        add(madridButton, BorderLayout.EAST);
        add(resultLabel, BorderLayout.NORTH);
        add(lastScorerLabel, BorderLayout.SOUTH);
        add(winnerLabel, BorderLayout.CENTER);
        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                lastScorerString = "AC Milan";
                resultLabel.setText("Result: "+milanScore+" X "+madridScore);
                lastScorerLabel.setText("Last Scorer: "+lastScorerString);
                checkScore();
            }
        });
        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                lastScorerString = "Real Madrid";
                resultLabel.setText("Result: "+milanScore+" X "+madridScore);
                lastScorerLabel.setText("Last Scorer: "+lastScorerString);
                checkScore();
            }
        });
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Prac();
    }
}

