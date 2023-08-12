package ObjectReference;

// A class that provides a text area for the information class

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Rectangle;

public class TextArea {

    public JTextArea text;

    public TextArea(JFrame frame, String line, int x, int y){

        text = new JTextArea(line);
        text.setFont(new Font("Scheherazade New", Font.PLAIN, 15));
        text.setBounds(x, y, frame.getWidth() - 40, 20);
        text.setEditable(false);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setBackground(frame.getContentPane().getBackground());
        frame.add(text);
    }

    public TextArea(JFrame frame, String[] lines, int x, int y){

        for (String line : lines){

            text = new JTextArea(line);
            text.setFont(new Font("Scheherazade New", Font.PLAIN, 14));
            text.setBounds(x, y, frame.getWidth() - 40, 40);
            text.setEditable(false);
            text.setLineWrap(true);
            text.setWrapStyleWord(true);
            text.setBackground(frame.getContentPane().getBackground());
            frame.add(text);

            y += 40;
        }
    }

    public TextArea(JFrame frame, String line, Rectangle bounds){

        text = new JTextArea(line);
        text.setFont(new Font("Scheherazade New", Font.PLAIN, 15));
        text.setBounds(bounds);
        text.setEditable(false);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setBackground(frame.getContentPane().getBackground());
        frame.add(text);
    }
}