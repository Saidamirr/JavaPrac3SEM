package ru.mirea.prac22.task2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonL implements ActionListener {
    CalcUI calcUI;
    Calculator calculator;
    public ButtonL(CalcUI calcUI, Calculator calculator){
        this.calcUI = calcUI;
        this.calculator = calculator;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton o = (JButton) e.getSource();
        calculator.add(o.getText().charAt(0));
    }
}
