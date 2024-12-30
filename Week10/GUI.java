import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Integer Division");
        frame.setSize(250, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextField num1Field = new JTextField(10);
        JTextField num2Field = new JTextField(10);
        JTextField resultField = new JTextField(10);
        resultField.setEditable(false); 
        JButton divideButton = new JButton("Divide");

        frame.add(new JLabel("Num1:"));
        frame.add(num1Field);
        frame.add(new JLabel("Num2:"));
        frame.add(num2Field);
        frame.add(divideButton);
        frame.add(new JLabel("Result:"));
        frame.add(resultField);

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Integer.parseInt(num1Field.getText());
                    double num2 = Integer.parseInt(num2Field.getText());
                    if(num2==0) throw new ArithmeticException();
                    double result = num1 / num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid integers.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame, "Cannot divide by zero.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}
