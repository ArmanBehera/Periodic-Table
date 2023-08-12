package ObjectReference;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Color;

public class Frame extends JFrame {

    public Frame(Dimension d, String title){

        this.setSize(d);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle(title);

        if (title.equals("Periodic Table")) {

            this.getContentPane().setBackground(Color.LIGHT_GRAY);
            if (ClassLoader.getSystemResource("Images/PeriodicTableReference.png") != null)
                this.setIconImage(new ImageIcon(ClassLoader.getSystemResource("Images/PeriodicTableReference.png")).getImage());
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
