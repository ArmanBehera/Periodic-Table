package ReferencePanel;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Color;

import ObjectReference.Frame;
import static Reference.Reference.colorRef;

public class ColorReferencePanel {

    public JPanel colorPanel;
    public JLabel colorText;

    public ColorReferencePanel(Frame frame, Rectangle bounds, int type, String info, int font){

        colorPanel = new JPanel();
        colorPanel.setBounds(bounds.x, bounds.y, 15, 15);
        colorPanel.setBackground(new Color(colorRef[type]));
        colorPanel.setVisible(true);
        frame.add(colorPanel);

        colorText = new JLabel();
        colorText.setText(info);
        colorText.setFont(new Font("Didot", Font.ITALIC, font));
        colorText.setBounds(bounds.x + 20, bounds.y - 2, 100, 20);
        colorText.setVisible(true);
        frame.add(colorText);
    }

    public void hide(){

        // If the color reference panels are hidden, then block color ref panels will be shown
        colorPanel.setVisible(false);
        colorText.setVisible(false);
    }

    public void show(){

        colorPanel.setVisible(true);
        colorText.setVisible(true);
    }
}
