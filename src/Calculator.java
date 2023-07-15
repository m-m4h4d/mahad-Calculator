import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator implements ActionListener{
    JFrame JF = new JFrame();
    JTextField JTF = new JTextField();
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonAdd = new JButton("+");
    JButton buttonSubtract = new JButton("-");
    JButton buttonMultiply = new JButton("*");
    JButton buttonDivide = new JButton("/");
    JButton buttonClear = new JButton("CLEAR");
    JButton buttonPoint = new JButton(".");
    JButton buttonEqual = new JButton("=");
    JButton buttonDel = new JButton("DELETE");
    static double a = 0, b = 0, result = 0;
    static int operator = 0;
    public Calculator(){
        JF.setBounds(20, 20, 300, 350);
        JF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JF.setVisible(true);
        JF.setTitle("My Calculator in Java");
        JF.setResizable(false);
        JF.setLayout(null);
        JF.setBackground(Color.blue);
        Font font = new Font("arial", Font.BOLD, 20);
        JTF.setFont(font);
        JTF.setBackground(Color.BLACK);
        JTF.setForeground(Color.WHITE);
        JTF.setBounds(40, 40, 200, 50);
        button7.setBounds(40, 100, 50, 40);
        button8.setBounds(90, 100, 50, 40);
        button9.setBounds(140, 100, 50, 40);
        buttonDivide.setBounds(190, 100, 50, 40);
        button4.setBounds(40, 140, 50, 40);
        button5.setBounds(90, 140, 50, 40);
        button6.setBounds(140, 140, 50, 40);
        buttonMultiply.setBounds(190, 140, 50, 40);
        button1.setBounds(40, 180, 50, 40);
        button2.setBounds(90, 180, 50, 40);
        button3.setBounds(140, 180, 50, 40);
        buttonSubtract.setBounds(190, 180, 50, 40);
        buttonPoint.setBounds(40, 220, 50, 40);
        button0.setBounds(90, 220, 50, 40);
        buttonEqual.setBounds(140, 220, 50, 40);
        buttonAdd.setBounds(190, 220, 50, 40);
        buttonClear.setBounds(40, 260, 100, 40);
        buttonDel.setBounds(140, 260, 100, 40);
        JF.add(button0);
        JF.add(button1);
        JF.add(button2);
        JF.add(buttonAdd);
        JF.add(button3);
        JF.add(button4);
        JF.add(button5);
        JF.add(buttonSubtract);
        JF.add(button6);
        JF.add(button7);
        JF.add(button8);
        JF.add(buttonMultiply);
        JF.add(button9);
        JF.add(buttonPoint);
        JF.add(buttonEqual);
        JF.add(buttonDivide);
        JF.add(buttonClear);
        JF.add(buttonDel);
        button0.addActionListener((ActionListener)this);
        button1.addActionListener((ActionListener)this);
        button2.addActionListener((ActionListener)this);
        button3.addActionListener((ActionListener)this);
        button4.addActionListener((ActionListener)this);
        button5.addActionListener((ActionListener)this);
        button6.addActionListener((ActionListener)this);
        button7.addActionListener((ActionListener)this);
        button8.addActionListener((ActionListener)this);
        button9.addActionListener((ActionListener)this);
        buttonMultiply.addActionListener((ActionListener)this);
        buttonDivide.addActionListener((ActionListener)this);
        buttonAdd.addActionListener((ActionListener)this);
        buttonSubtract.addActionListener((ActionListener)this);
        buttonEqual.addActionListener((ActionListener)this);
        buttonClear.addActionListener((ActionListener)this);
        buttonPoint.addActionListener((ActionListener)this);
        buttonDel.addActionListener((ActionListener)this);}
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button0) JTF.setText(JTF.getText().concat("0"));
        if(e.getSource() == button1) JTF.setText(JTF.getText().concat("1"));
        if(e.getSource() == button2) JTF.setText(JTF.getText().concat("2"));
        if(e.getSource() == button3) JTF.setText(JTF.getText().concat("3"));
        if(e.getSource() == button4) JTF.setText(JTF.getText().concat("4"));
        if(e.getSource() == button5) JTF.setText(JTF.getText().concat("5"));
        if(e.getSource() == button6) JTF.setText(JTF.getText().concat("6"));
        if(e.getSource() == button7) JTF.setText(JTF.getText().concat("7"));
        if(e.getSource() == button8) JTF.setText(JTF.getText().concat("8"));
        if(e.getSource() == button9) JTF.setText(JTF.getText().concat("9 "));
        if(e.getSource() == buttonAdd){
            a = Double.parseDouble(JTF.getText());
            operator = 1;
            JTF.setText("");}
        if(e.getSource() == buttonSubtract){
            a = Double.parseDouble(JTF.getText());
            operator = 2;
            JTF.setText("");}
        if(e.getSource() == buttonMultiply){
            a = Double.parseDouble(JTF.getText());
            operator = 3;
            JTF.setText("");}
        if(e.getSource() == buttonDivide){
            a = Double.parseDouble(JTF.getText());
            operator = 4;
            JTF.setText("");}
        if(e.getSource() == buttonEqual){
            b = Double.parseDouble(JTF.getText());
            switch (operator){
                case 1: result = a + b; break;
                case 2: result = a - b; break;
                case 3: result = a * b; break;
                case 4: result = a / b; break;}
            JTF.setText("" + result);}
        if(e.getSource() == buttonClear)
            JTF.setText("");
        if(e.getSource() == buttonDel){
            String currentString;
            currentString = JTF.getText();
            JTF.setText("");
            for(int counter = 0; counter < currentString.length() -1; counter++)
                JTF.setText(JTF.getText() + currentString.charAt(counter));}}
    public static void main(String[] args){new Calculator();}}