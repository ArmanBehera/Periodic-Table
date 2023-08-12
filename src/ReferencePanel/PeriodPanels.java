package ReferencePanel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.Border;

import java.awt.Rectangle;

import ObjectReference.Frame;

public class PeriodPanels {

    public PeriodPanels(Frame frame, int panelNumber, Rectangle bounds){

        JPanel panel = new JPanel();
        panel.setBounds(bounds);
        panel.setBackground(new Color(0x32a897));
        panel.setLayout(null);
        frame.add(panel);

        JLabel label = new JLabel(panelNumber + "");
        label.setBounds(23, 0, 50, 70);
        label.setFont(new Font("Didot", Font.PLAIN, 15));
        panel.add(label);
    }

    // For the lanthanide and actinide series
    public PeriodPanels(Frame frame, Rectangle bounds, String message){

        Border border = BorderFactory.createLineBorder(new Color(0x388073));

        JPanel panel = new JPanel();
        panel.setBounds(bounds);
        panel.setBackground(new Color(0x32a897));
        panel.setBorder(border);
        panel.setLayout(null);
        frame.add(panel);

        JLabel label = new JLabel(message);
        label.setBounds(23, 0, bounds.width, bounds.height);
        label.setFont(new Font("Didot", Font.ITALIC, 15));
        panel.add(label);
    }
}
