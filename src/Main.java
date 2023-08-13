// Importing all the packages

import ObjectReference.Element;
import ObjectReference.Frame;
import ObjectReference.Heading;
import ReferencePanel.BlockColorReference;
import ReferencePanel.ColorReferencePanel;
import ReferencePanel.GroupNumbers;
import ReferencePanel.PeriodPanels;

import javax.swing.JCheckBox;

import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Dimension;

import static Reference.Reference.*;

public class Main {

    private static final ColorReferencePanel[] colorRefPanel = new ColorReferencePanel[10];
    private static final BlockColorReference[] blockColorRef = new BlockColorReference[4];
    private static final Element[] elements = new Element[119];

    // The frame is declared globally for methods to access them
    private static final ObjectReference.Frame frame = new Frame(new Dimension(1250, 850),  "Periodic Table");

    private static void createReferencePanels(){

        // Color reference to different types of element
        // First column
        colorRefPanel[0] = new ColorReferencePanel(frame, new Rectangle(260, 80, 70, 20), 1, "Alkali metals", 12);
        colorRefPanel[1] = new ColorReferencePanel(frame, new Rectangle(260, 110, 70,20), 2, "Alkaline earth metals", 10);
        colorRefPanel[2] = new ColorReferencePanel(frame, new Rectangle(260, 140, 70, 20), 3, "Transition metals", 12);
        colorRefPanel[3] = new ColorReferencePanel(frame, new Rectangle(260, 170, 70, 20), 4, "Other metals", 12);
        colorRefPanel[4] = new ColorReferencePanel(frame, new Rectangle(260, 200, 70, 20), 5, "Other non-metals", 12);

        // Second column
        colorRefPanel[5] = new ColorReferencePanel(frame, new Rectangle(420, 80, 70, 20), 6, "Halogens", 12);
        colorRefPanel[6] = new ColorReferencePanel(frame, new Rectangle(420, 110, 70, 20), 7, "Noble gases", 12);
        colorRefPanel[7] = new ColorReferencePanel(frame, new Rectangle(420, 140, 70, 20), 8, "Rare-Earth Elements", 9);
        colorRefPanel[8] = new ColorReferencePanel(frame, new Rectangle(420, 170, 70, 20), 9, "Actinide elements", 12);
        colorRefPanel[9] = new ColorReferencePanel(frame, new Rectangle(420, 200, 70, 20), 10, "Metalloids", 12);
    }

    private static void createBlockColorPanels(){

        blockColorRef[0] = new BlockColorReference(frame, new Rectangle(260, 80, 70, 20), 1, "s - Block", 12);
        blockColorRef[1] = new BlockColorReference(frame, new Rectangle(260, 110, 70, 20), 2, "p - Block", 12);
        blockColorRef[2] = new BlockColorReference(frame, new Rectangle(260, 140, 70, 20), 3, "d - Block", 12);
        blockColorRef[3] = new BlockColorReference(frame, new Rectangle(260, 170, 70, 20), 4, "f - Block", 12);
    }

    // Hides the type elements color ref panels and shows the block elements color ref panels
    private static void hide(){

        for (int i = 0; i < 10; i++){

            colorRefPanel[i].hide();

            if (i < 4){

                blockColorRef[i].show();
            }
        }

        for (int i = 1; i <= 118; i++){

            int type = typeBlockRef[i];

            elements[i].changeColor(colorRefBlocks[type]);
        }
    }

    // Shows the type elements color ref panels and hides the block elements color ref panels
    private static void show(){

        for (int i = 0; i < 10; i++){

            colorRefPanel[i].show();

            if (i < 4){

                blockColorRef[i].hide();
            }
        }

        for (int i = 1; i <= 118; i++){

            int type = typeRef[i];

            elements[i].changeColor(colorRef[type]);
        }
    }

    private static void createElementPanels(){

        int width = 60, height = 70;

        // First period of the periodic table
        // Discretely done to avoid many for loops
        elements[1] = new Element(frame, new Rectangle(60, 110, width, height), 1);
        elements[2] = new Element(frame, new Rectangle(1140, 110, width, height), 2);

        // Second and third period
        // Done in the same loop as they have the same position and same number of elements
        int x = 60, y = 180;

        for (int i = 3; i <= 118; i++){

            elements[i] = new Element(frame, new Rectangle(x, y, width, height), i);
            x+= 60;

            // If the element is either Beryllium or Magnesium, then it gives a break
            if (i == 4 || i == 12)
                x += 660;

            // Changes the y co-ordinate for the third period
            if (i == 10 || i == 18 || i == 36 || i == 54 || i == 86 || i == 118) {
                // Changes the period
                y += 70;

                // Resets the position of x co-ordinate
                x = 60;
            }

            // Gives a space for transition elements
            if (i == 20 || i == 38 || i == 30 || i == 48 || i == 56 || i == 80 || i == 88 || i == 112)
                x += 30;

            if (i == 57)
                i = 71;

            if (i == 89)
                i = 103;
        }
    }

