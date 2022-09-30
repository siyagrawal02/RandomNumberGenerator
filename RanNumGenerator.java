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

class RNG extends JFrame {
    //variable creations
    JLabel label1;
    JTextField textfield1;
    JLabel label2;
    JTextField textfield2, textfield3;
    JButton bInt, bDouble, bLong;
    JLabel label3;

    public RNG() {
        setTitle("Random Number Generator");
        setResizable(false);
        setLayout(new FlowLayout());

        label1 = new JLabel("Enter the upper limit:");
        textfield1 = new JTextField(8);

        label2 = new JLabel("Enter the lower limit:");
        textfield2 = new JTextField(8);

        bInt = new JButton("Int");
        bDouble = new JButton("Double");
        bLong = new JButton("Long");

        label3 = new JLabel("Random No:");
        textfield3 = new JTextField(15);

        //adding the elements to the frame
        add(label1);
        add(textfield1);
        add(label2);
        add(textfield2);
        add(bInt);
        add(bDouble);
        add(bLong);
        add(label3);
        add(textfield3);

        bInt.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                Random randomObject = new Random();
                double num1 = Double.parseDouble(textfield1.getText());
                double num2 = Double.parseDouble(textfield2.getText());

                int value = (int) randomObject.doubles(num1, num2).findFirst().getAsDouble();
                textfield3.setText("" + value);
            }
        });

        bDouble.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                Random randomObject = new Random();
                double num1 = Double.parseDouble(textfield1.getText());
                double num2 = Double.parseDouble(textfield2.getText());

                Double value = randomObject.doubles(num1, num2).findFirst().getAsDouble();
                textfield3.setText("" + value);
            }
        });

        bLong.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                Random randomObject = new Random();
                double num1 = Double.parseDouble(textfield1.getText());
                double num2 = Double.parseDouble(textfield2.getText());

                Long value = (long) randomObject.doubles(num1, num2).findFirst().getAsDouble();
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
            new RNG();
        }
    }
}
