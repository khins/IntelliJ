import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldFrame extends JFrame {
    private final JTextField textField1;
    private final JTextField textField2;
    private final JTextField textField3;
    private final JPasswordField passwordField;

    public TextFieldFrame() throws HeadlessException {
        super("testing JTextField and JPasswordField");
        setLayout(new FlowLayout());
        textField1 = new JTextField(10);
        add(textField1);
textField2 = new JTextField("Enter text here");
        add(textField2);
textField3 = new JTextField("uneditable text here", 21);
textField3.setEditable(false);
        add(textField3);
passwordField = new JPasswordField("Enter text here");
        add(passwordField);

        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);

    }

  private  class TextFieldHandler implements ActionListener {

      @Override
      public void actionPerformed(ActionEvent e) {
            String string = "";
            if (e.getSource() == textField1) {
                string = String.format("textField1: %s", e.getActionCommand());
            } else if (e.getSource() == textField2) {
                string = String.format("textfield2: %s", e.getActionCommand());
            }else if (e.getSource() == textField3) {
                string = String.format("textfield3: %s", e.getActionCommand());
            }else if (e.getSource() == passwordField) {
                string = String.format("passwordField", e.getActionCommand());
            }

            JOptionPane.showMessageDialog(null, string);
      }
  }
}



