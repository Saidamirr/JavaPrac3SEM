package ru.mirea.prac5.task3;

import javax.swing.*;


public class MainFrame extends JFrame {

    private JLabel imgLabel;

    public MainFrame(String arg){
        this.setSize(1200, 1200);
        imgLabel = new JLabel("", new ImageIcon(getClass().getResource(arg)), SwingConstants.CENTER);
        getContentPane().add(imgLabel);
    }


}
