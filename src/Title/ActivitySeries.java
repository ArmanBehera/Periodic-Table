package Title;

import ObjectReference.Frame;

import javax.swing.*;
// import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ActivitySeries {

    ActivitySeries(){

        Frame frame = new Frame(new Dimension(560, 370), "Activity Series");

        /* JLabel label = new JLabel();
        label.setBounds(0, 0, 540, 1500);
        label.setIcon(new ImageIcon(ClassLoader.getSystemResource("ActivitySeries.png")));
        frame.add(label); */

        String[] columnNames = new String[]{"Metal", "Ion", "Reactivity", "Extraction"};
        String[][] data = new String[][]{{"Li", "Li⁺", "Reacts with water", "Electrolysis"},
                {"Potassium", "K⁺", "Reacts with water", "Electrolysis"},
                {"Barium", "Ba⁺", "Reacts with water", "Electrolysis"},
                {"Calcium", "Ca⁺⁺", "Reacts with water", "Electrolysis"},
                {"Sodium", "Na⁺", "Reacts with water", "Electrolysis"},
                {"Magnesium", "Mg⁺⁺", "Reacts with dilute acid", "Electrolysis"},
                {"Aluminium", "Al⁺⁺⁺", "Reacts with dilute acid", "Electrolysis"},
                {"Carbon", "C", "", ""},
                {"Zinc", "Zn⁺⁺", "Reacts with dilute acid", "Burning with carbon"},
                {"Iron", "Fe⁺⁺", "Reacts with dilute acid", "Burning with carbon"},
                {"Nickel", "Ni⁺⁺", "Reacts with dilute acid", "Burning with carbon"},
                {"Tin", "Sn⁺⁺", "Reacts with dilute acid", "Burning with carbon"},
                {"Lead", "Pb⁺⁺", "Reacts with dilute acid", "Burning with carbon"},
                {"Hydrogen", "H", "", ""},
                {"Copper", "Cu⁺⁺", "Reacts with oxygen", "Burning in air"},
                {"Mercury", "Hg⁺⁺", "Reacts with oxygen", "Burning in air"},
                {"Silver", "Ag⁺", "Reacts with oxygen", "No extraction required"},
                {"Gold", "Au⁺⁺⁺", "Highly unreactive", "No extraction required"},
                {"Platinum", "Pt⁺⁺⁺⁺", "Highly unreactive", "No extraction required"},
        };

        JTable table = new JTable(data, columnNames);
        table.setBounds(20, 10, 560, 370);
        table.setRowSelectionAllowed(false);
        table.removeEditor();
        table.setCellSelectionEnabled(false);
        table.setFont(new Font("", Font.PLAIN, 14));

        /*DefaultTableModel tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        table.setModel(tableModel); */

        JScrollPane pane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        pane.setBounds(0, 0, 542, 650);
        frame.add(pane);

        /* String[] lines = new String[]{"An activity series (or reactivity series) is an empirical, calculated and structurally analytical progression of a series of metals, arranged by their \"reactivity\" from highest to lowest.",
        ""}; */

        frame.setVisible(true);
    }
}
