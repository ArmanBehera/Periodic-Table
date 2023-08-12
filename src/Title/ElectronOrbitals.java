package Title;

import ObjectReference.Frame;

import javax.swing.*;
import java.awt.*;

public class ElectronOrbitals {

    ElectronOrbitals(){

        Frame frame = new Frame(new Dimension(500, 350), "Electron Orbitals");

        JLabel label = new JLabel();
        label.setBounds(0, 0, 500, 350);
        label.setIcon(new ImageIcon(ClassLoader.getSystemResource("Electron_Orbitals.png")));
        frame.add(label);

        frame.setVisible(true);
    }
}