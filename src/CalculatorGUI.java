/*  Name: MUHAMMAD MAHAD
    CMS ID: 408576
    Class: BSCS-12-B-2K22
    Object Oriented Programming
    Assignment # 2
    Calculator in JAVA          */

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI implements ActionListener
{
    private JFrame frame;
    private JTextField textField;
    private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, addButton, subtractButton, multiplyButton, divideButton, clearButton, equalsButton;
    private JPanel panel;
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;
    public CalculatorGUI()
    {
        // Frame
        frame = new JFrame("Calculator");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        // Text Field
        textField = new JTextField();
        textField.setBounds(50, 100, 200, 30);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        // Panel
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        // 1
        button1 = new JButton("1");
        button1.addActionListener(this);
        panel.add(button1);
        // 2
        button2 = new JButton("2");
        button2.addActionListener(this);
        panel.add(button2);
        // 3
        button3 = new JButton("3");
        button3.addActionListener(this);
        panel.add(button3);
        // Addition
        addButton = new JButton("+");
        addButton.addActionListener(this);
        panel.add(addButton);
        // 4
        button4 = new JButton("4");
        button4.addActionListener(this);
        panel.add(button4);
        // 5
        button5 = new JButton("5");
        button5.addActionListener(this);
        panel.add(button5);
        // 6
        button6 = new JButton("6");
        button6.addActionListener(this);
        panel.add(button6);
        // Subtraction
        subtractButton = new JButton("-");
        subtractButton.addActionListener(this);
        panel.add(subtractButton);
        // 7
        button7 = new JButton("7");
        button7.addActionListener(this);
        panel.add(button7);
        // 8
        button8 = new JButton("8");
        button8.addActionListener(this);
        panel.add(button8);
        // 9
        button9 = new JButton("9");
        button9.addActionListener(this);
        panel.add(button9);
        // Multiplication
        multiplyButton = new JButton("*");
        multiplyButton.addActionListener(this);
        panel.add(multiplyButton);
        // Clear Screen
        clearButton = new JButton("C");
        clearButton.addActionListener(this);
        panel.add(clearButton);
        // 0
        button0 = new JButton("0");
        button0.addActionListener(this);
        panel.add(button0);
        // Equals
        equalsButton = new JButton("=");
        equalsButton.addActionListener(this);
        panel.add(equalsButton);
        // Division
        divideButton = new JButton("/");
        divideButton.addActionListener(this);
        panel.add(divideButton);
        // Frame Settings
        frame.add(textField, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == button1)
            textField.setText(textField.getText() + "1");
        else if (e.getSource() == button2)
            textField.setText(textField.getText() + "2");
        else if (e.getSource() == button3)
            textField.setText(textField.getText() + "3");
        else if (e.getSource() == button4)
            textField.setText(textField.getText() + "4");
        else if (e.getSource() == button5)
            textField.setText(textField.getText() + "5");
        else if (e.getSource() == button6)
            textField.setText(textField.getText() + "6");
        else if (e.getSource() == button7)
            textField.setText(textField.getText() + "7");
        else if (e.getSource() == button8)
            textField.setText(textField.getText() + "8");
        else if (e.getSource() == button9)
            textField.setText(textField.getText() + "9");
        else if (e.getSource() == button0)
            textField.setText(textField.getText() + "0");
        else if (e.getSource() == clearButton)
        {
            textField.setText("");
            num1 = 0;
            num2 = 0;
            result = 0;
        } else if (e.getSource() == addButton)
        {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        } else if (e.getSource() == subtractButton)
        {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        } else if (e.getSource() == multiplyButton)
        {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        } else if (e.getSource() == divideButton)
        {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        } else if (e.getSource() == equalsButton)
        {
            num2 = Double.parseDouble(textField.getText());
            switch (operator)
            {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    result = 0;
                    break;
            }
            textField.setText(Double.toString(result));
            num1 = result;
            num2 = 0;
            result = 0;
        }
    }
    public static void main(String[] args) {new CalculatorGUI();}
}