import javax.swing.*;

/*
 Text Fields and an Introduction to Event Handling with the ActionListener interface Nested Classes
 video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson12_05
*/
public class TextFieldTest {
    public static void main(String[] args) {
        TextFieldFrame textFieldFrame = new TextFieldFrame();
        textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldFrame.setSize(50,100);
        textFieldFrame.setVisible(true);
    }
}
