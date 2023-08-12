package ObjectReference;

// Swing components
import Information.InfoScreen;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

// AWT components
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Color;

import static Reference.Reference.*;

public class Element {

    public JPanel mainPanel;
    public JTextArea symbolText;
    public JButton button;
    public JPanel namePanel;
    public JLabel nameLabel;

    // A button blueprint that takes the frame to which the button will be added, the place where the button will be placed and the atomic number of the element
    // from which the other properties will be gathered
    public Element(Frame frame, Rectangle bounds, int atomicNumber){

        int color = colorRef[typeRef[atomicNumber]];

        mainPanel = new JPanel();
        mainPanel.setBounds(bounds);
        mainPanel.setLayout(null);
        mainPanel.setBackground(new Color(color));
        frame.add(mainPanel);

        symbolText = new JTextArea();
        symbolText.setBounds(0, 0, mainPanel.getWidth(), 15);
        symbolText.setBackground(new Color(color));
        symbolText.setBorder(null);
        symbolText.setSelectionColor(new Color(color));
        symbolText.setEditable(false);
        symbolText.setFont(new Font("Scheherazade New", Font.PLAIN, 10));
        mainPanel.add(symbolText);

        // If the state of the element is known
        if (stateRef[atomicNumber] != '0'){

            symbolText.setText("  "+atomicNumber +"         "+ stateRef[atomicNumber]);
        } else {

            symbolText.setText(atomicNumber + "");
        }

        button = new JButton();
        button.setText(symbolRef[atomicNumber]);
        button.setFocusable(false);
        button.setFont(new Font("MV Boli", Font.PLAIN, 20));
        button.setBorder(null);
        button.setBackground(new Color(color));
        button.setBounds(0, 14, mainPanel.getWidth(), 36);
        mainPanel.add(button);
        button.addActionListener(e -> new InfoScreen(atomicNumber));


        namePanel = new JPanel();
        namePanel.setBounds(0, 50, mainPanel.getWidth(), 20);
        namePanel.setBorder(null);
        namePanel.setBackground(new Color(color));
        mainPanel.add(namePanel);

        nameLabel = new JLabel();
        nameLabel.setFont(new Font("Didot", Font.ITALIC, 10));
        nameLabel.setText(fullNameRef[atomicNumber]);
        nameLabel.setBackground(new Color(color));
        nameLabel.setVerticalAlignment(JLabel.CENTER);
        namePanel.add(nameLabel);
    }

    public void changeColor(int color){

        mainPanel.setBackground(new Color(color));
        symbolText.setBackground(new Color(color));
        button.setBackground(new Color(color));
        namePanel.setBackground(new Color(color));
        nameLabel.setBackground(new Color(color));
    }
}
