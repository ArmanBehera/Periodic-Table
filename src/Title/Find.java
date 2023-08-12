package Title;

import Information.InfoScreen;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.*;

import static Reference.Reference.fullNameRef;
import static Reference.Reference.symbolRef;

import ObjectReference.Frame;

public class Find {

    public Find(){

        boolean[] found = {false};
        final int[] indexFound = {0};

        Frame frame = new Frame(new Dimension(500, 200), "Find");

        JLabel example = new JLabel("The elements can be searched using their symbol or full name. Example : Na or Sodium");
        example.setBounds(10, 10, 500, 40);
        example.setFont(new Font("Didot", Font.BOLD, 10));
        frame.add(example);

        JTextField textField = new JTextField();
        textField.setBounds(10, 50, 460, 40);
        frame.add(textField);

        JButton search = new JButton("Search");
        search.setBounds(170, 100, 100, 40);
        search.setFocusable(false);
        search.setFont(new Font("Didot", Font.PLAIN, 15));
        frame.add(search);
        search.addActionListener(e -> {

            String text = textField.getText();

            for (int i = 1; i < 119; i++){

                if (fullNameRef[i].equals(text)) {

                    found[0] = true;
                    indexFound[0] = i;
                    break;
                }

                else if (symbolRef[i].equals(text)){

                    found[0] = true;
                    indexFound[0] = i;
                    break;
                }
            }

            // Opens the screen with the same atomic number as the text entered
            if (found[0]){

                new InfoScreen(indexFound[0]);
            } else {

                JOptionPane.showMessageDialog(null, "Enter a correct symbol!", "Incorrect name", JOptionPane.WARNING_MESSAGE);
            }
        });

        frame.setVisible(true);
    }
}
