package ru.mirea.prac22.task2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonL implements ActionListener {
    Calculator calculator;
    public ButtonL(CalcUI calcUI, Calculator calculator){
        this.calculator = calculator;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton o = (JButton) e.getSource();    //Getting pressed button
        calculator.add(o.getText().charAt(0));  //Sending input symbol to the calculator
    }
}
