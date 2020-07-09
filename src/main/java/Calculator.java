import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

        JLabel ltemperatureInCelsius, ltemperatureInFahrenheit;
        JTextField tFahrenheit, tCelsius;
        JButton bCount, bExit;
        double tempCelsius, tempFahrenheit;

        //the frame
        public Calculator() {
            super("calculator Celsius Fahrenheit");
            this.setBounds(50, 50, 500, 400);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(null);


            ltemperatureInCelsius = new JLabel("Celsius degree");
            ltemperatureInCelsius.setBounds(50, 50, 120, 50);
            add(ltemperatureInCelsius);


            ltemperatureInFahrenheit = new JLabel("Fahrenheit degree");
            ltemperatureInFahrenheit.setBounds(50, 100, 120, 50);
            add(ltemperatureInFahrenheit);


            tCelsius = new JTextField("");
            tCelsius.setBounds(200, 50, 100, 50);
            add(tCelsius);


            tFahrenheit = new JTextField("");
            tFahrenheit.setBounds(200, 100, 100, 50);
            add(tFahrenheit);


            bCount = new JButton("Count");
            bCount.setBounds(200, 200, 100, 50);
            add(bCount);
            bCount.addActionListener(this);

            bExit = new JButton("Exit");
            bExit.setBounds(200, 250, 100, 50);
            add(bExit);
            bExit.addActionListener(this);

        }

        public static void main(String[] args) {
            new Calculator().setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Object zr = e.getSource();
            if (bExit == zr) {
                dispose();
            } else if (bCount == zr) {
                tempCelsius = Double.parseDouble(tCelsius.getText());
                tempFahrenheit = (32.0 + (9.0 / 5.0) * tempCelsius);
                tFahrenheit.setText(String.valueOf(tempFahrenheit));
            }
        }
    }

