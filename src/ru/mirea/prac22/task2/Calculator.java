package ru.mirea.prac22.task2;

import java.util.Stack;

public class Calculator {
    Stack<Float> num = new Stack<>();
    CalcUI calcUI;

    public Calculator(CalcUI calcUI){
        this.calcUI = calcUI;
    }
    void add(Character addition){
        if('0' <= addition && addition <= '9'){
            num.push((float)(addition - '0'));
            calcUI.addDisplay(String.valueOf(addition));
        }
        else if(num.size() >= 2){
            float b = num.pop();
            float a = num.pop();
            switch (addition){
                case '*':
                    num.push(a * b);
                    calcUI.addDisplay("*");
                    break;
                case '/':
                    num.push(a / b);
                    calcUI.addDisplay("/");
                    break;
                case '+':
                    num.push(a + b);
                    calcUI.addDisplay("+");
                    break;
                case '-':
                    num.push(a - b);
                    calcUI.addDisplay("-");
                    break;
                default:
                    calcUI.display("Неверно заданная операция");
            }
        }
        else if(addition == '='){
            String displayNum = num.peek().toString();
            if(num.peek() % 1.0 == 0) {
                displayNum = displayNum.replace(".0", "");
            }
            calcUI.setDisplayText(displayNum);
            System.out.println("Result = " + displayNum);
        }
        else{
            calcUI.display("Невозможно выполнить операцию с одним числом");
        }
    }
}
