package Title;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Rectangle;
import java.awt.Font;

import java.awt.event.ActionListener;

public class Button {

    Button(JPanel titleBar, String text, Rectangle loc, ActionListener actionListener){

        JButton button = new JButton(text);
        button.setBounds(loc);
        button.setFont(new Font("Scheherazade New", Font.ITALIC, 12));
        button.setBackground(titleBar.getBackground());
        button.setBorder(null);
        button.setFocusable(false);
        titleBar.add(button);
        button.addActionListener(actionListener);
    }
}
