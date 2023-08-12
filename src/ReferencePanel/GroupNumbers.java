package ReferencePanel;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Rectangle;

import ObjectReference.Frame;

public class GroupNumbers {

    public GroupNumbers(Frame frame, Rectangle bounds, int groupNumber){

        JLabel label = new JLabel();
        label.setText(groupNumber + "");
        label.setBounds(bounds);
        label.setFont(new Font("Didot", Font.PLAIN, 14));
        frame.add(label);
    }
}
