/*
 Simple GUI-Based Input/Output with JOptionPane
 video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson12_02
*/

import javax.swing.*;

public class Addition {
    public static void main(String[] args) {
        String firstNumber = JOptionPane.showInputDialog("Enter first number");
        String secondNumber = JOptionPane.showInputDialog("Enter second number");
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        int sum = number1 + number2;

        JOptionPane.showMessageDialog(null, "the sum is: " + sum, "Sum of 2 ints",JOptionPane.PLAIN_MESSAGE);
    }
}
