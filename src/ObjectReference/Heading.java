package ObjectReference;

import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Color;

public class Heading {

    public Heading(Frame frame, String text, Rectangle bounds){

        JLabel heading = new JLabel(text);
        heading.setFont(new Font("Roboto", Font.ITALIC, 25));
        heading.setBounds(bounds);
        heading.setForeground(new Color(0x0099ff));
        frame.add(heading);
    }
}
