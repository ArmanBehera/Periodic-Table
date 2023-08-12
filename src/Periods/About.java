package Periods;

import ObjectReference.TextArea;
import ObjectReference.Frame;

import javax.swing.*;

import java.awt.Font;
import java.awt.Dimension;

public class About {

    public About(){

        Frame frame = new Frame(new Dimension(800, 700), "About Periods");

        String[] lines = {"• A period in the periodic table is a horizontal row of chemical elements. All elements in a row have the same number of electron shells.",
                "• Each next element in a period has one more proton and is less metallic than its predecessor.",
                "• There are currently seven complete periods in the periodic table, comprising the 118 known elements.",
                "• A new period begins when a new principal energy level begins filling with electrons.",
                "• The lanthanides (lanthanum, 57, to lutetium, 71) and the actinides (actinium, 89, to lawrencium, 103) indicated separately below the periodic table.",
                "• The periods are of various length, with the shortest being the first period comprising of only 2 elements and the longest being the sixth and seventh period comprising of 32 elements each."
        };

        String[][] periodLines = {{"• Period 1 is one of the horizontal rows in the periodic table, comprising of only 2 elements.", "• It consists of Hydrogen(H) and Helium(He)","• It is the shortest period in the periodic table.", "• The elements of this period have 1 shell.", "• Period 1 elements obey the duet rule i.e. they need two electrons to complete their valence shell.", "• Period 1, which only contains two elements (hydrogen and helium), is too small to draw any conclusive trends from it."},
                {"• Period 2 is one of the horizontal rows in the periodic table, comprising of 8 elements.", "• It contains the elements lithium, beryllium, boron, carbon, nitrogen, oxygen, fluorine, and neon.","• It is the second shortest period in the periodic table.", "• The elements of this period have 2 shells.", "• They obey the octet rule i.e. They need 8 electrons to fill their valence shell(lithium and beryllium follow duet rule, boron is electron deficient).", "• Period 2 is the first period in the periodic table from which periodic trends can be drawn.", "• The atomic number increases, the atomic radius of the elements decreases, the electronegativity increases, and the ionization energy increases."},
                {"• Period 3 is one of the horizontal rows in the periodic table, comprising of 8 elements.", "• It contains the elements sodium, magnesium, aluminium, silicon, phosphorus, sulfur, chlorine, and argon.","• It is the second shortest period in the periodic table.", "• The elements of this period have 3 shells.", "• Period 3 elements play a major biological role. ", "• When moving from left to right, atomic radius decreases, first ionisation energy increases, electronegativity increases.", "Elements on the left are metals, elements on the right are non-metals."},
                {"• Period 4 is one of the horizontal rows in the periodic table, comprising of 18 elements.", "• Period 4 starts with potassium and ends with Krypton.", "• It is the second longest period in the periodic table.","• The elements of this period have 4 shells.", "• Every single one of these elements is stable and many are extremely common in the Earth's crust.", "• Many of the transition metals in period 4 are very strong, and therefore commonly used in industry, especially iron.", "• Many period 4 elements function as secondary messengers, structural components, or enzyme cofactors."},
                {"• Period 5 is one of the horizontal rows in the periodic table, comprising of 18 elements.", "• Period 5 starts with Rubidium and ends with Xenon.", "• It is the second longest period in the periodic table.", "• The elements of this period have 5 shells.", "• This period is known to have a large number of exceptions to the Madelung rule.", "• Period 5 elements fill their 5s shells first, then their 4d, and 5p shells, however there are exceptions, such as rhodium.", "• Molybdenum and iodine are used in biological roles. Mo is used in enzymes as catalysts to break atmospheric nitrogen", "• allowing nitrogen fixation. Iodine is required by higher animals to synthesize thyroid hormones."},
                {"• Period 6 is one of the horizontal rows in the periodic table, comprising of 32 elements.", "• Period 6 starts with Caesium and Radon.", "• It it the longest period in the periodic table.", "• The elements of this period have 6 shells.", "• Of the period 6 elements, only tungsten is known to have any biological role in organisms.", "• However, gold, platinum, mercury, and some lanthanides such as gadolinium have applications as drugs."},
                {"• Period 7 is one of the horizontal rows in the periodic table, comprising of 32 elements.", "• Period 7 starts with Francium and Oganesson.", "• It it the longest period in the periodic table.", "• The elements of this period have 7 shells.", "• All elements of period 7 are radioactive. This period contains the actinide series.", "• The element's periodic and group trends are less well defined than other periods."}
        };

        new TextArea(frame, lines, 20, 20);

        new TextArea(frame, lines, 20, 20);

        JComboBox<String> periodComboBox = new JComboBox<>(new String[]{"Period 1", "Period 2", "Period 3", "Period 4", "Period 5", "Period 6", "Period 7"});
        periodComboBox.setFocusable(false);
        periodComboBox.setBounds(20, 450, 150, 40);
        frame.add(periodComboBox);

        JButton submit = new JButton("Submit");
        submit.setFocusable(false);
        submit.setBounds(200, 450, 80, 40);
        submit.setFont(new Font("Open Sans", Font.PLAIN, 14));
        frame.add(submit);
        submit.addActionListener(e -> {

            int n = periodComboBox.getSelectedIndex() + 1;

            new Period("Period " + n, periodLines[n - 1]);
        });

        frame.setVisible(true);
    }
}
