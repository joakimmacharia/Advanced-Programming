package Lecture4_interfaces_abstract_classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BankGUI extends JFrame implements ActionListener {

    JTextField amountField;

    JLabel balanceLabel;

    JButton depositButton;
    JButton withdrawButton;

    double balance = 1000;

    public BankGUI() {

        setTitle("Bank System");

        setSize(400,300);

        setLayout(new FlowLayout());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        amountField = new JTextField(15);

        depositButton = new JButton("Deposit");

        withdrawButton = new JButton("Withdraw");

        balanceLabel =
                new JLabel("Balance: " + balance);

        add(new JLabel("Amount:"));

        add(amountField);

        add(depositButton);

        add(withdrawButton);

        add(balanceLabel);

        depositButton.addActionListener(this);

        withdrawButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        double amount =
                Double.parseDouble(amountField.getText());

        if(e.getSource() == depositButton){

            balance += amount;

        }

        else if(e.getSource() == withdrawButton){

            if(balance >= amount){

                balance -= amount;
            }
        }

        balanceLabel.setText("Balance: " + balance);
    }

    public static void main(String[] args) {

        new BankGUI();
    }
}
