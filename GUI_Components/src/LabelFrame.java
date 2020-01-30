import javax.swing.*;
import java.awt.*;

public class LabelFrame extends JFrame {

    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;

    public LabelFrame() throws HeadlessException {
        super("Test Label");
        setLayout(new FlowLayout());

        label1 = new JLabel("label with text");
        label1.setToolTipText("label1");
        add(label1);

        // null pointer error happening here
        //Icon icon = new ImageIcon(getClass().getResource("C:\\Users\\kevin\\Documents\\Learning Library\\Java\\IntelliJ\\GUI_Components\\sync.ico"));
        label2 = new JLabel("label2",  SwingConstants.LEFT);
        label2.setToolTipText("label2");
        add(label2);

        label3 = new JLabel();
        label3.setText("label3");
        //label3.setIcon(icon);
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setVerticalAlignment(SwingConstants.BOTTOM);


    }
}
