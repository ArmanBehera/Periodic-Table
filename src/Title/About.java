package Title;

import ObjectReference.*;
import java.awt.Rectangle;
import java.awt.Dimension;

public class About {

    About(){

        Frame frame = new Frame(new Dimension(700, 600), "About Periodic Table");

        String[] lines = {"• The periodic table, also known as the periodic table of (the) chemical elements, is a tabular display of the chemical elements.",
                "• The first periodic table was first created by a Russian Chemist, Dmitriv Mendeleev in 1869.",
                "• It is widely used in chemistry, physics, and other sciences, and is generally seen as an icon of chemistry.",
                "• It is a graphic formulation of the periodic law, which states that physical and chemical properties are the periodic functions of their atomic numbers.",
                "• The table is divided into four roughly rectangular areas called blocks.",
                "• The rows of the table are called periods, and the columns are called groups.",
                "• Elements from the same column group of the periodic table show similar chemical characteristics.",
                "• Trends run through the periodic table, with nonmetallic character increasing from left to right across a period, and from down to up across a group.",
                "• As not all elements were then known, there were gaps in his periodic table, and Mendeleev successfully used the periodic law to predict properties of some of the missing elements."
        };

        new Heading(frame, "About Modern Periodic Table", new Rectangle(10, 10, 350, 30));

        new TextArea(frame, lines, 20, 60);

        new Heading(frame, "Defects of Modern Periodic Table", new Rectangle(10, 450, 450, 40));

        new TextArea(frame, new String[]{"The position of Hydrogen in not satisfactory, as it has characteristics similar to Halogens and Alkali Metals.", "It fails to accommodate the lanthanide and the actinide series in the main body of the periodic table."}, 20, 500);

        frame.setVisible(true);
    }
}