    // Creates the actinide and the lanthanide series of the periodic table
    private static void createSeries(){

        int width = 60, height = 70;
        int x = 210, y = 630;

        for (int i = 58; i <= 103; i++){

            elements[i] = new Element(frame, new Rectangle(x, y, width, height), i);
            x+= 60;

            // If the lanthanide series ends
            if (i == 71){

                // Changes the atomic number counter to 89 as the number will increment and change to 90
                i = 89;
                y += 70;

                // Resets the position of x;
                x = 210;
            }
        }
    }

    private static void createGroupNumbers(){

        new GroupNumbers(frame, new Rectangle(90, 80, 30, 30), 1);
        new GroupNumbers(frame, new Rectangle(150, 150, 30, 30), 2);
        new GroupNumbers(frame, new Rectangle(240, 290, 30, 30), 3);
        new GroupNumbers(frame, new Rectangle(300, 290, 30, 30), 4);
        new GroupNumbers(frame, new Rectangle(360, 290, 30, 30), 5);
        new GroupNumbers(frame, new Rectangle(420, 290, 30, 30), 6);
        new GroupNumbers(frame, new Rectangle(480, 290, 30, 30), 7);
        new GroupNumbers(frame, new Rectangle(540, 290, 30, 30), 8);
        new GroupNumbers(frame, new Rectangle(600, 290, 30, 30), 9);
        new GroupNumbers(frame, new Rectangle(650, 290, 30, 30), 10);
        new GroupNumbers(frame, new Rectangle(710, 290, 30, 30), 11);
        new GroupNumbers(frame, new Rectangle(770, 290, 30, 30), 12);
        new GroupNumbers(frame, new Rectangle(860, 150, 30, 30), 13);
        new GroupNumbers(frame, new Rectangle(920, 150, 30, 30), 14);
        new GroupNumbers(frame, new Rectangle(980, 150, 30, 30), 15);
        new GroupNumbers(frame, new Rectangle(1040, 150, 30, 30), 16);
        new GroupNumbers(frame, new Rectangle(1100, 150, 30, 30), 17);
        new GroupNumbers(frame, new Rectangle(1160, 80, 30, 30), 18);
    }

    private static void createPeriodPanels(){

        int y = 110;
        for (int i = 1; i <= 7; i++){

            new PeriodPanels(frame, i, new Rectangle(10, y, 50, 70));
            y += 70;
        }

        new PeriodPanels(frame, new Rectangle(50, 630, 160, 70), "Lanthanide series");
        new PeriodPanels(frame, new Rectangle(50, 700, 160, 70), "Actinide series");
    }

    public static void main(String[] args) {

        /* Element indexes start from index 1 (not 0)*/

        // Arrays that will contain the information about the elements
        // It contains 119 elements instead of 118 as the element index starts from 1

        // Title bar
        new Title.MenuBar(frame);

        new Heading(frame, "Modern Periodic Table", new Rectangle(10, 30, 300, 30));

        // Loads images of all elements
        loadImages();

        // Creating the reference panels for users to know the type of elements using the color
        createReferencePanels();
        createBlockColorPanels();

        // Creating the element buttons. When clicked, an information screen will pop up.
        createElementPanels();

        // Creates the lanthanide and actinide seres
        createSeries();

        // Creating the group numbers and the period panels
        createGroupNumbers();
        createPeriodPanels();

        JCheckBox checkBox = new JCheckBox();
        checkBox.setText("Categorize in Blocks");
        checkBox.setFocusable(false);
        checkBox.setBackground(frame.getContentPane().getBackground());
        checkBox.setBounds(1050, 50, 200, 20);
        frame.add(checkBox);
        checkBox.addActionListener(e -> {

            if(!checkBox.isSelected()){

                show();
            } else {

                hide();
            }
        });

        frame.setVisible(true);
    }
}