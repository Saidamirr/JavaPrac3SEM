package ru.mirea.prac22.task2;

import java.util.Stack;

public class Calculator {
    Stack<Float> num = new Stack<>();
    CalcUI calcUI;
    float tempNum = -1f;    //Allows us to have multi-digit numbers
    int powerOfTen = 0;     //Allows us to have rational numbers

    public Calculator(CalcUI calcUI){
        this.calcUI = calcUI;
    }   //Setting connection with parental UI
    void add(Character addition){
        if('0' <= addition && addition <= '9'){     //If added character is a number
            if(tempNum == -1){  //If the number is new
                tempNum = 0f;
            }
            if(powerOfTen < 0){ //If the number is rational
                tempNum = tempNum + (float)(addition - '0') * (float)Math.pow(10f, powerOfTen);
                powerOfTen -= 1;
            }
            else{
                tempNum = tempNum * 10 + (float)(addition - '0');
            }
            calcUI.addDisplay(String.valueOf(addition));
        }
        else if(addition == '_'){   //If this is the end of the number
            if(tempNum == -1){return;}  //If there is no number previously input
            addSpace();
        }
        else if(addition == '.'){   //Making number rational
            if(powerOfTen < 0){
                calcUI.display("Нельзя сделать рациональным число, уже являющееся рациональным");
                return;
            }
            powerOfTen = -1;
            calcUI.addDisplay(".");
        }
        else if(addition == '='){
            String displayNum = num.peek().toString();  //Getting the result of operations
            if(num.peek() % 1.0 == 0) {     //If the number is integer, get rid of ".0"
                displayNum = displayNum.replace(".0", "");
            }
            calcUI.setDisplayText(displayNum + ' ');    //Replace showing text with the result
        }
        else if(num.size() >= 2 || (num.size() >= 1 && tempNum != -1)){     //If at least two number has been input
            if(tempNum != -1){      //If there is a number input, but it isn't in the stack
                addSpace();
            }
            float b = num.pop();
            float a = num.pop();
            switch (addition){
                case '*':
                    num.push(a * b);
                    calcUI.addDisplay("* ");
                    break;
                case '/':
                    num.push(a / b);
                    calcUI.addDisplay("/ ");
                    break;
                case '+':
                    num.push(a + b);
                    calcUI.addDisplay("+ ");
                    break;
                case '-':
                    num.push(a - b);
                    calcUI.addDisplay("- ");
                    break;
                default:
                    calcUI.display("Неверно заданная операция");
            }
        }
        else{
            calcUI.display("Невозможно выполнить операцию с менее чем двумя числами");
        }
    }
    private void addSpace(){    //Pushing input number in the stack and resetting number input
        num.push(tempNum);
        calcUI.addDisplay(" ");
        tempNum = -1f;
        powerOfTen = 1;
    }
}
