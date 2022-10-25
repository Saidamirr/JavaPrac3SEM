package ru.mirea.prac22.task2;

import javax.swing.*;
import java.awt.*;

public class CalcUI extends JFrame {
    JButton pnl[] = new JButton[17];
    GridBagConstraints cnstr = new GridBagConstraints();
    JLabel textLabel = new JLabel();
    String outText = "";
    Calculator calculator = new Calculator(this);
    public CalcUI(){
        setLayout(new GridBagLayout());
        setSize(500, 500);
        cnstr.fill = GridBagConstraints.BOTH;
        cnstr.weightx = 1;
        cnstr.weighty = 1;
        textLabel.setBackground(Color.CYAN);    //Setting text appearance
        textLabel.setOpaque(true);
        cnstr.gridx = 0;
        cnstr.gridy = 0;
        cnstr.gridwidth = 3;
        add(textLabel, cnstr);
        cnstr.gridwidth = 1;

        for(int i = 1; i < 4; i++){     //Creating buttons from 1 to 9
            for(int n = 0; n < 3; n++) {
                pnl[(i - 1) * 4 + n] = new JButton(Integer.toString((3 - i) * 3 + n + 1));
                cnstr.gridx = n;
                cnstr.gridy = i;
                add(pnl[(i - 1) * 4 + n], cnstr);
            }
        }

        //Creating the rest of buttons
        pnl[3] = new JButton("/");
        cnstr.gridx = 3;
        cnstr.gridy = 1;
        add(pnl[3], cnstr);

        pnl[7] = new JButton("*");
        cnstr.gridy = 2;
        add(pnl[7], cnstr);

        pnl[11] = new JButton("-");
        cnstr.gridy = 3;
        add(pnl[11], cnstr);

        pnl[15] = new JButton("=");
        cnstr.gridy = 4;
        add(pnl[15], cnstr);

        pnl[12] = new JButton("0");
        cnstr.gridx = 0;
        add(pnl[12], cnstr);

        pnl[13] = new JButton(".");
        cnstr.gridx = 1;
        add(pnl[13], cnstr);

        pnl[14] = new JButton("+");
        cnstr.gridx = 2;
        add(pnl[14], cnstr);

        pnl[16] = new JButton("_");
        cnstr.gridx = 3;
        cnstr.gridy = 0;
        add(pnl[16], cnstr);

        //Adding listener to the buttons
        for (JButton button: pnl) {
            button.addActionListener(new ButtonL(this, calculator));
        }
        setVisible(true);
    }
    public void addDisplay(String text){    //Adding text to the end of the existing one
        outText += text;
        textLabel.setText(outText);
    }
    public void display(String text){textLabel.setText(text);}  //Temporarily replacing showing text
    public void setDisplayText(String text){    //Permanently replacing showing text
        outText = text;
        display(outText);
    }
}
