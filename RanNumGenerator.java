import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

/*
 Author: Siya Agrawal
 Date: 29/09/22
 Email: siya02.agrawal@gmail.com
 Published on: 2022,July,Thrusday
 Description: A Random Number Generator using Swing (JAVA) that takes the upper limit 
 and lower limit, generates a random number and gives the output.
 */

class RandomNumberGenerator extends JFrame {
    //variable creations
    JLabel upperLimitLabel;
    JTextField textfield1;
    JLabel lowerLimitLabel;
    JTextField textfield2, textfield3;
    JButton buttonInt, buttonDouble, buttonLong;
    JLabel outputLabel;

    public RandomNumberGenerator() {
        setTitle("Random Number Generator");
        setResizable(false);
        setLayout(new FlowLayout());

        upperLimitLabel = new JLabel("Enter the upper limit:");
        textfield1 = new JTextField(8);

        lowerLimitLabel = new JLabel("Enter the lower limit:");
        textfield2 = new JTextField(8);

        buttonInt = new JButton("Int");
        buttonDouble = new JButton("Double");
        buttonLong = new JButton("Long");

        outputLabel = new JLabel("Random No:");
        textfield3 = new JTextField(15);

        //adding the elements to the frame
        add(upperLimitLabel);
        add(textfield1);
        add(lowerLimitLabel);
        add(textfield2);
        add(buttonInt);
        add(buttonDouble);
        add(buttonLong);
        add(outputLabel);
        add(textfield3);

        buttonInt.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                Random randomObject = new Random();
                double firstNumber = Double.parseDouble(textfield1.getText());
                double secondNumber = Double.parseDouble(textfield2.getText());

                int value = (int) randomObject.doubles(firstNumber, secondNumber).findFirst().getAsDouble();
                textfield3.setText("" + value);
            }
        });

        buttonDouble.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                Random randomObject = new Random();
                double firstNumber = Double.parseDouble(textfield1.getText());
                double secondNumber = Double.parseDouble(textfield2.getText());

                Double value = randomObject.doubles(firstNumber, secondNumber).findFirst().getAsDouble();
                textfield3.setText("" + value);
            }
        });

        buttonLong.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                Random randomObject = new Random();
                double firstNumber = Double.parseDouble(textfield1.getText());
                double secondNumber = Double.parseDouble(textfield2.getText());

                Long value = (long) randomObject.doubles(firstNumber, secondNumber).findFirst().getAsDouble();
                textfield3.setText("" + value);
            }
        });

        setVisible(true);
        setSize(250, 170);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

}
public class RanNumGenerator {
    public static void main(String[] args) {
        {
            new RandomNumberGenerator();
        }
    }
}
