package Title;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

import ObjectReference.Frame;

import java.awt.Font;
import java.awt.Color;

import java.awt.event.ActionListener;

public class MenuBar {

    private static JMenuBar menuBar;

    private static void item(String name, ActionListener action, int mnemonic) {

        JMenuItem menuItem = new JMenuItem(name);
        menuItem.addActionListener(action);
        menuItem.setFont(new Font("Open Sans", Font.ITALIC, 14));
        menuItem.setMnemonic(mnemonic);
        menuBar.add(menuItem);

    }

    private static void item(String name, ActionListener action, JMenu menu){

        JMenuItem menuItem = new JMenuItem(name);
        menuItem.addActionListener(action);
        menuItem.setFont(new Font("Open Sans", Font.ITALIC, 14));
        menuItem.setBackground(Color.WHITE);
        menu.add(menuItem);
    }

    public MenuBar(Frame frame){

        menuBar = new JMenuBar();
        menuBar.setVisible(true);
        frame.setJMenuBar(menuBar);

        item("Guess the element", e -> new GuessTheElement(), 0x47);
        item("Find", e -> new Find(), 0x46);
        item("Group", e -> new Groups.About(), 0x52);
        item("Period", e -> new Periods.About(), 0x50);
        item("About", e -> new Title.About(), 0x41);

        JMenu help = new JMenu("Help");
        menuBar.add(help);

        item("Definitions", e -> new Definition(), help);
        item("Activity series", e -> new ActivitySeries(), help);
        item("Electron Orbitals", e -> new ElectronOrbitals(), help);
    }
}
