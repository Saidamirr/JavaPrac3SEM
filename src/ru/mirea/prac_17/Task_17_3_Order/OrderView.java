package Task_17_3_Order;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderView extends JFrame {
    //Класс с GIU

    private OrderController controller;
    JTextField name_field; //Можно использовать не только в конструкторе

    public OrderView(OrderController controller) {

        //Frame
        super("Order");
        super.setBounds(200, 100, 300, 120);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.controller = controller;

        //Container
        Container container = super.getContentPane();
        container.setLayout(new GridLayout(2,2,5,5));

        //Creating labels
        JLabel name = new JLabel("Enter your name");
        name_field = new JTextField("",1);
        JLabel submit = new JLabel("Check order status");
        JButton button = new JButton("OK");

        //Adding labels to containers
        container.add(name);
        container.add(name_field);
        container.add(submit);
        container.add(button);

        //Pressing button
        button.addActionListener(new ButtonEventManager(controller));
    }

    //Class called on pressing button
    class ButtonEventManager implements ActionListener{
        private OrderController controller;

        ButtonEventManager(OrderController controller){
            this.controller = controller;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = name_field.getText(); //getting name of user
            String msg = name + ", your order is "; //msg template
            controller.setClientName(name); //sending it to controller

            //message window
            JOptionPane.showMessageDialog(null,
 msg +controller.getOrderStatus(), "Order status", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
