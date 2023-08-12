package ReferencePanel;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Font;

import static Reference.Reference.colorRefBlocks;
import ObjectReference.Frame;

public class BlockColorReference {

    private final JPanel colorPanel;
    private final JLabel colorText;

    public BlockColorReference(Frame frame, Rectangle bounds, int type, String info, int font){

            colorPanel = new JPanel();
            colorPanel.setBounds(bounds.x, bounds.y, 15, 15);
            colorPanel.setVisible(false);
            colorPanel.setBackground(new Color(colorRefBlocks[type]));
            frame.add(colorPanel);

            colorText = new JLabel();
            colorText.setText(info);
            colorText.setFont(new Font("Didot", Font.ITALIC, font));
            colorText.setVisible(false);
            colorText.setBounds(bounds.x + 20, bounds.y - 2, 100, 20);
            frame.add(colorText);
    }

    public void hide(){

        colorPanel.setVisible(false);
        colorText.setVisible(false);
    }

    public void show(){

        colorPanel.setVisible(true);
        colorText.setVisible(true);
    }
}
